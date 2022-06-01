package com.example.proj.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestLogin extends ActionSupport {


    private String username;
    private String password;

    public TestLogin(){
        
    }
    public String execute() throws Exception {
       
        return SUCCESS;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}