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
Country: ${user.country}<br>

Introduction: ${user.introduction}<br>

Visited Countries :
<ul>
	<c:forEach var="item" items="${user.visitedCountries}">
	<li>${item}</li>
	</c:forEach>
</ul>
<br>
Name: ${user.name}

</body>
</html>