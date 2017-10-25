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
<form:form method="POST" modelAttribute="incRegistration" class="form-horizontal" action="incpost">
	<div class="generic-container">

		<div class="well lead">Incident Entry </div>
		
<c:if test="${incRegistration.incId!=null}">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="incId">INC ID</label>

				<div class="col-md-7">
					<form:input type="text" path="incId" id="incId"
						class="form-control input-sm" />

					<div class="has-error">

						<form:errors path="incId" class="help-inline" />

					</div>
					
                   </div>
                
                </div>
</c:if>
			</div>
			
			
			<div class="form-group col-md-12">
				<label class="col-md-3  control-lable" for="userInc.userId">User Id</label>

				<div class="col-md-7">
					<form:input type="text" path="userInc.userId" id="userInc.userId"
						class="form-control input-sm" />

					<div class="has-error">

						<form:errors path="userInc.userId" class="help-inline" />

					</div>

				</div>

			</div>
	   
	   </div>

			<div class="row">

				<div class="form-group col-md-12">

					<label class="col-md-3 control-lable" for="userGroup">User
						Group</label>

					<div class="col-md-7">

						<form:input type="text" path="userInc.userGroup" id="userGroup"
							class="form-control input-sm" />

					</div>

				</div>

			</div>
	  <c:if test="${incident.incId!=null}">
        <input type="submit" value="Update" />
        </c:if>
        <c:if test="${incident.incId==null}">
        <input type="submit" value="register" />
        </c:if>
        <input onclick="window.location.href='/imt/inclist'" type="button" value="back" />
		</form:form>
</body>
</html>