<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}" scope="application"/>
<c:set var="css" value="${pageContext.request.contextPath}/resources/css" scope="application"/>


<html>
	<head>
	
		<title>Welcome To Home Page</title>
		
	</head>
	<body>
	     <h1> WFM Home Page</h1>
		<h1 style="text-align: center;font-family: verdana;color: yellow">
			${myData}
		</h1>
		
		<hr/>
		
		<a href="getLoginPage">Login</a><br/>
		
	</body>
</html>