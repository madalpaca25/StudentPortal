package com.example.proj.action;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import com.example.proj.model.NewsResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opensymphony.xwork2.ActionSupport;

public class News extends ActionSupport {
    NewsResponse newsResponse = new NewsResponse();
    private String searchWord;
    private String myLanguage;
    private String mySort;

    String API_KEY = "a259bb544e404d15917a0b5a4e5fbf24";

    public String execute() throws Exception{
        String format = "yyyy-MM-dd";
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        String currentDate = dateFormat.format(calendar.getTime());
        try {
            URL url = new URL ("https://newsapi.org/v2/everything?language="+ getMyLanguage() +"&q="+getSearchWord() +"&searchIn=title,description&from="+ currentDate +"&sortBy="+getMySort()+"&apiKey=" + API_KEY);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode()); 
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            System.out.println("----------");
            System.out.println("SEARCHED WORD FROM SERVER \n: " + getSearchWord());
            System.out.println("SELECTED LANGUAGE FROM SERVER \n: " + getMyLanguage());
            System.out.println("SORT FROM SERVER \n: " + getMySort());
            System.out.println("----------");
            System.out.println("\n");
            String output;
            while ((output = br.readLine()) != null) {
                ObjectMapper mapper = new ObjectMapper();
                newsResponse = mapper.readValue(output, NewsResponse.class);
            }
            conn.disconnect();
       
        }catch (Exception e) {
            e.printStackTrace();
        }

        return SUCCESS;
    }

    public NewsResponse getNewsResponse() {
        return newsResponse;
    }

    public void setNewsResponse(NewsResponse newsResponse) {
        this.newsResponse = newsResponse;
    }
    
    public String getSearchWord() {
        return searchWord;
    }

    public void setSearchWord(String searchWord) {
        this.searchWord = searchWord;
    }

    public String getMyLanguage() {
        return myLanguage;
    }
    public void setMyLanguage(String myLanguage) {
        this.myLanguage = myLanguage;
    }

    public String getMySort() {
        return mySort;
    }

    public void setMySort(String mySort) {
        this.mySort = mySort;
    }

}

