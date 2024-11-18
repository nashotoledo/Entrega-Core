<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario</title>
<link rel="stylesheet" href="/css/styles.css">
</head>
<body>
	<h1>Agregar un nuevo libro</h1>
    <form action="/procesa/libro" method="POST">
        <label for="nombreLibro">Nombre del Libro:</label>
        <input type="text" id="nombreLibro" name="nombreLibro" required>
        <label for="nombreAutor">Nombre del Autor:</label>
        <input type="text" id="nombreAutor" name="nombreAutor" required>
        <button type="submit">Agregar Libro</button>
    </form>
    
    <a href="/libros">Volver a la lista de libros</a>
</body>
</html>