<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

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
    <h2>Successful Login!</h2>

      <s:property value="firstName" />
      <s:property value="lastName" />
    </div>
  </body>
</html>