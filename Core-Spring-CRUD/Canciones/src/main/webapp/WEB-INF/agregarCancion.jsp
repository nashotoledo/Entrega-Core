<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/styles.css">
</head>
<body>
	<h2>Agregar Nueva Canción</h2>
    
    <form:form action="/canciones/procesa/agregar" method="POST" modelAttribute="cancion">
		<form:label path="titulo">Titulo:</form:label> 
		<form:input type="text" path="titulo"/>
		<form:errors class="error" path="titulo"/>
		
		<form:label path="album">Album:</form:label> 
		<form:input type="text" path="album"/>
		<form:errors class="error" path="album"/>

		<form:label path="artista">Artista:</form:label> 
		<form:select path="artista">
			<c:forEach var="artista" items="${listaArtistas}">
				<option value="${artista.id}">${artista.nombre}</option>
			</c:forEach>
		</form:select>
		<form:errors class="error" path="artista"/>

		<form:label path="genero">Genero:</form:label> 
		<form:input type="text" path="genero"/>
		<form:errors class="error" path="genero"/>

		<form:label path="idioma">Idioma:</form:label> 
		<form:input type="text" path="idioma"/>
		<form:errors class="error" path="idioma"/>
		
		<button type="submit">Agregar Canción</button>
		
	</form:form>

    <a href="/canciones">Volver a la lista de canciones</a>
</body>
</html>