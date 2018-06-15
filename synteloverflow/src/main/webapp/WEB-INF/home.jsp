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
<title>Home Page</title>
</head>
<body>
	<div class="container">
	  <h1 class="page-header">Welcome <c:out value="${currentUser.username }"></c:out></h1>
	  
	  
	  <form id="logoutForm" method="POST" action="/logout">
	  	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token }"/>
	  	<div class="btn-toolbar">
	  		<input class="btn btn-danger" type="submit" value="Logout"/>
	  		
	  		<a class="btn btn-primary" href="/questions/new/${currentUser.id}">Ask Question</a>
	  	</div>
	  </form>
	  <br>
	  <div class="row">
	  	<h3>Your Questions</h3>
    		<ul class="list-group">
	      <c:forEach var="q" items="${currentUser.questions}">
			<li class="list-group-item"><a href="/questions/${q.id}"><c:out value="${q.title}"/></a></li>
		</c:forEach>
			</ul>
			<br>
			<h3>All Questions</h3>
			<ul class="list-group">
				<c:forEach var="all" items="${ allQ}">
					<li class="list-group-item"><a href="/questions/${all.id}"><c:out value="${all.title}"></c:out></a><span class="badge">Answers:  <c:out value="${all.answers.size()}"></c:out></span>
				  <!-- 	<p>Asked By: <c:out value="${all.user.username}"></c:out></p> -->
					 <p class="list-group-item-text">Asked By: <c:out value="${all.user.username}"></c:out></p></li>
				</c:forEach>
			</ul>
	  	</div>
	  </div>
	 </div>
</body>
</html>