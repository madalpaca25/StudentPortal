<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Error...</title>
    <link rel="stylesheet" href="CSS/style.css">
    
  </head>
  <body>
    <div class="banner">
    <s:include value="Navbar.jsp"/>
    <h3>Error!</h3>

    <p>There is an error/> </p>

    <p><a href="<s:url action='index' />" >Return to home page</a>.</p>
  </div>
  </body>
</html>