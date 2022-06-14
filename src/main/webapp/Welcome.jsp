<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Welcome page...</title>
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
    </style>
  </head>
  <body>
    <div class="banner">
    <s:include value="Navbar.jsp"/>
    <h2>USER DETAILS:</h2>
      <s:property value="activeUserName" />
      <s:property value="activeFirstName"/>
      <s:property value="activeLastName"/>
      <s:property value="activeAccountType"/>
    </div>
  </body>
</html>