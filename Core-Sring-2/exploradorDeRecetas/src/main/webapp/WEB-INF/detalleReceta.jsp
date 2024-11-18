<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/styles.css">
</head>
<body>
	<h1>Detalle de la Receta</h1>
    <c:if test="${not empty mensaje}">
        <p>${mensaje}</p>
    </c:if>
    <c:if test="${empty mensaje}">
        <h2>${nombre}</h2>
        <h3>Ingredientes:</h3>
        <ul>
            <c:forEach var="ingrediente" items="${ingredientes}">
                <li>${ingrediente}</li>
            </c:forEach>
        </ul>
    </c:if>
    
    <a href="/recetas">Volver</a>
</body>
</html>