<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Veiculos</title>
</head>
<body>
	<div class="container">
		<div class="card text-center">
			<%@include file="/WEB-INF/jsp/MenuBar.jsp" %>
			<div class="card-body">
				<div class="row">
					<table class = "table table-striped table-bordered"> 
						<tr class = "thead-dark">
							<th>Codigo</th>
							<th>Modelo</th>
							<th>Marca</th>
							<th>Valor do aluguel</th>
						</tr>
						<c:forEach items="${veiculos}" var="item">
							<tr>	
								<td>${item.getIdVeiculo()}</td>
								<td>${item.getModelo()}</td>
								<td>${item.getAno()}</td>
								<td>${item.getDisponibilidade()}</td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		
		</div>
		
	</div>
</body>
</html>