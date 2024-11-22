<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/styles.css">
</head>
<body>
	<h1>Lista de Artistas</h1>
	<ul>
    	<c:forEach var="artista" items="${artistas}">
        	<li>
            	<a href="/artistas/detalle/${artista.id}">${artista.nombre} ${artista.apellido}</a>
        	</li>
    	</c:forEach>
	</ul>
	<a href="/artistas/formulario/agregar" class="button">Agregar Nuevo Artista</a>
	<a href="/canciones">Ir a canciones</a>
</body>
</html>