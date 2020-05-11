function excluir(){
	var disp = document.getElementById("txtDisp").value;
	var dispComp = "Indisponivel"
	
	if(disp.localeCompare(dispComp)) {
		alert("Não é possível excluir este veículo");
	} else {
		var id = document.getElementById("txtId").value;
		window.location.href = "http://localhost:8080/AvaliacaoLocadora/ControllerServlet?logica=ExcluirVeiculoLogica&txtIdVeiculo="+id;
	}
}