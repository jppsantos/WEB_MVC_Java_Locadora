<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Locadora do Jão</title>
</head>
<body>
<div class="container">
		<div class="card text-center">
			<div class="card-body">
			<h3>Locadora do Jão</h3>
			<form action="ControllerServlet" method="get">
			<input type="hidden" name = "logica" value = "LoginLogica">
			<div class = "form-group row">
				<label class="col-sm-2">Login</label>
				<div class="col-sm-7">
					<input type ="text" class="form-control" name="txtLogin" placeholder="Digite o Login" required="required">
				</div>
			</div>
			
			<div class = "form-group row">
				<label class="col-sm-2">Senha</label>
				<div class="col-sm-7">
					<input type ="password" class="form-control" name="txtSenha" placeholder="Digite sua senha" required="required">
				</div>
			</div>
			<button type="submit" class="btn btn-primary">Entrar</button>
		</form>
				</div>
			</div>
		
	</div>
</body>
</html>