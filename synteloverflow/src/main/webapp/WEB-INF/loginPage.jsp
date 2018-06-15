<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>        
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	 
	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
 		<c:if test="${logoutMessage != null}">
 			<c:out value="${logoutMessage}"></c:out>
 			</c:if>
		<h1 class="page-header">Login</h1>
		<c:if test="${errorMessage != null}">
 			<c:out value="${errorMessage}"></c:out>
 			</c:if>
	 	<div class="jumbotron">
		   <form method = "POST" action="/login">
		   	<p>
		   		<label for="username">Username</label>
		   		<input type="text" id="username" name="username"/>
		   	</p>
		   	<p>
		   		<label for="password">Password</label>
		   		<input type="password" id="password" name="password"/>
		   	</p>
		   	<p>
		   		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token }"/>
		   		<input class="btn btn-success" type="submit" value="Login!"/>
		   	</p>
		   </form>
	   </div>
	</div>
</body>
</html>