<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UserRegistrationForm</title>
</head>
<body>
	<div class="generic-container">
		<div class="well lead">User Registration Form</div>
		<form:form method="POST" modelAttribute="userRegistration" class="form-horizontal" action="urpost">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="firstName">First Name</label>
				<div class="col-md-7">
					<form:input type="text" path="firstname" id="firstName"
						class="form-control input-sm" />
					<%--<div class="has-error">
							<form:errors path="firstName" class="help-inline" />
						</div>--%>
				</div>
			</div>
	</div>
	<div class="row">
		<div class="form-group col-md-12">
			<label class="col-md-3 control-lable" for="lastName">Last Name</label>
			<div class="col-md-7">
				<form:input type="text" path="lastname" id="lastName" class="form-control input-sm" />
			<%--<div class="has-error">
					<form:errors path="lastName" class="help-inline" />
				</div>--%>
			</div>
		</div>
	</div>

	<div class="row">
		<div class="form-group col-md-12">
			<label class="col-md-3 control-lable" for="userName">User Name</label>
			<div class="col-md-7">
				<form:input type="text" path="username" id="userName"
					class="form-control input-sm" />
			<%--<div class="has-error">
					<form:errors path="lastName" class="help-inline" />
				</div>--%>
			</div>
		</div>
	</div>

	<div class="row">
		<div class="form-group col-md-12">
			<label class="col-md-3 control-lable" for="passWord">PassWord</label>
			<div class="col-md-7">
				<form:input type="text" path="password" id="passWord"
					class="form-control input-sm" />
				<%--<div class="has-error">
					<form:errors path="lastName" class="help-inline" />
				</div>--%>
			</div>
		</div>
	</div>

	<div class="row">
		<div class="form-group col-md-12">
			<label class="col-md-3 control-lable" for="user Group">User
				Group</label>
			<div class="col-md-7">
				<form:input type="text" path="usergroup" id="userGroup" class="form-control input-sm" />
			<%--<div class="has-error">
					<form:errors path="lastName" class="help-inline" />
				</div>--%> 
			</div>
		</div>
	</div>


	<div class="row">
		<div class="form-group col-md-12">
			<label class="col-md-3 control-lable" for="emailid">Email ID</label>
			<div class="col-md-7">
				<form:input type="text" path="emailid" id="emailid"
					class="form-control input-sm" />
			<%--<div class="has-error">
					<form:errors path="lastName" class="help-inline" />
				</div>--%> 
			</div>
		</div>
	</div>

	<div class="row">
		<div class="form-group col-md-12">
			<label class="col-md-3 control-lable" for="role">ROLE</label>
			<div class="col-md-7">
				<form:input type="text" path="role" id="role"
					class="form-control input-sm" />
				<%--<div class="has-error">
					<form:errors path="lastName" class="help-inline" />
				</div>--%> 
			</div>
		</div>
	</div>

	<div class="row">
		<div class="form-group col-md-12">
			<label class="col-md-3 control-lable" for="isaccessGranted">Isaccess Granted</label>
			<div class="col-md-7">
				<form:input type="text" path="isaccessgranted" id="isaccessGranted"
					class="form-control input-sm" />
				<%--<div class="has-error">
					<form:errors path="lastName" class="help-inline" />
				</div>--%> 
			</div>
		</div>
	</div>

	<div class="row">
		<div class="form-group col-md-12">
			<label class="col-md-3 control-lable" for="createDt">Create Dt</label>
			<div class="col-md-7">
				<form:input type="text" path="createdt" id="createDt"
					class="form-control input-sm" />
				<%--<div class="has-error">
					<form:errors path="lastName" class="help-inline" />
				</div>--%> 
			</div>
		</div>
	</div>

	<div class="row">
		<div class="form-group col-md-12">
			<label class="col-md-3 control-lable" for="updateDt">Update Dt</label>
			<div class="col-md-7">
				<form:input type="text" path="updatedt" id="updateDt" class="form-control input-sm" />
				<div class="has-error">
					<form:errors path="lastName" class="help-inline" />
				</div>
			</div>
		</div>
	</div>

	<input type="submit" value="register" />
	</form:form>

</body>


</html>