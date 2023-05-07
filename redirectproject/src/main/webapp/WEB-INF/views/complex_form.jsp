<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
 <link href="<c:url value="/resources/css/style.css"/>"/>
     <script src="<c:url value="/resources/js/script.js"/>"/>
<title>Hello, world!</title>
</head>
<body>

	<div class="container">
		<card mt-5> <card-body>
		<form action="handlerform" method="post">
			<h1 class="text-center">Complex-Form</h1>
			<div class="alert alert-danger" role="alert"><form:errors path="student.*"/></div>
			<div class="form-group">
				<input class="form-control" type="text" name="name"
					placeholder="Enter your name!">
			</div>
			<div class="form-group">
				<input class="form-control" type="text" name="id"
					placeholder="Enter your id!">
			</div>
			<div class="form-group">
				<input class="form-control" type="text" name="date" placeholder="DD/MM/YYYY">

			</div>
			<div class="form-group">
				<label for="exampleFormControlSelect2">Example multiple
					select</label> <select multiple class="form-control"
					id="exampleFormControlSelect2" name="courses">
					<option>C</option>
					<option>C#</option>
					<option>Java</option>
					<option>Python</option>
					<option>Sql</option>
				</select>

			</div>
			<label>Select Gender:</label>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="gender"
					id="exampleRadios1" value="Male" checked> <label
					class="form-check-label" for="exampleRadios1">Male </label>
			</div>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="gender"
					id="exampleRadios2" value="Female"> <label
					class="form-check-label" for="exampleRadios2">Female </label>
			</div>

			<div class="form-group">
				<label for="exampleFormControlSelect1">Student Type:</label> <select
					class="form-control" id="exampleFormControlSelect1" name="type">
					<option>Old Student</option>
					<option>New Student</option>

				</select>
			</div>
			<card> <card-body> <label>Your Address:</label>
			<div class="form-group">
				<input class="form-control" type="text" name="address.street"
					placeholder="Enter street!">
			</div>
			<div class="form-group">
				<input class="form-control" type="text" name="address.city"
					placeholder="Enter city!">
			</div>
			<div class="form-group">
				<button type="submit">Submit</button>
			</div>
		</form>
		</card-body> </card>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>