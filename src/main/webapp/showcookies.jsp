<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><title>Active Cookies</title></head>
<body>
<h2>Active Cookie List</h2>
<%
Cookie[] cookies = request.getCookies();
if(cookies != null) {
    for(Cookie c : cookies) {
        out.print("<p>Name: " + c.getName() + 
                 " | Value: " + c.getValue() + 
                 " | Max Age: " + c.getMaxAge() + "</p>");
    }
} else {
    out.print("<p>No cookies found!</p>");
}
%>
<a href="index.jsp">Go Back</a>
</body>
</html>