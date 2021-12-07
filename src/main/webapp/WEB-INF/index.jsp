<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Insert title here</title>
</head>
<body>
<div class="box w-50 p-3 ">
<h1>Fruit Store</h1>
<table class="table table-sm">
	
	<tr>
	<th>Name</th>
	<th>Price</th>
	</tr>
	<c:forEach var="oneFruit" items="${fruits }">
	<tr>
	<td> <c:out value="${oneFruit.name }"></c:out> </td>
	<td><c:out value="${oneFruit.price }"></c:out> </td>
	
	</tr>
	</c:forEach>
</table>
</div>
</body>
</html>