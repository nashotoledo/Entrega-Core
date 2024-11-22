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
	<h1>Lista de Canciones</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Título</th>
                <th>Artista</th>
                <th>Detalle</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="cancion" items="${canciones}">
                <tr>
                    <td>${cancion.titulo}</td>
                    <td>${cancion.artista.nombre} ${cancion.artista.apellido}</td>
                    <td><a href="/canciones/detalle/${cancion.id}">Ver detalle</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/artistas" class="button">Artistas</a>
    <a href="/canciones/formulario/agregar" class="button">Agregar Nueva Canción</a>
</body>
</html>