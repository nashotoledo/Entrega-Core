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
	<h1>Agregar Nuevo Artista</h1>
    
    <form:form action="/artistas/procesa/agregar" method="POST" modelAttribute="artista">
		<form:label path="nombre">Nombre:</form:label> 
		<form:input type="text" path="nombre"/>
		
		<form:label path="apellido">Apellido:</form:label> 
		<form:input type="text" path="apellido"/>
		
		<form:label path="biografia">Biografia:</form:label> 
		<form:textarea path="biografia" name="biografia"></form:textarea>
		
		<button type="submit">Guardar</button>
		
	</form:form>
    
    <br>
    <a href="/artistas">Volver a lista de artistas</a>
</body>
</html>