package com.example.proj.action;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;                
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.example.proj.model.Person;
import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {

    static Person person=new Person();
    private String userName;
    private String passWord;
    private String activeUserName;
    private String activeFirstName;
    private String activeLastName;
    private String activeAccountType;
    private static final long serialVersionUID = 1L;                           
    static String error = "error";

    public String execute() throws Exception {
        String currentStatus = error;
        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        try {
            String URL = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "madmad123");
            if (connection != null) {
                String sql = " SELECT * FROM users WHERE userName=? AND passWord =?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, userName);  
                preparedStatement.setString(2, passWord); 
                ResultSet rs= preparedStatement.executeQuery();
                while (rs.next()){ 
                    activeUserName = rs.getString(2);
                    activeFirstName = rs.getString(4); 
                    activeLastName = rs.getString(5);   
                    activeAccountType = rs.getString(6); 
                    currentStatus = SUCCESS;
                    return currentStatus;
                    }

            }
            else {
                error = "DB connection failed";
                currentStatus = error;
                return currentStatus;
            }
         } catch (Exception e) {
             error = e.toString();
             currentStatus = error;
             return currentStatus;

         } finally {
            if (statement != null) try { statement.close(); } catch (SQLException ignore) {}
            if (connection != null) try { connection.close(); } catch (SQLException ignore) {}
         }

        return currentStatus;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getError() {
        return error;
    }

    public String getActiveFirstName() {
        return activeFirstName;
    }

    public void setActiveFirstName(String activeFirstName) {
        this.activeFirstName = activeFirstName;
    }

    public String getActiveUserName() {
        return activeUserName;
    }

    public void setActiveUserName(String activeUserName) {
        this.activeUserName = activeUserName;
    }

    public String getActiveLastName() {
        return activeLastName;
    }

    public void setActiveLastName(String activeLastName) {
        this.activeLastName = activeLastName;
    }

    public String getActiveAccountType() {
        return activeAccountType;
    }

    public void setActiveAccountType(String activeAccountType) {
        this.activeAccountType = activeAccountType;
    }
    

}