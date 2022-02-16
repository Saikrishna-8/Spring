<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Hello World!!</h1>
	<p>This is the homepage!</p>

	

	<form:form action="displayUserInfo" modelAttribute="user">
		Name: <form:input path="name" />
		Gender:Male:<form:radiobutton value="male" path="gender" />
			   Female:<form:radiobutton value="female" path="gender" />
		<input type="submit" value="submit">
	</form:form>
    
    <br><br>
    
	<form:form action="displayUserInfo" modelAttribute="user">
		Name: <form:input path="name" />
		Gender: <form:radiobuttons path="gender" items="${genderMap}" />
		<input type="submit" value="submit">
	</form:form>
	
	<br><br>
	
	<form:form action="displayUserInfo" modelAttribute="user">
		Name: <form:input path="name" /><br>
		Gender: <form:radiobuttons path="gender" items="${genderList}" />
		<input type="submit" value="submit">
	</form:form>
	

</body>
</html>