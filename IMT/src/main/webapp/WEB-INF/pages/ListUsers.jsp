<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP List Users Records</title>
</head>
<body>
<form:form    class="form-horizontal" >
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of users</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
               <%--<th>Profession</th>--%>
            </tr>
            <c:forEach var="user" items="${userregisterList}">
                <tr>
                    <td><c:out value="${user.userid}" /></td>
                    <td><c:out value="${user.firstName}" /></td>
                    <td><c:out value="${user.emailid}" /></td>
                   <%--<td><c:out value="${user.profession}" /></td>--%>
                </tr>
            </c:forEach>
        </table>
    </div>
    <center>
    <a href="UserMain.jsp">UserMain.jsp </a>
    </center>
</form:form>
</body>

</html>