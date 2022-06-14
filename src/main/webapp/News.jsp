<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %> <%@ taglib prefix="s" uri="/struts-tags" %> 

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- <link rel="stylesheet" href="CSS/style.css"> -->
    <title>News</title>
    <style>
    *{
        margin: 0;
        padding: 0;
        font-family: sans-serif;
    }    
    .banner{
        width: 100%;
        height: 100vh;
        background-image:url(CSS/background2.jpg);
        background-size: cover;
        background-position: center;
    }
    .myButton{
        width: 200px;
        padding: 15px 0;
        text-align: center;
        margin: 20px 10px;
        border-radius: 25px;
        font-weight: bold;
        border: 2px solid #329600;
        background: transparent;
        color: rgb(22, 20, 20);
        cursor: pointer;
        position: relative;
        overflow: hidden;  
    }

    .myNews{
        text-align: center;
        border-radius: 5px;
        margin: auto;
        font-weight: bold;
    }
    .content{
        
        position: relative;
        text-align: center;
        border-radius: 5px;
        padding: 45px;
        margin: auto;
        font-weight: bold;
    }
    </style>
    
</head>
<body>
    <div class="banner">
    <s:include value="Navbar.jsp"/>
    <div class="content">
        <s:form action="News">
            <hr>
            <br>
            <s:textfield key="searchWord" cssClass="myNews" label="Contains"/>
            <br>

            <br>
            <s:select label="Preferred Language" 
            headerKey="-1"
            list="#{'en':'English', 'ru':'Russian', 'de':'German'}" 
            name="myLanguage"
            cssClass="myNews"/>
            <br>

            <br>
            <s:radio label="Sort By" 
            name="mySort" 
            list="#{'relevancy':'RELEVANCY', 'popularity':'POPULARITY', 'publishedAt':'PUBLISHED-AT'}" 
            cssClass="myNews"/>

            <s:submit value="Search" cssClass="myButton"/>
            
            <hr>
        </s:form>
    </div>

        <s:iterator  value="newsResponse.articles">  
            <fieldset>  
                <h5><s:property value="publishedAt"/></h5>
                <br>
                <h3><span style="font-size: larger;">"<s:property value="title"/>"</span> by <s:property value="author"/></h3>
                <br>
                <h4><s:property value="description"/><br/></h4>
                <hr>
                <h4>Read more:</h4>
                <a href="<s:property value='url'  />" target="_blank"><s:property value="url"/></a>
            </fieldset>  
        </s:iterator>
    </div>
</body>
</html>