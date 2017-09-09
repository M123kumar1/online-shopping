<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@include file="../shared/flows-header.jsp" %>
	<div class="container">
		<div class="row">
					<div class="col-md-6 col-md-offset-3">
						<div class="panel panel-primary">
							<div class="panel-heading">
								<h4>Sign Up-Address</h4>
							</div>
							
							<div class="panel-body">
								
 								<form:form method="POST" class="form-horizontal" id="registerForm" modelAttribute="billing">
 									<div class="form-group"> 
 										<label class="control-label col-md-4" for="addressLineOne">Address Line One</label> 
 										<div class="col-md-8"> 
 											<form:input type="text" path="addressLineOne" class="form-control" placeholder="Enter Address Line One"/>
 											<form:errors path="addressLineOne" cssClass="help-block" element="em" />
 										</div> 
 									</div> 
 									<div class="form-group"> 
 										<label class="control-label col-md-4" for="addressLineTwo">Address Line Two</label>
 										<div class="col-md-8"> 
 											<form:input type="text" path="addressLineTwo" class="form-control" placeholder="Enter Address Line Two"/>
 											<form:errors path="addressLineTwo" cssClass="help-block" element="em" /> 
 										</div> 
 									</div> 
 									<div class="form-group"> 
 										<label class="control-label col-md-4" for="city">City</label>
 										<div class="col-md-8"> 
 											<form:input type="text" path="city" class="form-control" placeholder="Enter City Name"/>
 											<form:errors path="city" cssClass="help-block" element="em" /> 
 										</div> 
 									</div> 
 									<div class="form-group"> 
 										<label class="control-label col-md-4" for="postalCode">Postal Code</label>
 										<div class="col-md-8"> 
 											<form:input type="text" path="postalCode" class="form-control" placeholder="xxxxxxxxxx" maxlength="6"/>
 											<form:errors path="postalCode" cssClass="help-block" element="em" /> 
 										</div> 
 									</div>
 									<div class="form-group"> 
 										<label class="control-label col-md-4" for="state">State</label>
 										<div class="col-md-8"> 
 											<form:input type="text" path="state" class="form-control" placeholder="Enter State Name"/>
 											<form:errors path="state" cssClass="help-block" element="em" /> 
 										</div> 
 									</div>
 									<div class="form-group"> 
 										<label class="control-label col-md-4" for="country">Country Name</label> 
 										<div class="col-md-8"> 
 											<form:input type="text" path="country" class="form-control" placeholder="Enter Country Name"/>
 											<form:errors path="country" cssClass="help-block" element="em" />
 										</div> 
 									</div> 
 									<div class="form-group"> 
 										<div class="col-md-offset-4 col-md-8">
											<!-- submit button for moving to the personal -->
 											<button type="submit" class="btn btn-primary" name="_eventId_personal">
 												<span class="glyphicon glyphicon-chevron-left"></span>Previous - personal
 											</button> 
 											<!-- submit button for moving to the confirm -->
 											<button type="submit" class="btn btn-primary" name="_eventId_confirm">
 												next - confirm<span class="glyphicon glyphicon-chevron-right"></span>
 											</button> 
 										</div> 
 									</div> 
								</form:form> 
							</div>
						</div>
					</div>
				</div>
						
	</div>
<%@include file="../shared/flows-footer.jsp" %>