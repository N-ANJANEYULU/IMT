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
<form:form method="POST" modelAttribute="userRegistration"   class="form-horizontal" action="/imt/urpost">
<c:if test="${sessionScope.loginUser.role=='ADMIN'}">
<br/>
<h1>Administrator Dash Board</h1>

<a href="/imt/urlist">User Management</a>
<a href="/imt/inclist">Incident Management</a>


</c:if>
<c:if test="${sessionScope.loginUser.role=='USER'}">
<br/>
<h1>User Dash Board</h1>
<a href="/imt/inclist">Incident Management</a>
</c:if>

</form:form>
</body>
</html>