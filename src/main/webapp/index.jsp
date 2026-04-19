<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>User Data 10a</title>
<script>
function validate() {
    var username = document.getElementById("username").value;
    var email = document.getElementById("email").value;
    var designation = document.getElementById("designation").value;
    if(username == "") {
        alert("Username is required!");
        return false;
    }
    if(email == "" || !email.includes("@")) {
        alert("Valid Email is required!");
        return false;
    }
    if(designation == "") {
        alert("Designation is required!");
        return false;
    }
    return true;
}
</script>
</head>
<body>
<h2>User Data Form</h2>
<form action="UserDataServlet" method="post" onsubmit="return validate()">
Username: <input type="text" id="username" name="username"><br><br>
Email: <input type="text" id="email" name="email"><br><br>
Designation: <input type="text" id="designation" name="designation"><br><br>
<input type="submit" value="Submit">
</form>
</body>
</html>