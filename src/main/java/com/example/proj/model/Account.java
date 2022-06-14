package com.example.proj.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Account {

    private int user_id;
    private String userName;
    private String passWord;
    private String firstName;
    private String lastName;
    private String accountType;

    public Account(){

    }

    public Account(int user_id, String userName, String passWord, String firstName, String lastName, String accountType) {
        this.user_id = user_id;
        this.userName = userName;
        this.passWord = passWord;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountType = accountType;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Account rhs = (Account) obj;
        return new EqualsBuilder() 
                .append(this.userName, rhs.userName)
                .append(this.passWord, rhs.passWord)
                .append(this.firstName, rhs.firstName)
                .append(this.lastName, rhs.lastName)
                .append(this.accountType, rhs.accountType)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder() 
                .append(userName)
                .append(passWord)
                .append(firstName)
                .append(lastName)
                .append(accountType)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this) 
                .append("userName",userName)
                .append("passWord",passWord)
                .append("firstName", firstName)
                .append("lastName", lastName)
                .append("accountType", accountType)
                .toString();
    }
}