<%@ page language="java" contentType="text/html; charset = ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<link href="${pageContext.request.contextPath}/style/UserManagement.css" rel="stylesheet" type="text/css">
<title>User Management</title>
</head>
<body>

	<h1>User Management</h1>
	<form action="loadUsers">
		<input type="submit" value="Go To User Management Home" /> 	
	</form>
</body>
</html>