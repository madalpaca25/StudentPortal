<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    </head>
<style>
    .navbar{
        text-align: center;
        padding: 60px 0;
        align-items: center;
        justify-content: space-between;
        font-size: x-large;
    }

    .navbar ul li{
    list-style: none;
    display: inline-block;
    margin: 0 20px;
    position: relative;
    
    }

    .navbar ul li a{
        text-decoration: none;
        color: rgb(24, 23, 23);
        text-transform: uppercase;
        
    }

    .navbar ul li::after{
        content: '';
        height: 5px;
        width: 0%;
        background: #009688;
        position: absolute;
        left: 0;
        bottom: -10px;
        transition: 0.5s;
    }
    
    .navbar ul li:hover::after{
        width: 100%;
    }
</style>
    <div class="navbar">
        <ul>
            <!-- <li><a href="index.jsp">Home</a></li>
            <li><a href="Register.jsp">Register</a></li> -->

            <li><a href="<s:url action='index' />">HOME</a></li>
            <li><a href="Register.jsp">REGISTER</a></li>
            <li><a href="<s:url action='List' />">LIST</a></li>
            <li><a href="<s:url action='News' />">NEWS</a></li>
        </ul>
    </div>
</html>