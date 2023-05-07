<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<%@include file="./base.jsp"%>
</head>
<body>
	<div class="row">
		<div class="col-md-6 offset-md-3">
			<h1 class="text-center mb-3">Update Product Details</h1>
			<form action="${pageContext.request.contextPath }/handle-form" method="post">
				<div class="form-group">
					<label for="productInputName">Product Name</label> <input
						type="text" class="form-control" id="name" name="pname"
						value="${product.pname }"aria-describedby="emailHelp" placeholder="Enter product Name!">
				</div>
				<div class="form-group">
					<label for="exampleFormControlTextarea1">Product
						description</label>
					<textarea class="form-control" id="description" name="description"
						placeholder="Enter the product description!">${product.description }</textarea>
				</div>
				<div class="form-group">
					<label for="productInputName">Product Price</label> <input
						type="text" class="form-control" id="price" name="price"
						value="${product.price }" aria-describedby="emailHelp" placeholder="Enter product price!">
				</div>
				<div class="container text-center">
					<a href="${pageContext.request.contextPath }/"
						class="btn btn-outline-danger">Back</a>
					<button type="submit" class="btn btn-warning mb-2">Update</button>
				</div>




			</form>




		</div>



	</div>
</body>
</html>