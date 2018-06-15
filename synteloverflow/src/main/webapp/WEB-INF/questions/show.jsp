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
<title>Question</title>
</head>
<body>
<br>
 	<div class="container">
		<div class="col-md-6 col-md-offset-3">
		<a href="/">Home</a>
			<div class="panel panel-default">
			  <div class="panel-heading"> <c:out value="${question.getTitle() }"/></div> 
			  <br>
			  
			  
			  <div class="panel-body"><c:out value="${question.getContent() }"/></div> 
			</div>
		
			   	 <c:forEach  var="q" items="${question.getTags()}">
    					<p>Tags:  <button><c:out value="${q.subject}"></c:out></button></p>
				   		
				   </c:forEach>
  					
			   	<h3>Answers</h3>
			   	<ul class="list-group">
	      			<c:forEach var="ans" items="${question.answers}">				
						<li class="list-group-item"><c:out value="${ans.content}" /></li>
					</c:forEach>
				</ul>
				   <form:form class="form-group" action="/answer/create" method="POST" modelAttribute="Amodel">
				   <form:input type="hidden" path="question" value="${question.id}"/>
				   <form:input type="hidden" path="user" value="${userId.id}"/>
			       <form:label path="content">Answer :</form:label>
			      	<br>
			      	<form:textarea class="form-control" id="comment" path="content"  type="text" rows="5" cols="20"/>     
			      	<br>
			     	<input type="submit" name="Answer it!"/>
		  		</form:form>
	  	</div>
  	</div>
   		
   
   

</body>
</html>