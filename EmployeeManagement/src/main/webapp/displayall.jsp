<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>id</th>
			<th>name</th>
			<th>designation</th>
			<th>salary</th>
		</tr>
		<c:forEach items="${employeelist}" var="emp">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.name}</td>
				<td>${emp.designation}</td>
				<td>${emp.salary}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>