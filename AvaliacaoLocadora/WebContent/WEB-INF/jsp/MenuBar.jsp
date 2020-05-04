<meta charset="UTF-8">
 <h3>Locadora Do Jão</h3>
	
<div class="card-header">
	<ul class="nav nav-tabs card-header-tabs">
		<li class="nav-item">
			<form action="ControllerServlet" method="post">
				<input type="hidden" name = "logica" value = "ListaVeiculosLogica">
				<input type="submit" value="Listar Veiculos" class="btn btn-outline-dark">
			</form>
		</li>
		
		<li class="nav-item">
			<form action="ControllerServlet" method="post" >
				<input type="hidden" name = "logica" value = "ListaEditavelVeiculosLogica">
				<input type="submit" value="Alugar Veiculo" class="btn btn-outline-dark">
			</form>		
		</li>
		
		<li class="nav-item">
			<form action="CadastraVeiculo.jsp" method="post" >
				<input type="submit" value="Cadastrar" class="btn btn-outline-dark">
			</form>		
		</li>
	</ul>		
</div>