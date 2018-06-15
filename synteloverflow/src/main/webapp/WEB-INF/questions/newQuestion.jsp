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
<title>New Question</title>
</head>
<body>
		<div class="container">
			<div class="col-md-6 col-md-offset-3">
			 	<h1 class="page-header">New Question</h1>
			 <form:form method="POST" action="/new" modelAttribute="newQuestion">

		 		<form:input type="hidden" path="user" value="${userId}"/>
		 	 	<form:label path="title">Title:</form:label>
		 	 	<br>
		 	 	<form:input path="title"/>
		 	 	<br>
		 	 	<br>
	 	 	<form:label path="content">Content:</form:label>
	 	 	<br>
	 	 	<form:textarea type="text" path="content" rows="4" cols="50"/>	 	
	 	 	<br>
	 	 	<form:label path="tags">Tag:</form:label>
		 	 	<br>
		 	 	<form:input path="tags"/>
		 	<br>
	 	 <input class="btn btn-success" type="submit" value="Ask"/>
		 </form:form>
		</div>
	</div>
</body>
</html>