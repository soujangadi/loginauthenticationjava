<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form method="POST" action="/LibraryManagement/editsaveauthor">
<table>

<tr>
<td>Name</td>
<td><form:input path="authorname"/></td>
</tr>

<tr>
<td colspan="2">
<input type="submit" value="Update author"/>
</td>
</tr>
</table>

</form:form>

</body>
</html>
