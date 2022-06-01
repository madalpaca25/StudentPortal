<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<style>
    .navbar{
        width: 85%;
        padding: 35px 0;
        display: flex;
        align-items: center;
        justify-content: space-between;
    }

    .navbar ul li{
    list-style: none;
    display: inline-block;
    margin: 0 20px;
    position: relative;
    }

    .navbar ul li a{
        text-decoration: none;
        color: #fff;
        text-transform: uppercase;
    }

    .navbar ul li::after{
        content: '';
        height: 3px;
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
            <li><a href="index.jsp">Home</a></li>
            <li><a href="Register.jsp">Register</a></li>
            <li><a href="List.action">List</a></li>
        </ul>
    </div>
</html>