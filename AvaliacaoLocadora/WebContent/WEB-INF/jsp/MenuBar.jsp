<meta charset="UTF-8">
 <h3>Locadora Do Jão</h3>
	
<div class="card-header">
	<ul class="nav nav-tabs card-header-tabs">
		<li class="nav-item">
			<form action="ControllerServlet" method="post">
				<input type="hidden" name = "logica" value = "ListaVeiculosLogica">
				<input type="submit" value="Listar Veiculos" class="nav-link active" data-toggle="tab">
			</form>
		</li>
		
		<li class="nav-item">
			<form action="ControllerServlet" method="post" >
				<input type="hidden" name = "logica" value = "ListaEditavelVeiculosLogica">
				<input type="submit" value="Alugar Veiculo" class="nav-link active" data-toggle="tab">
			</form>		
		</li>
		
		<li class="nav-item">
			<a class="nav-link active" href="CadastraVeiculo.jsp" data-toggle="tab">Cadastrar</a>
		</li>
	
	</ul>		
</div>