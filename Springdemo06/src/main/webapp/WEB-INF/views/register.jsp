<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New User Registration </title>
</head>
<body>
<form:form action="registerProcess" modelAttribute="User" id="userRegForm">
<table>
<tr>
<td>UserName:</td>
<td><form:input path="username" /></td>
</tr>
<tr>
<td>Password:</td>
<td><form:password path="password" /></td>
</tr>
<tr>
<td>Firstname:</td>
<td><form:input path="firstname" /></td>
</tr>
<tr>
<td>Lastname:</td>
<td><form:input path="lastname" /></td>
</tr>

<tr>
<td>Email:</td>
<td><form:input path="email" /></td>
</tr>
<td>Phone number:</td>
<td><form:input path="phone" /></td>
</tr>
<tr>
<td>Address:</td>
<td><form:input path="address" /></td>
</tr>
<tr>
<td colspan="2">
<form:button id="register" name="register">Register User
</form:button>
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
</body>
</html>