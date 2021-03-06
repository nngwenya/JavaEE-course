<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gwen's Travel Airline</title>
<link rel="stylesheet" type="text/css" href="resources/css/theme.css">
</head>
<body>
	<div class="container">
		<div class="title">Add Passenger</div>
		
		
			<% if(request.getAttribute("Error") != null){
			
			%>
			<fieldset>
				<legend>Error</legend>
				<ul>
					<%
						if(request.getAttribute("First_nameError") != null){ %>
						<li class="error">First_name Error</li>
						<%} %>
						
					<%
						if(request.getAttribute("last_nameError") != null){ %>
						<li class="error">last_name Error</li>
						<%} %>
						
					<%
						if(request.getAttribute("date_FormatError") != null){ %>
						<li class="error">Date_Of_Birth Invalid</li>
						<%} %>
				
				</ul>
			
			</fieldset>
			<%
			
			} %>		
		
		
		<fieldset>
			<legend>Personal details</legend>
			
				<form action="AddPassenger" method="post">
					<div class="inputfield">
					<label for="firstname" class="inputLabel">Firstname :</label> <input
								name="firstname" type="text" value="<%= request.getAttribute("firstname") %>"></input>
		
					</div>
		
					<div class="inputfield">
							<label for="lastname" class="inputLabel">Lastname :</label> <input
								name="lastname" type="text" value="<%= request.getAttribute("lastname") %>"></input>
		
					</div>
		
					<div class="inputfield">
							<label for="dob" class="inputLabel">DateOfBirth :</label> <input
								name="dob" type="text" value="<%= request.getAttribute("dob") %>"></input>
					</div>
					<div class="inputfield">
							<label for="gender" class="inputLabel">Gender :</label>
							 <select name="gender">
								<option value="Male">Male</option>
								<option value="Female">Female</option>
		
							</select>
					</div>
				<div class="inputfield" id="submitfield"></div>
				<input id="submitBtn" type="submit" value="Add new passenger"></input>

		</form>
		</fieldset>
	</div>

</body>
</html>