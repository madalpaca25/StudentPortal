<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <link rel="stylesheet" href="CSS/style.css">
    <style>

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

    </style>
</head>

    <s:include value="Navbar.jsp"/>
    <div Class="content">
        <h1><img src="CSS/logo.jpg" class="logo"></h1>
        <s:form action="Login">
            <s:textfield key="userName" label="Username"/>
            <s:textfield key="passWord" label="Password"/>
            <s:submit value="Login" cssClass="myButton"/>
          </s:form>
    </div>
</html>