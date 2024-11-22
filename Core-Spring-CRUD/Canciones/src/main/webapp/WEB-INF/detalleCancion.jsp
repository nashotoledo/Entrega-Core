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
	<h1>Detalle de la Canción</h1>
    <p>Título: ${cancion.titulo}</p>
    <p>Artista: ${cancion.artista.nombre}${cancion.artista.apellido}</p>
    <p>Álbum: ${cancion.album}</p>
    <p>Género: ${cancion.genero}</p>
    <p>Idioma: ${cancion.idioma}</p>
    <p>Fecha de Creación: ${cancion.fecha_creacion}</p>
    <p>Fecha de Actualización: ${cancion.fecha_actualizacion}</p>
    
    <form action="/canciones/procesa/eliminar/${cancion.id}" method="POST">
    	<input type="hidden" name="_method" value="DELETE"/>
    	<button>Eliminar</button>
    </form>
    <a href="/canciones/formulario/editar/${cancion.id}">Editar Canción</a>
    <a href="/canciones">Volver a lista de canciones</a>
    
</body>
</html>