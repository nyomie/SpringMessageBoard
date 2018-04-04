<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring Message Board</title>
</head>
<body>
	<h2>Message Board</h2>
	<c:forEach var="msg" items="${messages}">
		${msg}
		<br/>
	</c:forEach>
	<br>
	<br> 
	<form method="POST" action="addmessage">
	${user.fullname} : <input type="text" name="message">
	<input type="submit" value="SEND">
	</form>
	<br>
	<br>
	Done here? <a href="../logout.jsp">Log out</a>
</body>
</html>