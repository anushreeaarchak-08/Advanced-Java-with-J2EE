<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Marks 10b</title>
<script>
function validate() {
    var rollno = document.getElementById("rollno").value;
    var sname = document.getElementById("sname").value;
    if(rollno == "") { alert("Roll No is required!"); return false; }
    if(sname == "") { alert("Student Name is required!"); return false; }
    var subs = ["s1","s2","s3","s4","s5"];
    for(var i=0; i<subs.length; i++) {
        var val = document.getElementById(subs[i]).value;
        if(val=="" || isNaN(val) || val<0 || val>100) {
            alert("Enter valid marks for Subject "+(i+1));
            return false;
        }
    }
    return true;
}
</script>
</head>
<body>
<h2>Student Marks Form</h2>
<form action="ResultServlet" method="post" onsubmit="return validate()">
Roll No: <input type="text" id="rollno" name="rollno"><br><br>
Student Name: <input type="text" id="sname" name="sname"><br><br>
Subject 1: <input type="number" id="s1" name="s1"><br><br>
Subject 2: <input type="number" id="s2" name="s2"><br><br>
Subject 3: <input type="number" id="s3" name="s3"><br><br>
Subject 4: <input type="number" id="s4" name="s4"><br><br>
Subject 5: <input type="number" id="s5" name="s5"><br><br>
<input type="submit" value="Submit">
</form>
</body>
</html>