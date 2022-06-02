<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Welcome page...</title>
    <link rel="stylesheet" href="CSS/style.css">
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