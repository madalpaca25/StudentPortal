<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Register</title>
    <link rel="stylesheet" href="CSS/style.css">
  </head>
  <body>
    <div class="banner">
    <s:include value="Navbar.jsp"/>
    <h3>SIGN UP</h3>


    <s:form action="Register">
      <s:textfield name="personBean.userName" label="Username:" />
      <s:textfield name="personBean.passWord" label="Password:" />
      <s:textfield name="personBean.firstName" label="First name" />
      <s:textfield name="personBean.lastName" label="Last name" />
      <s:textfield name="personBean.accountType"  label ="Account Type"/>  

      <s:submit/>
    </s:form>
    <p><a href="<s:url action='List' />" >View User Records.</a>.</p>	
    </div>
  </body>
</html>