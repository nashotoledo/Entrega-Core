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
	<h1>Detalle del Artista</h1>
	<p>Nombre: ${artista.nombre}</p>
	<p>Apellido: ${artista.apellido}</p>
	<p>Biografía: ${artista.biografia}</p>
	<p><strong>Fecha de Creación:</strong> ${artista.fecha_creacion}</p>
    <p><strong>Fecha de Actualización:</strong> ${artista.fecha_actualizacion}</p>
    
	<h2>Canciones del Artista:</h2>
    <ul>
        <c:forEach var="cancion" items="${canciones}">
                <li>${cancion.titulo}</li>
        </c:forEach>
    </ul>
	<a href="/artistas">Volver a lista de artistas</a>
</body>
</html>