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
		<fieldset>
			<legend>Personal details</legend>
			<div class="inputfield">
				<form action="AddPassenger" method="post">
					<label for="firstname" class="inputLabel">Firstname :</label> <input
						name="firstname" type="text"></input>

				</form>
			</div>

			<div class="inputfield">
				<form action="AddPassenger" method="post">
					<label for="lastname" class="inputLabel">Lastname :</label> <input
						name="lastname" type="text"></input>

				</form>
			</div>

			<div class="inputfield">
				<form action="AddPassenger" method="post">
					<label for="dob" class="inputLabel">DateOfBirth :</label> <input
						name="dob" type="text"></input>

				</form>
			</div>

			<div class="inputfield">
				<form action="AddPassenger" method="post">
					<label for="gender" class="inputLabel">Gender :</label> <select
						name="gender">
						<option value="Male">Male</option>
						<option value="Female">Female</option>

					</select>
		</fieldset>
		<div class="inputfield" id="submitfield"></div>
		<input id="submitBtn" type="submit" value="Add new passenger"></input>

		</form>
	</div>


	</div>
</body>
</html>