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
  <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">
<title>History of Inidents</title>
</head>
<body>

<form:form class="form-horizontal">
Welcome  ${sessionScope.loginUser.firstName}   ${sessionScope.loginUser.lastName}  <a href="/imt/logout">Logout</a>
<div align="center">

<table border="1" cellpadding="5">

<caption><h2>Incident History</h2></caption>
<tr>
<th>ID</th>
<th>Application</th>
<th>Assigned to</th>
<th>Comments</th>
<th>Status</th>
<th>Description</th>
<th>Requester</th>
<th>Req Group</th>
<th>Severity</th>
<th>Summary</th>
<th>Created Date</th>



</tr>
<c:forEach var="incHistLogs" items="${incRegistration.incHistLogs}">
<tr>
<td>${incHistLogs.incHistId}</td>
<td>${incHistLogs.application}</td>
<td>${incHistLogs.assignedTo}</td>
<td>${incHistLogs.comments}</td>
<td>${incHistLogs.status}</td>
<td>${incHistLogs.description}</td>
<td>${incHistLogs.requestedGroup}</td>
<td>${incHistLogs.requestedUser}</td>
<td>${incHistLogs.severiety}</td>
<td>${incHistLogs.summary}</td>
<td>${incHistLogs.createDt}</td>

</tr>
</c:forEach>

</table>

</div>
<center>

<a href="/imt/inclist">Back</a>

</center>

</form:form>

</body>
</html>

