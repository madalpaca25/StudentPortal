
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %> <%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <s:include value="Navbar.jsp"/>
    <div Class="content">
        <h1><img src="CSS/logo.jpg" class="logo"></h1>
        <h1> LOG IN</h1><br>
            <s:form action="Login" method="post" theme="css_xhtml">
                <s:textfield name="userName" label="Username" />
                <s:password name="passWord" label="Password" />
                <s:submit cssClass="myButton" key="Submit"/><span></span>
            </s:form>
    </div>
</html>