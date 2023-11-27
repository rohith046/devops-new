<%@page import="dto.dto"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
/* Add your CSS styles here */
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4; /* Light gray background */
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
}

table {
	border-collapse: collapse;
	width: 50%;
	margin-top: 20px;
}

th, td {
	border: 1px solid black;
	padding: 10px;
	text-align: left;
}

th {
	background-color: #e6e6e6; /* Light gray header background */
}
</style>
</head>
<body>
	<%
	List<dto> ov = (List<dto>)request.getAttribute("o");
	%>
	<table>
		<tr>
			<th>Email</th>
			<th>Name</th>
			<th>Password</th>
		</tr>

		<%
		for (dto l : ov) {
		%>
		<tr>
			<td><%=l.getEmail()%></td>
			<td><%=l.getName()%></td>
			<td><%=l.getPassword()%></td>

		</tr>
		<%
		}
		%>
	</table>
</body>
</html>
