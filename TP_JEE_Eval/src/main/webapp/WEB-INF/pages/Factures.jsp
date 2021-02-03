<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factures</title>
</head>
<body>

	<table>
		<thead>
			<tr>
				<th>Client</th>
				<th>Numero</th>
				<th>Date</th>
				<th>Details</th>
				<th>Prix</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${ factureliste }" var="facture">
				<tr>
					<td><c:out value="${ facture.client }"></c:out></td>
					<td><c:out value="${ facture.numero }"></c:out></td>
					<td><c:out value="${ facture.date }"></c:out></td>
					<td><a href="detailFacture?id=${ facture.id }">Details</a></td>
					<td><c:out value="${ facture.prix }"></c:out> euros</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>