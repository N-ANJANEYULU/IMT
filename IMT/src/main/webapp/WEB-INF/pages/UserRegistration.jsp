
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
    <form:form method="POST" modelAttribute="userRegistration"   class="form-horizontal" action="/imt/urpost">
    
    <c:if test="${userRegistration.userId!=null}">
        <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="userId">User Id</label>
                <div class="col-md-7">
                    <form:input type="text" path="userId" id="userId" class="form-control input-sm"   />
                     <div class="has-error">
                        <form:errors path="userId" class="help-inline"/>
                    </div> 
                </div>
            </div>
            </c:if>
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
                    <form:input type="password" path="password" id="password" class="form-control input-sm"  required="required" />
                    <div class="has-error">
                        <form:errors path="password" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="userGroup">User
						Group</label>
					<div class="col-md-7">
						<form:select path="userGroup" required="required">
							<form:option value="" label="--- Select ---" />
							<form:option value="Consumer Group" label="Consumer Group" />
							<form:option value="SOA" label="SOA" />
							<form:option value="RPC" label="RPC" />
							<form:option value="Lites" label="Lites" />
							<form:option value="Configuration Management" label="Configuration Management" />
							<form:option value="ADMIN Support" label="ADMIN Support" />
							
						</form:select>

						<div class="has-error">
							<form:errors path="userGroup" class="help-inline" />
						</div>
					</div>
				</div>
			</div>

			<div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="emailId">Email id</label>
                <div class="col-md-7">
                    <form:input type="email" path="emailId" id="emailId" class="form-control input-sm"  required="required" />
                    <div class="has-error">
                        <form:errors path="emailId" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="role">Role</label>
                <div class="col-md-7">
                <form:select path="role" required="required">
							<form:option value="" label="--- Select ---" />
							<form:option value="ADMIN" label="ADMIN" />
							<form:option value="USER" label="USER" />
						</form:select>
                    <div class="has-error">
                        <form:errors path="role" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
         <c:if test="${userRegistration.userId!=null}">
        <input type="submit" value="Update" />
        </c:if>
        <c:if test="${userRegistration.userId==null}">
        <input type="submit" value="register" />
        </c:if>
        <input onclick="window.location.href='/imt/urlist'" type="button" value="back" />
        </form:form>
        </div>
        
        
 
  </body>
</html>