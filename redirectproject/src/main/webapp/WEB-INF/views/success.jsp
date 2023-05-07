<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Name:<h1>${student.name}</h1>
Id:<h1>${student.id}</h1>
Date:<h1>${student.date}</h1>
Courses:<h1>${student.courses}</h1>
Gender:<h1>${student.type }</h1>
City:<h1>${student.address.city}</h1>
Street:<h1>${student.address.street}</h1>
</body>
</html>