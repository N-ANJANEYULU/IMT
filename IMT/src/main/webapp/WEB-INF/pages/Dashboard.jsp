<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dash Board</title>
</head>
<body>

<c:if test="${sessionScope.loginUser.isaccessGranted=='YES'}">
<c:if test="${sessionScope.loginUser.role=='ADMIN'}">
<br/>
<h1>Administrator Dash Board</h1>

<a href="/imt/urlist">User Management</a>
<a href="/imt/inclist">Incident Management</a>
<br/>
<br/>
<form:form method="POST" commandName="searchParam"   class="form-horizontal" action="search"> 
<!-- <label for="mysearch2">Search Incident: </label>  -->
	<input id="searchIncident" name="searchIncident" type="search" placeholder="Search Incident">
 <!-- Search Incident: --><%-- <form:input path="searchIncident"></form:input> --%>
 <input type="submit" value="Search Incident">
</form:form>

</c:if>
<c:if test="${sessionScope.loginUser.role=='USER'}">
<br/>
<h1>User Dash Board</h1>
<a href="/imt/inclist">Incident Management</a>
</c:if>
</c:if>
<c:if test="${sessionScope.loginUser.isaccessGranted=='NO'}">
<h1>You are not Authorized to view this page.. Please contact Admin</h1>
</c:if>
 
</body>
</html>