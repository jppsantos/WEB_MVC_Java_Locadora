<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta charset="UTF-8">
<script src="javaScript.js"></script>
<title>Lista de Veiculos</title>
</head>
<body>
<div class="tab-content">
	<div id="lista" class="container tab-pane active">
		<div class="container-dark">
		<div class="card-dark text-center">
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
							<th>Ano</th>
							<th>Disponibilidade</th>
							<th>Opcoes</th>
						</tr>
						<c:forEach items="${veiculos}" var="item">
							<tr>	
								<td>${item.getIdVeiculo()}</td>
								<td>${item.getModelo()}</td>
								<td>${item.getAno()}</td>
								<td>${item.getDisponibilidade()}</td>
								<td>
									<div>
										<a href="http://localhost:8080/AvaliacaoLocadora/ControllerServlet?logica=CarregaDadosVeiculoLogica&txtIdVeiculo=${item.getIdVeiculo()}">
											<i class="fa fa-pencil" aria-hidden="false"></i>
										</a>
<!-- 										
 -->									
										
 										<a href="http://localhost:8080/AvaliacaoLocadora/ControllerServlet?logica=ExcluirVeiculoLogica&txtIdVeiculo=${item.getIdVeiculo()}">
											<i class="fa fa-trash" aria-hidden="true"></i>
											
										</a>
<!-- 										<input type="button" onClick="excluir()" value="Excluir" class="fa fa-trash" id="btnExcluir">
 -->							
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