<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<form:form action="save" modelAttribute="employee">
			<tr>
				<td>id</td>
				<td><form:input path="id" readonly="true"/></td>
			</tr>
			<tr>
				<td>name</td>
				<td><form:input path="name"/></td>
			</tr>
			<tr>
				<td>designation</td>
				<td><form:input path="designation"/></td>
			</tr>
			<tr>
				<td>salary</td>
				<td><form:input path="salary"/></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</form:form>
	</table>
</body>
</html>