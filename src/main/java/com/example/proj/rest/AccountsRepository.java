package com.example.proj.rest;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.proj.model.Account;


public class AccountsRepository {
    private static Map<String, Account> map = new HashMap<String, Account>();
    ArrayList<Account> accounts = new ArrayList<Account>();
    public AccountsRepository(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        //int i = 5;
        try {
            String URL = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "madmad123");
                if (connection != null) {
                    String sql = "SELECT * FROM users";
                    preparedStatement = connection.prepareStatement(sql);
                    ResultSet rs= preparedStatement.executeQuery();
                    while(rs.next()){
                        //working
                        map.put(String.valueOf(rs.getInt(1)), new Account(
                        rs.getInt(1), rs.getString(2), rs.getString(3), 
                        rs.getString(4), rs.getString(5), rs.getString(6)));
                    }
                        /*Account account=new Account();
                        account.setUser_id(rs.getInt(1));
                        account.setUserName(rs.getString(2)); 
                        account.setPassWord(rs.getString(3));
                        account.setFirstName(rs.getString(4)); 
                        account.setLastName(rs.getString(5));   
                        account.setAccountType(rs.getString(6)); 
                        accounts.add(account);
            
                        map.put(String.valueOf(accounts.get(i).getUser_id()), new Account(
                        accounts.get(i).getUser_id(), accounts.get(i).getUserName(), 
                        accounts.get(i).getPassWord(), accounts.get(i).getFirstName(),
                        accounts.get(i).getLastName(), accounts.get(i).getAccountType()));
            }*/
            } 
        } catch (Exception e) {
        } finally {
        if (preparedStatement != null) try { preparedStatement.close(); } catch (SQLException ignore) {}
        if (connection != null) try { connection.close(); } catch (SQLException ignore) {}
        }
    }
    public Map<String, Account> findAllAccounts() throws Exception {
        return map;
    }

    public Account getAccountById(String id) {
        return map.get(id);
    }

    public String save(Account account) throws Exception {
        Connection connection = null;
        String URL = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC";
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(URL, "root", "madmad123");
            if (connection != null) {
                Statement statement = connection.createStatement();
                String sql = "INSERT INTO users(userName, passWord, firstName, lastName, accountType) VALUES('"+account.getUserName()+"','"+account.getPassWord()+"','"+account.getFirstName()+"','"+account.getLastName()+"','"+account.getAccountType()+"')";
                statement.executeUpdate(sql);
                statement.close();
                connection.close();
                return "create";
            } else {
                return "error";
            }
    }

    public Map<String, Account> update(String id, Account account) throws Exception {
        int currentID = Integer.parseInt(id);
        Connection connection = null;
        String URL = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC";
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(URL, "root", "madmad123");
            if (connection != null) {
                Statement statement = connection.createStatement();
                String sql = " UPDATE users SET userName= '"+account.getUserName()+"', passWord='"+account.getPassWord()+"', firstName='"+account.getFirstName()+"', lastName='"+account.getLastName()+"', accountType='"+account.getAccountType()+"' WHERE user_id ="+currentID;
                statement.executeUpdate(sql);
                statement.close();
                connection.close();
            }
        return map; 
    }

    public String remove(String id) throws Exception {
        int currentID = Integer.parseInt(id);
        Connection connection = null;
        String URL = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC";
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(URL, "root", "madmad123");
        if (connection != null) {
            Statement statement = connection.createStatement();
            String sql = "DELETE FROM users WHERE user_id="+currentID;
            statement.executeUpdate(sql);
            map.remove(id);
            statement.close();
            connection.close();
            return "destroy";
        } else {
            return "error";
        }

    }
}
    
