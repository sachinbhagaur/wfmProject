<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

  <title>LoginPage</title>

 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>


</head>

<body>
    <div align="center">
	<h1>Login</h1>
	<form action="Login" method="post">
		<table>
		
			<tr class="form-group">
				<td>User Id :</td>
				<td><input class="form-control" type="text" name="username"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input class="form-control" type="password" name="pass" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input class="form-control" type="submit" value="Sign In" /></td>
			</tr>
		</table>
	</form>
     </div>
</body>
</html>