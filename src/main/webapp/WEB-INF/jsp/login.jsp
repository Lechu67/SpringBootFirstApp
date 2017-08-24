<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
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
<%@ include file="common/footer.jspf" %>