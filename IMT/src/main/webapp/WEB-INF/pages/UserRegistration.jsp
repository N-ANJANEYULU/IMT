
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
  <div class="generic-container">
    <div class="well lead">User Registration Form</div>
    <form:form method="POST" modelAttribute="userRegistration"   class="form-horizontal" action="urpost">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="firstName">First Name</label>
                <div class="col-md-7">
                    <form:input type="text" path="firstName" id="firstName" class="form-control input-sm"  required="required" />
                     <div class="has-error">
                        <form:errors path="firstName" class="help-inline"/>
                    </div> 
                </div>
            </div>
        
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastname">Last Name</label>
                <div class="col-md-7">
                    <form:input type="text" path="lastName" id="lastName" class="form-control input-sm"  required="required" />
                    <div class="has-error">
                        <form:errors path="lastName" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        
        
        
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
                    <form:input type="text" path="password" id="password" class="form-control input-sm"  required="required" />
                    <div class="has-error">
                        <form:errors path="password" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        
        
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="userGroup">User Group</label>
                <div class="col-md-7">
                    <form:input type="text" path="userGroup" id="userGroup" class="form-control input-sm"  required="required"  />
                    <div class="has-error">
                        <form:errors path="userGroup" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="emailid">Email id</label>
                <div class="col-md-7">
                    <form:input type="email" path="emailid" id="emailid" class="form-control input-sm"  required="required" />
                    <div class="has-error">
                        <form:errors path="emailid" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="role">Role</label>
                <div class="col-md-7">
                    <form:input type="text" path="role" id="role" class="form-control input-sm"  required="required" />
                    <div class="has-error">
                        <form:errors path="role" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        
  
        <input type="submit" value="register" />
        </form:form>
        </div>
        
        
 
  </body>
</html>