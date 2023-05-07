<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center">Welcome to Product App</h1>
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">S.NO.</th>
							<th scope="col">Product_Name</th>
							<th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${product }" var="p">
							<tr>
							   <th scope="row">TECNO${p.pid }</th>
								<td>${p.pname }</td>
								<td>${p.description }</td>
								<td>&#8377;${p.price}</td>
								<td><a href="delete/${p.pid }">
								<i class="fa-sharp fa-solid fa-trash"></i></a>
								<a href="update/${p.pid }"><i class="fa-solid fa-pen-nib"></i>
								</a></td>
							</tr>
							
						</c:forEach>
					</tbody>
				</table>
				<div class="container text-center">
					<a href="addproduct" class="btn btn-outline-danger">Add Product</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>