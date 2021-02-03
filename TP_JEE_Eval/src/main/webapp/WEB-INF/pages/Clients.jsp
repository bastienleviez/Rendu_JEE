<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Client</title>
</head>
<body>

  <table>
        <thead>
          <tr>
              <th>nom</th>
              <th>adresse</th>
          </tr>
        </thead>

        <tbody>
		 	<c:forEach items="${ clientliste }" var="client">
		        <tr>
		          <td><c:out value="${ client.nom }"></c:out></td>
		          <td><c:out value="${ client.adresse }"></c:out></td>
		        </tr>
		 	</c:forEach>
        </tbody>
    </table>
    <a href="add/client">Cliquez pour ajouter un client</a>

</body>
</html>