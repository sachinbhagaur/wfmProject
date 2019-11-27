<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@page isELIgnored="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Resource</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container" align="center">
	<h1>RaiseResourceRequestPage</h1>
	<form action="raiseResourceRequest" method="post">
		<table>
			<tr class="form-group">
				<td>Project Name :</td>
				<td><input type="text" value="${projectName}" name="projectName"></td>
			</tr>
			<tr class="form-group">
				<td>Project StartDate</td>
				<td><input class="form-control" type="date" name="projectStartDate"  /></td>
			</tr>
			<tr class="form-group">
				<td>Project EndDate</td>
				<td><input class="form-control" type="date" name="projectEndDate" /></td>
			</tr>
			<tr class="form-group">
				<td>Role</td>
				<td><input type="text" name="role" /></td>
			</tr>
			<tr class="form-group">
				<td>Skills</td>
				<td><input type="text" name="skill" /></td>
			</tr>
			<tr class="form-group">
				<td>Experience</td>
				<td><input type="text" name="experience" /></td>
			</tr>
			<tr class="form-group">
				<td>Remarks</td>
				<td><input type="text" name="remarks" /></td>
			</tr>
			<tr class="form-group">
				<td></td>
				<td><input type="submit" value="Raise Request" /></td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>