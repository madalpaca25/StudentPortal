package com.example.proj.model;


public class Person {

    private String userName;
    private String passWord;
    private String firstName;
    private String lastName;
    private String accountType;

    public Person() {}

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String toString() {
        return "Username: " + getUserName() + " Password: "  + getPassWord() +" First Name: " + getFirstName() + " Last Name: " + getLastName() + 
        " Account Type: " + getAccountType(); 
    }
}
