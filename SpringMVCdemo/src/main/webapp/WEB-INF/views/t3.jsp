<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib  uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>demo model  </h1>
 <c:forEach    items="${mycities }" var="cityName">
 
 <li> ${cityName}</li>
 
 </c:forEach>
</body>
</html>