<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
 <c:set var="image" value="${pageContext.request.contextPath}/resources/images" scope="application"/>
    
    <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container"  align="center">
<h1>Add Resource</h1>
<f:form action="addResource" method="post" modelAttribute="resourceObj">
                     
<table class="table table-striped">
<tr class="form-group">
<td>Name : </td>
<td><f:input class="form-control"  path="resourceName" id="name"/>
</td>
</tr>
<tr class="form-group">
<td>DOB: </td>
<td><f:input class="form-control"  type="date" path="resourceDob" price="dob"/>
</td>
</tr>
<tr class="form-group" >
<td>Experience(In Years) : </td>
<td><f:input class="form-control" path="resourceExperience" price="experience"/>
</td>
</tr>
<tr class="form-group" >
<td>Email : </td>
<td><f:input class="form-control" path="resourceEmail" price="email"/>
</td>
</tr>
<tr class="form-group">
<td>Gender :</td>
<td>
<f:radiobutton path="resourceGender" value="MALE" label="M" /> 
<f:radiobutton path="resourceGender" value="FEMALE" label="F" />
</td>
</tr>
<tr>
<td>Marital Status : </td>
<td>
<f:radiobutton path="resourceMaritalStatus" value="UNMARRIED" label="UnMarried" /> 
<f:radiobutton path="resourceMaritalStatus" value="MARRIED" label="Married" />
</td>
</tr>
<tr class="form-group">
<td>Skills : </td>
<td><f:checkboxes path="resourceSkills" items="${skillsObj}" itemValue="skillName" itemLabel="skillName" />
</td>
</tr>
<tr class="form-group">
<td>Role : </td>
<td>
<f:select class="form-control" path="roleId">
<f:option value="0" label="Select"  />
  <f:options items="${rolesObj}" itemValue="roleId" itemLabel="roleType" />
</f:select>
</td>
</tr>
<tr>
<td  class="form-group">Phone Number : </td>
<td><f:input class="form-control" type="number" path="resourcePhoneNumber" price="phn"/>
</td>
</tr>
<tr class="form-group">
<td>End Date: </td>
<td><f:input class="form-control"  type="date" path="projectEndDate" price="enddate"/>
</td>
</tr>
<tr class="form-group">
<td></td>
<td>
<input type="submit" value ="Add" id="submit"/>
</td>
</tr>
</table>
</f:form>
</div>
</body>
</html>
