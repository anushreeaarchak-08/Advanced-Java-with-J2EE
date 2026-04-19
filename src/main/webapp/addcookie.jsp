<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><title>Add Cookie</title></head>
<body>
<%
String cname = request.getParameter("cname");
String cdomain = request.getParameter("cdomain");
int cage = Integer.parseInt(request.getParameter("cage"));
Cookie cookie = new Cookie(cname, cdomain);
cookie.setMaxAge(cage);
response.addCookie(cookie);
out.print("<h2>Cookie Added Successfully!</h2>");
out.print("<p>Name: " + cname + "</p>");
out.print("<p>Domain: " + cdomain + "</p>");
out.print("<p>Max Expiry Age: " + cage + " seconds</p>");
%>
<a href="showcookies.jsp">Go to Active Cookie List</a>
</body>
</html>