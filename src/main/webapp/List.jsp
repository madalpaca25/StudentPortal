<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %> <%@ taglib prefix="s" uri="/struts-tags" %>
  
<!DOCTYPE html>
<head>
    <link rel="stylesheet" href="CSS/style.css">
</head>

<h3>LIST OF ALL USERS</h3>  
<div class="banner">
<s:include value="Navbar.jsp"/>
<s:iterator  value="persons">  
<fieldset>  
<s:property value="userName"/><br/>  
<s:property value="firstName"/><br/>  
<s:property value="lastName"/><br/>
<s:property value="accountType"/><br/>    
</fieldset>  
</s:iterator>
<p><a href="<s:url action='index' />" >Return to home page</a>.</p>
</div>