<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %> <%@ taglib prefix="s" uri="/struts-tags" %> <%@ taglib
prefix="sx" uri="/struts-dojo-tags" %>
  
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <!-- <link rel="stylesheet" href="CSS/style.css"> -->
    <sx:head />
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

        .myText{
            width: 15%;
            /* position: absolute; */
            /* top: 50%; */
            /* transform: translateY(-50%); */
            text-align: center;
            color: rgb(23, 16, 16);
        }
    </style>
</head>
<body>
    <div class="banner">
    <s:include value="Navbar.jsp"/>      
    <s:form action="DisplayUser" cssClass="myText">
    <sx:autocompleter
        label="Choose your record"
        list="listOfUserNames"
        name="userInput"
    />
    <s:submit value="Submit" cssClass="myButton"/>
</s:form>



<h3>LIST OF ALL USERS</h3>  
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
</body>

