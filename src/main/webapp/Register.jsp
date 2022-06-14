<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Register</title>
    <!-- <link rel="stylesheet" href="CSS/style.css"> -->
    <style>
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
        position:relative;
        overflow: hidden;  
      }
      .Register{

        text-align: center;
        color: rgb(23, 16, 16);
      }
      .myText{
        width: 15%;
        position: relative;
        top: 50%;
        transform: translateY(-50%);
        text-align: center;
        color: rgb(23, 16, 16);
      }
      
    </style>
  </head>
  <body>
    <div class="banner">
    <s:include value="Navbar.jsp"/>
    <div class="Register">
    <h2>SIGN UP</h2>
    <s:form action="Register">
      <s:textfield name="personBean.userName" cssClass="myText" label="Username" />
      <s:textfield name="personBean.passWord" cssClass="myText" label="Password" />
      <s:textfield name="personBean.firstName" cssClass="myText" label="First name" />
      <s:textfield name="personBean.lastName" cssClass="myText" label="Last name" />
      <s:textfield name="personBean.accountType"   cssClass="myText" label ="Account Type"/>  

      <s:submit value="Submit" cssClass="myButton"/>
    </s:form>
    <p><a href="<s:url action='List' />" >View User Records.</a>.</p>	
  </div>
  </div>
  </body>
</html>