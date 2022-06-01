<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Login</title>
  </head>
  <body>
    <h1>Struts 2</h1>
    <s:form action="TestLogin">
      <s:textfield name="userName" label="Username"/>
      <s:textfield name="passWord" label="Password"/>
      <s:submit value="Login"/>
    </s:form>
  </body>
</html>