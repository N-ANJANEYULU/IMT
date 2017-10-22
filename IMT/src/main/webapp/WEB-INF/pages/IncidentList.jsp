<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {

background-color: lightblue;

}
</style>
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

</tr>
<c:forEach var="user"items="${incRegistration}">
<tr>
<td><a href="urget/${incRegistration.incid}"><c:out value="${incRegistration.incid}" /></a></td>
<td><a href="urget/${incRegistration.incid}"><c:out value="${incRegistration.incid}" /></a></td>

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

