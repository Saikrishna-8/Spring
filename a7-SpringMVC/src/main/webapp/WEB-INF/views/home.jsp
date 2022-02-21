<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	<h1>Hello World!</h1>
	<p>This is the Home page !!!</p>
	<!-- 
	<form:form action="displayUserInfo" modelAttribute="user">
		<form:select path="country">
			<form:option value="India"></form:option>
			<form:option value="USA" label="United States"></form:option>
			<form:option value="Japan"></form:option>
			<form:option value="UK"></form:option>
			<form:option value="Srilanka"></form:option>
		</form:select>
		<br>
		Name:<form:input path="name" required="true"/>
		<form:errors path="name"/>
		<input type="submit" value="submit">
	</form:form>
	 -->
	
	<br><br>


	<form:form action="displayUserInfo" modelAttribute="user">
	
		Name: <form:input path="name" required="true"/><br><br>
		<form:errors path="name" cssStyle="color:red"/><br><br>
		
		
		Country :<form:select path="country" items="${selectMap}">
		</form:select><br><br>
		
		Introduction: <form:textarea path="introduction" required="true" placeholder="enter something" />
		<br><br>
		
		Visited Countries:
		CANDA: <form:checkbox path="visitedCountries" value="Canada" />
		TOKYO: <form:checkbox path="visitedCountries" value="Tokyo" />
		Germany: <form:checkbox path="visitedCountries" value="Germany" />
		Ireland: <form:checkbox path="visitedCountries" value="Ireland" />
		<br><br>
		<p>
			Accept Agreement:<form:checkbox path="" value="Accept" required="true" /> 
		</p>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>
