<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LoginJSP</title>
</head>
<body>

<div class="generic-container">
    <div class="well lead">Login</div>
    <form:form method="POST" modelAttribute="userRegistration"   class="form-horizontal" action="login">
    

<div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="userName">User Name</label>
                <div class="col-md-7">
                    <form:input type="text" path="userName" id="userName" class="form-control input-sm"  required="required"  />
                    <div class="has-error">
                        <form:errors path="userName" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>

   <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="password">Password</label>
                <div class="col-md-7">
                    <form:input type="password" path="password" id="password" class="form-control input-sm"  required="required" />
                    <div class="has-error">
                        <form:errors path="password" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
         <input type="submit" value="Login" />
        <input onclick="window.location.href='/imt/urget'" type="button" value="Register" />
       
 </form:form>

</body>
</html>