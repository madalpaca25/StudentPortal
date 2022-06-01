<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <s:include value="Navbar.jsp"/>
    <div Class="content">
        <h1><img src="CSS/logo.jpg" class="logo"></h1>
        <s:form action="Login">
            <s:textfield name="userName" label="Username"/>
            <s:textfield name="passWord" label="Password"/>
            <s:submit value="Login"/>
          </s:form>
    </div>
</html>