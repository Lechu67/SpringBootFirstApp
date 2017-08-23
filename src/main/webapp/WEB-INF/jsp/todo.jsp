<html>

<head>
<title>Add a todo</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>
	<div class="container">

		<form method="post">
			<fieldset class="form-group">
				<label>Description</label> <input type="text" name="description"
					class="form-control" required="required"/> 
				<label>Target date</label> <input
					type="date" name="targetDate" class="form-control" />
			</fieldset>
			<button type="submit" class="btn btn-success">Add</button>
		</form>
	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>

</html>