<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><title>Welcome 9c</title></head>
<body>
<%
String name=request.getParameter("uname");
int expiry=Integer.parseInt(request.getParameter("expiry"));
session.setAttribute("user",name);
session.setMaxInactiveInterval(expiry);
out.print("Welcome! "+name);
out.print("<br>Session expiry time is set to "+expiry+" seconds");
out.print("<br>Kindly press the following link to check it within the set session time or wait there for the minutes set to see the session expiry<br>");
%>
<a href="second.jsp">Display the value</a>
</body>
</html>