<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menu Principal</title>
</head>
<body>
	<div class="container">
		<div class="card text-center">
			<%@include file="/WEB-INF/jsp/MenuBar.jsp" %>
			<div class="card-body">
				<div class="row">
				</div>
			</div>
		</div>
	</div>

<!-- <div class="wrapper fadeInDown">
  <div id="formContent">
    <form action="ControllerServlet" method="get">
    	<input type="hidden" name = "logica" value = "ListaEditavelVeiculosLogica">
      	<input type="submit" class="fadeIn fourth" value="Alugar">
    </form>
  </div>
</div> -->
</body>
</html>