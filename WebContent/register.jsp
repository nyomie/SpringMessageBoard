<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>
<form method="POST" action="spring/register">
	Username: <input type="text" name="username"><br/>
	Password: <input type="password" name="password"><br/>
	Full Name: <input type="text" name="fullname"><br/>
	<input type="submit" value="REGISTER">
</form>	
<br/>
Already have an account? <a href="index.jsp">Login</a>
</body>
</html>