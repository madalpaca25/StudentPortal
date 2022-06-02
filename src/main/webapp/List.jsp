<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %> <%@ taglib prefix="s" uri="/struts-tags" %> <%@ taglib
prefix="sx" uri="/struts-dojo-tags" %>
  
<!DOCTYPE html>
<head>
    <link rel="stylesheet" href="CSS/style.css">
    <sx:head />
</head>
<body>        
    <s:form action="DisplayUser">
    <sx:autocompleter
        label="Choose your record"
        list="listOfUserNames"
        name="userInput"
    />
    <s:submit/>
</s:form>

<div class="banner">
<s:include value="Navbar.jsp"/>
<h3>LIST OF ALL USERS</h3>  
<s:iterator  value="persons">  
<fieldset>  
<s:property value="userName"/><br/>  
<s:property value="firstName"/><br/>  
<s:property value="lastName"/><br/>
<s:property value="accountType"/><br/>    
</fieldset>  
</s:iterator>
</body>
<p><a href="<s:url action='index' />" >Return to home page</a>.</p>
</div>