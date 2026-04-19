<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><title>Cookie Management</title></head>
<body>
<h2>Cookie Management</h2>
<form action="addcookie.jsp" method="post">
Name: <input type="text" name="cname"><br><br>
Domain: <input type="text" name="cdomain"><br><br>
Max Expiry Age (in sec): <input type="number" name="cage"><br><br>
<input type="submit" value="Add Cookie">
</form>
</body>
</html>