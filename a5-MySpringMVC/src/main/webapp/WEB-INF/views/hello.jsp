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

	Hello ${name}
	<br> today'sDate: ${date}
	<br> LIST OF TEAM MEMBERS
	<br> _______________________
	<br>
	<c:forEach var="tem" items="${team}">
	<h1>${tem}</h1> 	<br>
 </c:forEach>
	${team}
	<br>
</body>
</html>
