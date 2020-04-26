<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">

		<div>
			<h2>Spring Customer CRUD Application</h2>

			
			<table class="table table-hover table-striped table-responsive">
				<thead>
					<tr>
						<th>ID</th>
						<th>Data</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach var="c" items="${customers}">
						<tr>
							<td>${c.id}</td>
							<td>${c.data}</td>
						</tr>
					</c:forEach>



				</tbody>
			</table>




		</div>


	</div>


</body>
</html>