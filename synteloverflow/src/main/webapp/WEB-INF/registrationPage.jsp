<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	 
	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<div class="container">
		 <h1 class="page-header">Register</h1>
		 	<div class="jumbotron">
		 		<c:if test="${usernameErr != null}">
		 			<c:out value="${usernameErr}"></c:out>
		 			</c:if>
			 <p><form:errors path="user.*"/></p>
			 <form:form method="POST" action="/registration" modelAttribute="user">
			 	<p>	
			 	 	<form:label path="username">Username:</form:label>
			 	 	<form:input path="username"/>
			 	 </p>
			 	 <p>	
			 	 	<form:label path="password">Password:</form:label>
			 	 	<form:input type="password" path="password"/>
			 	 </p>
			 	 <p>	
			 	 	<form:label path="passwordConfirmation">Confirm Password:</form:label>
			 	 	<form:input type="password" path="passwordConfirmation"/>
			 	 </p>
			 	 
			 	 <input class="btn btn-primary" type="submit" value="Register"/>
			 </form:form>
		</div>
	</div>
</body>
</html>