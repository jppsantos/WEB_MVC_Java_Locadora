<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="card text-center">
			<%@include file="/WEB-INF/jsp/MenuBar.jsp"%>
			<div class="card-body">
				<form action="ControllerServlet" method="post">
					<input type="hidden" name="logica" value="AtualizarVeiculosLogica">
					<input type="hidden" name="txtIdVeiculo" value="${veiculo.getIdVeiculo()}">
					<input type="hidden" name="txtDisponibilidade" value="${veiculo.getDisponibilidade()}">
					<div class="form-group row">
						<label class="col-sm-2">Modelo</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="txtModelo"
								value="${veiculo.getModelo()}">
						</div>
					</div>

					<div class="form-group row">
						<label class="col-sm-2">Ano</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="txtAno"
								value="${veiculo.getAno()}">
						</div>
					</div>
					<button type="submit" class="btn btn-primary">Salvar</button>
				</form>
			</div>
		</div>

	</div>
</body>
</html>