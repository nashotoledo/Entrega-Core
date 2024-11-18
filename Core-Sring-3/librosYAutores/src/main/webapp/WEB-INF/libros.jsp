<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Libros</title>
<link rel="stylesheet" href="/css/styles.css">
</head>
<body>
	<h1>Lista de Libros</h1>
	<ul>
		<c:forEach var="libro" items="${listaLibros}">
			<li>
				<a href="/libros/${libro}">${libro}</a>
			</li>
		</c:forEach>
	</ul>
	
	<a href="/libros/formulario" class="agregar">Agregar un nuevo libro</a>
</body>
</html>