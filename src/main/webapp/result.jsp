<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><title>Result 10b</title></head>
<body>
<h2>Student Result</h2>
<p>Roll No: <%= request.getAttribute("rollno") %></p>
<p>Student Name: <%= request.getAttribute("sname") %></p>
<p>Subject 1: <%= request.getAttribute("s1") %></p>
<p>Subject 2: <%= request.getAttribute("s2") %></p>
<p>Subject 3: <%= request.getAttribute("s3") %></p>
<p>Subject 4: <%= request.getAttribute("s4") %></p>
<p>Subject 5: <%= request.getAttribute("s5") %></p>
<p>Average: <%= request.getAttribute("average") %></p>
<p>Result: <%= request.getAttribute("result") %></p>
<br>
<a href="index.jsp">Go Back</a>
</body>
</html>