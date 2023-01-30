<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>x-workz</title>
</head>
<body>
<h1>Send Details</h1>
<form action="manu" method="post">
<pre>
First Name<input type="text" name="fname"/>
Last Name<input type="text" name="lname"/>
Gender<input type="radio" value="male"/>
Gender<input type="radio" value="female"/>
Reason<textarea rows="6"cols="15 name="reason"></textarea/>
Address<textarea rows="6"cols="15" name="address"></textarea/>

<input type="submit" value="send"/>
</pre>
</form>

</body>
</html>