<%@page import="com.tka.model.StudentFS"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
<style type="text/css">
	p{
		font-family: serif;
		font-size: large;
		color: orange;
	}
	h1{
		color: green;
		font-family: cursive;
		text-align: center;
	}
	h2{
		color: blue;
	}
	div{
		text-align: right;
	}
</style>
</head>
<body>
	<%
		StudentFS s = (StudentFS)request.getAttribute("student");
	%>
	<div>
		<a href="/views/Welcome.jsp">Sign Out</a>
	</div>
	
	<h1> Welcome , <%=s.getFname() %>!!</h1>
	<h2> Student Data : </h2>
	<p> Name : <%=s.getFname() %>, <%=s.getLname() %><br>
		Marks: <%=s.getMarks() %><br>
		Email : <%=s.getEmail() %><br>
		Course : <%=s.getCourse() %>
	</p>

</body>
</html>