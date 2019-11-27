<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>View All Resource</title>

</head>
<body>

	<div align="center">
		<h1>View All Resource</h1>

		<h1>Resource List</h1>

		<table border="1">
			<tr>
				<th>R Id</th>
				<th>R Name</th>
				<th>R Gender</th>
				<th>R Role</th>
				<th>R Email</th>
				<th>R Experience</th>
				<th>R Skill</th>
				<th>R Status</th>

			</tr>
			<c:forEach items="${resources}" var="userObj">
				<tr>
					<td>${userObj.resourceId}</td>
					<td>${userObj.resourceName}</td>
					<td>${userObj.resourceGender}</td>
					<td>${userObj.resourceRoleObj.roleType}</td>
					<td>${userObj.resourceEmail}</td>
					<td>${userObj.resourceExperience}</td>
					<td>${userObj.resourceSkills}</td>
					<td>${userObj.resourceStatus}</td>

				</tr>
			</c:forEach>
		</table>

	</div>
</body>
</html>