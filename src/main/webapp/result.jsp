<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><title>Result 10a</title></head>
<body>
<h2>User Data</h2>
<p>Username: <%= request.getAttribute("username") %></p>
<p>Email: <%= request.getAttribute("email") %></p>
<p>Designation: <%= request.getAttribute("designation") %></p>
<br>
<a href="index.jsp">Go Back</a>
</body>
</html>