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
<form:form method="POST" modelAttribute="inchRegistration" class="form-horizontal" action="inchistpost">
<div class="generic-container">

		<div class="well lead">Incident History Entry</div>
		
<c:if test="${inchRegistration.incidentLog.incId!=null}">
			
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="incId">INC ID</label>

				<div class="col-md-7">
					<form:input type="text" path="incidentLog.incId" id="incId" readonly="true"
						class="form-control input-sm" />

					<div class="has-error">

						<form:errors path="incidentLog.incId" class="help-inline" />

					</div>
					
                   </div>
                
                </div>
                </c:if>

			
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="application">Application</label>

				<div class="col-md-7">
					<form:input type="text" path="application" id="application"
						class="form-control input-sm" />

					<div class="has-error">

						<form:errors path="application" class="help-inline" />

					</div>
					
                   </div>
                
                </div>

			
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="hcId">HcId</label>

				<div class="col-md-7">
					<form:input type="text" path="hcId" id="hcId"
						class="form-control input-sm" />

					<div class="has-error">

						<form:errors path="hcId" class="help-inline" />

					</div>
					
                   </div>
                
                </div>

			
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="environment">Environment</label>

				<div class="col-md-7">
					<form:input type="text" path="environment" id="environment"
						class="form-control input-sm" />

					<div class="has-error">

						<form:errors path="environment" class="help-inline" />

					</div>
					
                   </div>
                
                </div>

			
			
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="status">Status</label>

				<div class="col-md-7">
				<form:select path="status" required="required">
							<form:option value="" label="--- Select ---" />
							<form:option value="New" label="New" />
							<form:option value="Open" label="Open" />
							<form:option value="In Progress" label="In Progress" />
							<form:option value="Pending" label="Pending" />
							<form:option value="On hold" label="On hold" />
							<form:option value="Close" label="Close" />
						</form:select>
					<div class="has-error">
						<form:errors path="status" class="help-inline" />

					</div>
					
                   </div>
                
                </div>

			
			
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="severiety">Severiety</label>

				<div class="col-md-7">
				<form:select path="severiety" required="required">
							<form:option value="" label="--- Select ---" />
							<form:option value="Low" label="Low" />
							<form:option value="Medium" label="Medium" />
							<form:option value="high" label="high" />
				
						</form:select>
					<div class="has-error">
					<form:errors path="severiety" class="help-inline" />

					</div>
					
                   </div>
                
                  </div>
			
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="summary">Summary</label>

				<div class="col-md-7">
					<form:input type="text" path="summary" id="summary"
						class="form-control input-sm" />

					<div class="has-error">

						<form:errors path="summary" class="help-inline" />

					</div>
					
                   </div>
                
                </div>

			</div>
			
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="description">Description</label>

				<div class="col-md-7">
					<form:input type="text" path="description" id="description"
						class="form-control input-sm" />

					<div class="has-error">

						<form:errors path="description" class="help-inline" />

					</div>
					
                   </div>
                
                </div>

			
			
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="assignedTo">AssignedTo</label>

				<div class="col-md-7">
					<form:input type="text" path="assignedTo" id="assignedTo"
						class="form-control input-sm" />

					<div class="has-error">

						<form:errors path="assignedTo" class="help-inline" />

					</div>
					
                   </div>
                
                </div>

			
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="assignedGroup">AssignedGroup</label>

				<div class="col-md-7">
					<form:input type="text" path="assignedGroup" id="assignedGroup"
						class="form-control input-sm" />

					<div class="has-error">

						<form:errors path="assignedGroup" class="help-inline" />

					</div>
					
                   </div>
                
                </div>

			
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="requestedUser">RequestedUser</label>

				<div class="col-md-7">
					<form:input type="text" path="requestedUser" id="requestedUser"
						class="form-control input-sm" />

					<div class="has-error">

						<form:errors path="requestedUser" class="help-inline" />

					</div>
					
                   </div>
                
                </div>

			
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="requestedGroup">RequestedGroup</label>

				<div class="col-md-7">
					<form:input type="text" path="requestedGroup" id="requestedGroup"
						class="form-control input-sm" />

					<div class="has-error">

						<form:errors path="requestedGroup" class="help-inline" />

					</div>
					
                   </div>
                
                </div>

			
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="comments">Comments</label>

				<div class="col-md-7">
					<form:input type="text" path="comments" id="comments"
						class="form-control input-sm" />

					<div class="has-error">

						<form:errors path="comments" class="help-inline" />

					</div>
					
                   </div>
                
                </div>
 <input type="submit" value="Create Incident" />
	</form:form>
</body>
</html>