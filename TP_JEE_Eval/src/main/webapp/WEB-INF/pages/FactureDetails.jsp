<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Détails des factures</title>
</head>
<body>

	<h2>Facture<c:out value="${ facture.numero }"></c:out></h2>
	<h2>Date<c:out value="${ facture.date }"></c:out></h2>
	<h2>Prix<c:out value="${ facture.prix }"></c:out></h2>

	<h1>Client propriétaire de cette facture</h1>
	<h3>Nom :<c:out value="${ facture.client.nom }"></c:out></h3>
	<h3>Adresse :<c:out value="${ facture.client.adresse }"></c:out></h3>

	<table>
		<thead>
			<tr>
				<th>Article</th>
				<th>Qte</th>
				<th>Prix</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${ facture.ligneFacture }" var="ligneFacture">
				<tr>
					<td><c:out value="${ ligneFacture.article.nom }"></c:out></td>
					<td><c:out value="${ ligneFacture.qte }"></c:out></td>
					<td><c:out value="${ ligneFacture.prix }"></c:out></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>