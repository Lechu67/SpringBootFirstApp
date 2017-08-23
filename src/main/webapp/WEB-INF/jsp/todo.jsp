<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>

<head>
<title>Add a todo</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>
	<div class="container">
		<form:form method="post" modelAttribute="todo">
			<fieldset class="form-group">
				<form:label path="description">Description</form:label>
				<form:input type="text" path="description" class="form-control"
					required="required" />
				<form:errors path="description" cssClass="test-warning"></form:errors>
			</fieldset>
			<fieldset>
				<form:label path="targetDate">Target date</form:label>
				<form:input type="date" path="targetDate" class="form-control" />
			</fieldset>
			<button type="submit" class="btn btn-success">Add</button>
		</form:form>
	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>

</html>