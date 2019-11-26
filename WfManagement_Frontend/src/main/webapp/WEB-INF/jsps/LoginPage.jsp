<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>LoginPage</title>
	</head>
	
	<body>
		
		<h1>Login</h1>
		<form action="Login" method="post">
			<table>
				<tr>
					<td>User Id : </td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="pass"/></td>
				</tr>
			  <tr>
					<td></td>
					<td><input type="submit" value="Sign In"/></td>
				</tr>
			</table>
		</form>
		
	</body>
</html>