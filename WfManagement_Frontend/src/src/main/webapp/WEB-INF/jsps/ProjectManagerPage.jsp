<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align: center; font-family: verdana; color: green">
		${myData}</h1>

	<hr />

	<div align="center">
		<h1>Manager : ${rdObj.resourceName}</h1>

		<hr />
		<ul>
  			<li>
				<a href="getRaiseResourceRequest">Raise Resource Request</a>
			</li> 
			<li>
				<a href="viewSuggestedResourceList">Resources List</a>
			</li>
			<li>
			 <a href="#">Back To HomePage </a>
			</li> 
			</ul>
	</div>


</body>
</html>