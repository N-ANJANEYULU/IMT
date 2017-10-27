<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Incidents</title>
</head>
<body>

<form:form class="form-horizontal">
<div align="center">

<table border="1" cellpadding="5">

<caption><h2>List of Incidents</h2></caption>
<tr>
<th>ID</th>
<th>Application</th>
<th>Assigned to</th>
<th>Comments</th>
<th>Status</th>
<th>Created User</th>
<th>Edit
</tr>
<c:forEach var="incRegistration" items="${incList}">
<tr>
<td><a href="inchget/${incRegistration.incId}">${incRegistration.incId}</a></td>
<td>${incRegistration.incHistLogs[0].application}</td>
<td>${incRegistration.incHistLogs[0].assignedTo}</td>
<td>${incRegistration.incHistLogs[0].comments}</td>
<td>${incRegistration.incHistLogs[0].status}</td>
<td>${incRegistration.userInc.firstName}</td>
<td><a href="incget/${incRegistration.incId}">Edit</a></td>
</tr>
</c:forEach>

</table>

</div>
<center>

<a href="incget">Add</a>

</center>

</form:form>

</body>
</html>

