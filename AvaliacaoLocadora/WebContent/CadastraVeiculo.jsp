<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Veiculo</title>
</head>
<body>
<div class = "container">
	<h1>Cadastro de Veiculo</h1>
	<div class="card">
	<div class="card-body">
		<form action="ControllerServlet" method="get">
			<input type="hidden" name = "logica" value = "CadastraVeiculoLogica">
			<div class = "form-group row">
				<label class="col-sm-2">Modelo</label>
				<div class="col-sm-7">
					<input type ="text" class="form-control" name="txtModelo" placeholder="Digite o modelo">
				</div>
			</div>
			
			<div class = "form-group row">
				<label class="col-sm-2">Ano</label>
				<div class="col-sm-7">
					<input type ="text" class="form-control" name="txtAno" placeholder="Digite o ano">
				</div>
			</div>
			
			<div class = "form-group row">
				<label class="col-sm-2">Disponibilidade</label>
				<div class="col-sm-7">
					<input type ="text" class="form-control" name="txtDisponibilidade" placeholder="Digite a disponibilidade">
				</div>
			</div>
			
			<button type="submit" class="btn btn-primary">Cadastrar</button>
			
		</form>
	</div>
	</div>
	
</div>
</body>
</html>