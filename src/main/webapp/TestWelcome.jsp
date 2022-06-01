<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Welcome page...</title>
  </head>
  <body>
    <h1> USER DETAILS:</h1>
        <s:property value="activeUserName"/>
        <s:property value="activeFirstName"/>
        <s:property value="activeLastName"/>
        <s:property value="activeAccountType"/>
  </body>
</html>