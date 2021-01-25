<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome to thr.jsp page</h1> <hr/>

<c:forEach  items="${myCities }" var="cityName">
<li>${cityName}</li>
</c:forEach>


</body>
</html>