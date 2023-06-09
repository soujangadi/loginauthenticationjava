<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>///taglib have to be
    //added whenver we use form in action
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="add"modelAttributr="book">
<form:input path="name"/>

<form:input type=?email? path="email"/>
<form:input type=?password? path="password"/>



<form:radiobutton path="radio" value="male"/>
<form:radiobutton path="radio" value="female"/>



<form:checkbox path="radio" value="male"/>
<form:checkbox path="radio" value="female"/>


<form:select path="books">
<form:option value="Harry Potter" label="Harry"/>
<form:option value="Two sibling" label="Chetan"/>
<form:option value="Wings of fire" label="Kalam"/>
</form:select>


</form:form>

</body>
</html>