package com.example.proj.action;


import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.Connection;                
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.example.proj.model.Person;

import com.opensymphony.xwork2.ActionSupport;


public class List extends ActionSupport {

    ArrayList<Person> persons = new ArrayList<Person>();
    public ArrayList<String> listOfUserNames = new ArrayList<String>();
    private String userInput;
    private String activeUserName;
    private String activeFirstName;
    private String activeLastName;
    private String activeAccountType;

    public String execute() throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            String URL = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "madmad123");

            if (connection != null) {
                String sql = "SELECT * FROM users";
                preparedStatement = connection.prepareStatement(sql);
                ResultSet rs= preparedStatement.executeQuery();

                while(rs.next()){  
                    Person person=new Person();
                    person.setUserName(rs.getString(2)); 
                    person.setFirstName(rs.getString(4)); 
                    person.setLastName(rs.getString(5));   
                    person.setAccountType(rs.getString(6)); 
                    persons.add(person);
                    listOfUserNames.add(person.getUserName());  
                }
            } 
         } catch (Exception e) {

         } finally {
            if (preparedStatement != null) try { preparedStatement.close(); } catch (SQLException ignore) {}
            if (connection != null) try { connection.close(); } catch (SQLException ignore) {}
         }

         return SUCCESS;
    }

    public String DisplayUser() {
       
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            String URL = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "madmad123");

            if (connection != null) {
                String sql = "SELECT * FROM users where userName=?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, userInput);  
                ResultSet rs= preparedStatement.executeQuery();
                while(rs.next()){  
                    activeUserName = rs.getString(2);
                    activeFirstName = rs.getString(4); 
                    activeLastName = rs.getString(5);   
                    activeAccountType = rs.getString(6); 
                    return SUCCESS;
                }
            }
        }
        catch (Exception e) {
        } finally {
            if (preparedStatement != null) try { preparedStatement.close(); } catch (SQLException ignore) {}
            if (connection != null) try { connection.close(); } catch (SQLException ignore) {}
        }
        return SUCCESS;
    }

    public ArrayList<Person> getPersons() {  
        return persons;  
    }  

    public void setTestList(ArrayList<Person> persons) {  
        this.persons = persons;  
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
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
