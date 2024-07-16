<%@page import="com.tka.model.StudentFS"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.tka.controller.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students Data</title>
<style type="text/css">
	table,tr,th,td{
		border: 2px solid black;
	}
</style>
</head>
<body>
	<h2 style="text-align: center;"> Student Information</h2>
	<table align="center">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Marks</th>
			<th>Email</th>
			<th>Course</th>
			<th colspan=2>Alter</th>
		</tr>
	<%
		List<StudentFS> list = (List<StudentFS>)request.getAttribute("l");
		for(StudentFS s : list)
		{
	%>
		<tr>
				<td><%=s.getFname() %></td>
				<td><%=s.getLname() %></td>
				<td><%=s.getMarks() %></td>
				<td><%=s.getEmail() %></td>
				<td><%=s.getCourse() %></td>
				<td><a href=""><input type="button" value="edit"></a></td>
				<td><a href=""><input type="button" value="delete"></a></td>
		</tr>
	<%
		}
	%>
	</table>

</body>
</html>