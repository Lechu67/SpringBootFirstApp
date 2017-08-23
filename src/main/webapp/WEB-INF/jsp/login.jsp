<html>

<head>
<title>First Web app</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>
	<div class="container">
		<h2>ToDo App</h2>
		<font color="red">${errorMessage}</font>
		<form method="post">
			<fieldset class="form-group">
				<div class="col-xs-2">
					<label>Name</label><input type="text" name="name"
						class="form-control" /> <label>Password</label><input
						type="password" name="password" class="form-control" />
						<br>
					<button type="submit" class="btn">Log in</button>
				</div>
			</fieldset>
		</form>

	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>

</html>