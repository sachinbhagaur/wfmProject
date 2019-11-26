<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Project Manager</h1>

<h1 style="text-align: center;font-family: verdana;color: green">
			${myData}
		</h1>
		
		<hr/>
		
		<div align="center">
		<h1>Welcome Manager : ${uObj.userName}</h1>
		
		<hr/>
		<a href="raiseResourceRequest">Raise Resource Request</a>
		<a href="viewAllResource">View All Resource</a>
		<a href="HomePage">Back To HomePage </a>
		</div>


</body>
</html>