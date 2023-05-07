<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
</head>
<body>

	<div class="row">
		<div class="col-md-6 offset-md-3">

			<form>
				<div class="form-group">
					<label for="exampleFormControlInput1">Name</label> <input
						type="text" class="form-control" id="exampleFormControlInput1"
						placeholder="Enter your name!">
				</div>
				<div class="form-group">
					<label for="exampleFormControlInput1">Email address</label> <input
						type="email" class="form-control" id="exampleFormControlInput1"
						placeholder="Enter your email!">
				</div>
				<div class="form-group">
					<label for="exampleFormControlInput1">Password</label> <input
						type="password" class="form-control" id="exampleFormControlInput1"
						placeholder="Enter your password!">
				</div>

				<div class="container text-center">
					<button type="submit">Register</button>
					<a href="${pageContext.request.contextPath }/"
						class="btn btn-outline-danger">Login</a>
				</div>
			</form>


		</div>


	</div>


</body>
</html>