<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
<title>Todos for ${name}</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
</head>

<body>
	<div class="container">
		<table class="table table-striped">
				<h1>Your Todos: </h1>
					<caption>Your todos are</caption>
					<thead>
						<tr>
							<th>Description</th>
							<th>Target Date</th>
							<th>Status</th>
							<th>Delete</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${todos}" var="todo">
						<tr>
							<td>${todo.description}</td>
							<td>${todo.targetDate}</td>
							<td>${todo.done}</td>
							<td><a class="button" href="/delete">Delete</a></td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
				<div>
				<a class="button" href="/todo">Add todo</a>
				</div>
				<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
				<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	</div>
</body>

</html>