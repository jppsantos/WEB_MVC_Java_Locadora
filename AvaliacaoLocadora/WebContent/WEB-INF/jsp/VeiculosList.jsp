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
<div class="tab-content">
	<div id="lista" class="container tab-pane active">
		<div class="container">
		<div class="card text-center">
			<%@include file="/WEB-INF/jsp/MenuBar.jsp" %>
			<div class="card-body">
				<div class="row">
					<div class="search-container">
						<form action="ControllerServlet" method="get">
							<input type="text"  class="form-control" name = "txtModelo" placeholder="Digite o modelo do veiculo">
							<input type="submit" class="btn btn-info" value ="Pesquisar">
							<input type="hidden" name = "logica" value = "PesquisaVeiculosLogica">
						</form>	
					</div>
					
					<table class = "table table-striped table-bordered"> 
						<tr class = "thead-dark">
							<th>Codigo</th>
							<th>Modelo</th>
							<th>Marca</th>
							<th>Valor do aluguel</th>
							<th>Editar</th>
						</tr>
						<c:forEach items="${veiculos}" var="item">
							<tr>	
								<td>${item.getIdVeiculo()}</td>
								<td>${item.getModelo()}</td>
								<td>${item.getAno()}</td>
								<td>${item.getDisponibilidade()}</td>
								<td>
									<div>
									<form action="ControllerServlet" method="get">
										<input type="submit" class="btn btn-info" value ="Editar">
										<input type="hidden" name = "logica" value = "CarregaDadosVeiculoLogica">
										<input type="hidden" name = "txtIdVeiculo" value = "${item.getIdVeiculo()}">
									</form>
									<form action="ControllerServlet" method="get">
										<input type="submit" class="btn btn-danger" value ="Excluir">
										<input type="hidden" name = "logica" value = "ExcluirVeiculoLogica">
										<input type="hidden" name = "txtIdVeiculo" value = "${item.getIdVeiculo()}">
									</form>
									</div>
									
								</td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		
		</div>
		
	</div>
	</div>
</div>

	
</body>
</html>