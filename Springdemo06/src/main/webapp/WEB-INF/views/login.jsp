<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<form:form action="loginProcess" modelAttribute="login" id ="userLoginForm">
<table>
<tr>
<td>Username:</td>
<td><form:input path="username"/></td>
</tr>
<tr>
<td>Password:</td>
<td><form:input path="password"/></td>
</tr>
<tr>
<td colspan="2">
<form:button id="login" name="login">Login</form:button>
</td>
</tr>
<tr>
<td colspan="2"></td>
</tr>
<tr>
<td colspan="2">
<a href="index.jsp">Home</a>
</td>
</tr>
</table>
</form:form>
<p>
${message }
</p>
</body>
</html>