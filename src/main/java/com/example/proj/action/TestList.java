package com.example.proj.action;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.Connection;                
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.example.proj.model.Person;
import com.opensymphony.xwork2.ActionSupport;

public class TestList extends ActionSupport {

    ArrayList<Person> persons = new ArrayList<Person>();
    public ArrayList listOfUserNames = new ArrayList();
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
        } 
        catch (Exception e) {
        } 
        finally {
            if (preparedStatement != null) try { preparedStatement.close(); } catch (SQLException ignore) {}
            if (connection != null) try { connection.close(); } catch (SQLException ignore) {}
        }
        return SUCCESS;
    }

    public String testDisplayUser() {
       
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

        //setActiveFirstName(getPersons().get(1).getUserName());
        //setActiveFirstName(persons.get(1).getUserName());
        //activeFirstName = persons.get(0).getUserName();
        /*for (int count = 0; count < persons.size(); count++ ){
            if (persons.get(count).getUserName().equals(userInput)) {
                Person active=new Person();
                active.setUserName(persons.get(count).getUserName());
                active.setFirstName(persons.get(count).getFirstName());
                active.setLastName(persons.get(count).getLastName());
                active.setAccountType(persons.get(count).getAccountType());
                
                //userName = active.getUserName();
                firstName = "MadKid";
                //lastName = active.getLastName();
                //accountType = active.getAccountType();
            }
        }*/

        
        
    
    

    
