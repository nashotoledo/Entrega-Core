<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detalles Libros</title>
<link rel="stylesheet" href="/css/styles.css">
</head>
<body>
	<h1>Detalle del Libro</h1>
    <c:if test="${not empty nombreLibro}">
        <p>Nombre del libro: ${nombreLibro}</p>
        <p>Autor: ${nombreAutor}</p>
    </c:if>
    <c:if test="${not empty mensaje}">
        <p>${mensaje}</p>
    </c:if>
    <a href="/libros">Volver a la lista de libros</a>
</body>
</html>