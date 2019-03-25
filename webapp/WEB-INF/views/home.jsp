<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bienvenido a Cine App</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<h1>Lista de peliculas</h1>
	
	<table class="tables table-striped table-bordered table-hover">
		<thead>
			<tr>
				<th>Id</th>
				<th>Titulo</th>
				<th>Duracion</th>
				<th>Clasificacion</th>
				<th>Genero</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${peliculas}" var="pelicula">
				<tr>
				<td>${pelicula.id }</td>				
				<td>${pelicula.titulo}</td>
				<td>${pelicula.duracion} min.</td>
				<td>${pelicula.clasificacion}</td>
				<td>${pelicula.genero}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>