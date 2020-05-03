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
<div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Login Form -->
    <form action="ControllerServlet" method="get">
    	<input type="hidden" name = "logica" value = "LoginLogica">
      	<input type="text" id="usuario" class="fadeIn second" name="txtLogin" placeholder="login">
      	<input type="text" id="senha" class="fadeIn third" name="txtSenha" placeholder="password">
      	<input type="submit" class="fadeIn fourth" value="Entrar">
    </form>

  </div>
</div>
</body>
</html>