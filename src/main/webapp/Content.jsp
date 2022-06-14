<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" href="CSS/mystyle.css">
    <!-- <style>
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
    .content{
    text-align: center;
    border-radius: 5px;
    padding: 100px;
    margin: 50px 50px;
    font-weight: bold;
    }
    .content h1{
        font-size: 60px;
        margin-top: 5px;
    }
    .myText{
    width: 15%;
    position: relative;
    top: 50%;
    transform: translateY(-50%);
    text-align: center;
    color: rgb(23, 16, 16);
    }
   
    </style> -->
</head>

    <s:include value="Navbar.jsp"/>
    <div Class="content">
        <s:form action="Login">
            <s:textfield key="userName" cssClass="myText" label="Username"/>
            <s:textfield key="passWord" cssClass="myText" label="Password"/>
            <s:submit value="Login" cssClass="myButton"/>
          </s:form>
    </div>
</html>