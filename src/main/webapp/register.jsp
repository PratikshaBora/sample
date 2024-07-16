<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<form action="registerData" method="post">
		<table align="center">
			<tr>
				<td>First name :</td>
				<td><input type="text" name="fname"></td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><input type="text" name="lname"></td>
			</tr>
			<tr>
				<td>Marks :</td>
				<td><input type="number" name="marks"></td>
			</tr>
			<tr>
				<td>Email : </td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td>Course : </td>
				<td><input type="text" name="course"></td>
			</tr>
			<tr>
				<td>User Name : </td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Password : </td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td> <input type="submit" value="Submit"></td>	
			</tr>
		</table>
	</form>
</body>
</html>