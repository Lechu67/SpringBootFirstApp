<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
	<div class="container">
		<form:form method="post" modelAttribute="todo">
			<form:hidden path="id" />
			<fieldset class="form-group">
				<form:label path="description">Description</form:label>
				<form:input type="text" path="description" class="form-control"
					required="required" />
				<form:errors path="description" cssClass="test-warning"></form:errors>
			</fieldset>
			<fieldset>
				<form:label path="targetDate">Target date</form:label>
				<form:input type="text" path="targetDate" class="form-control"
					required="required" />
				<form:errors path="targetDate" cssClass="test-warning"></form:errors>
			</fieldset>
			<button type="submit" class="btn btn-success">Add</button>
		</form:form>
	</div>
<%@ include file="common/footer.jspf" %>