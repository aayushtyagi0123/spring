<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page  isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body>
	<h1>welcome to the web application</h1>
  	<%
	String name = (String) request.getAttribute("name");
	Integer id=(Integer)request.getAttribute("Id");
	
    
	%>
         	<h1>
		My name is
		<%=name%></h1>

<h2><%=id %></h2>  

<hr>

<c:forEach items="${f}" var="item">

<h1>${item}</h1>

</c:forEach>


</body>
</html>