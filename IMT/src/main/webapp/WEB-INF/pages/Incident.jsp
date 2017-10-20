<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	background-color: lightblue;
}
</style>
</head>
<body>

	<div class="generic-container">

		<div class="well lead">User Registration Form</div>
		<form:form method="POST" modelAttribute="userRegistration"
			class="form-horizontal" action="urpost">

			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="incid">INC ID</label>

				<div class="col-md-7">
					<form:input type="text" path="incid" id="incid"
						class="form-control input-sm" />

					<div class="has-error">

						<form:errors path="incid" class="help-inline" />

					</div>
					
                   </div>
                   
				</div>

			</div>
			<div class="form-group col-md-12">
				<label class="col-md-3  control-lable" for="userid">User Id</label>

				<div class="col-md-7">
					<form:input type="text" path="userid" id="userid"
						class="form-control input-sm" />

					<div class="has-error">

						<form:errors path="userid" class="help-inline" />

					</div>

				</div>

			</div>
	   
	   </div>

			<div class="row">

				<div class="form-group col-md-12">

					<label class="col-md-3 control-lable" for="userGroup">User
						Group</label>

					<div class="col-md-7">

						<form:input type="text" path="userGroup" id="userGroup"
							class="form-control input-sm" />

						<div class="has-error">

							<form:errors path="userGroup" class="help-inline" />

						</div>

					</div>

				</div>

			</div>

		</form:form>
</body>
</html>