<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Article</title>
</head>
<body>

<table>
        <thead>
          <tr>
	        	<th>Numéro</th>
	            <th>Nom</th>
	            <th>Prix</th>
          </tr>
        </thead>

        <tbody>
        	<% int i = 1; %>
		 	<c:forEach items="${ listeArticles }" var="article">
		        <tr>
		        	<td><% out.println(i); %></td>
		          	<td><c:out value="${ article.nom }"></c:out></td>
		          	<td><c:out value="${ article.prix }"></c:out> euros</td>
		        </tr>
		        <% i++; %>
		 	</c:forEach>
        </tbody>
    </table>
 	<br /> <br />
 
 	<a href="add/article">Vous pouvez ajouter un article, ici</a>


</body>
</html>