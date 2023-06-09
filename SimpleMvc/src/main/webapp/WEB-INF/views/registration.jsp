<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>*///tag library for form/
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="submitform" modelAttribute="user"> ///after the submission of the form  
including the model attribute
*//we have to put the form input//*
First Name:<form:input path="fname" />
<br/><br/>
Last Name:<form:input path="lname" />
<br/><br/>
<input type="submit" value="Register"/>

</form:form>


</body>
</html>
*////whenver we use the the form title we have to add the tag library in the above code//*