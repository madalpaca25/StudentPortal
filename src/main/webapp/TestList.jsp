<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %> <%@ taglib prefix="s" uri="/struts-tags" %> <%@ taglib
prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <sx:head />
    </head>

    <body>
        <s:form action="testDisplayUser">
            <sx:autocompleter
                label="Choose your record"
                list="listOfUserNames"
                name="userInput"
            />
            <s:submit/>
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
    </body>
</html>


