<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Incident History</title>
</head>
<body>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>History of Inidents</title>
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

</tr>
<c:forEach var="sessionScope.incRegistration.incHistLogs" items="${incHistLogs}">
<tr>
<td><a href="incget/${incId}"><c:out value="${incId}" /></a></td>
<td>${incHistLogs.application}</td>
<td>${incHistLogs.assignedTo}</td>
<td>${incHistLogs.comments}</td>
<td>${incHistLogs.status}</td>

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

