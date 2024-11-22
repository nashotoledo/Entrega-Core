<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Cancion</title>
<link rel="stylesheet" href="/css/styles.css">
</head>
<body>
	<h1>Editar Canción</h1>
    <form:form action="/canciones/procesa/editar/${cancion.id}" method="POST" modelAttribute="cancion">
        <div>
        	<input type="hidden" name="_method" value="PUT">
            <label for="titulo">Título:</label>
            <form:input path="titulo" />
            <form:errors path="titulo" Class="error" />
        </div>
        <div>
            <label for="artista">Artista:</label>
            <form:input path="artista" />
            <form:errors path="artista" Class="error" />
        </div>
        <div>
            <label for="album">Álbum:</label>
            <form:input path="album" />
            <form:errors path="album" Class="error" />
        </div>
        <div>
            <label for="genero">Género:</label>
            <form:input path="genero" />
            <form:errors path="genero" Class="error" />
        </div>
        <div>
            <label for="idioma">Idioma:</label>
            <form:input path="idioma" />
            <form:errors path="idioma" Class="error" />
        </div>
        <div>
            <button type="submit">Actualizar Canción</button>
        </div>
    </form:form>
    <a href="/canciones">Volver a lista de canciones</a>
</body>
</html>