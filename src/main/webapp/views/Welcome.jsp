<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page.</title>
<style type="text/css">
	div{
		text-align: right;
		color: fuchsia;
	}
	h2{
		color: maroon;
		text-align: center;
	}
	p{
		font-family: fantasy;
		font-size: x-large;
		color: blue;
	}
</style>
</head>
<body>
	<div> 
		<a href="register.jsp">Register</a>
		<button><a href="login.jsp">Login</a></button>
	</div>
	<%
		String msg=(String)request.getAttribute("message");
	%>
	<%=msg %>
	<hr>
	<h2> Welcome , Student Management System</h2>
	<hr>
	<p> This project is developed using spring MVC.</p>
	<hr>
	<a href="${pageContext.request.contextPath}/Student"> Student Records </a>
</body>
</html>