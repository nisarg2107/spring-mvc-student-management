<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="searchName.html">
	Search by Firstname or Lastname : <input type="text" name="name">
	<input type="submit">
</form><br><br>
	<table border="1px solid black">
		<tr>
			<th>Id</th>
			<th>First name</th>
			<th>Last name</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${data}" var="i">
			<tr>
				<td>${i.id}</td>
				<td>${i.fn}</td>
				<td>${i.ln}</td>
				<td><a href="edit.html?id=${i.id}">Edit</a></td>
				<td><a href="delete.html?id=${i.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="load.html">Insert..</a>
</body>
</html>