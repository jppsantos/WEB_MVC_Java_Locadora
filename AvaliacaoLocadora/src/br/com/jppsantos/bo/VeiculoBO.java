package br.com.jppsantos.bo;

import java.util.List;

import br.com.jppsantos.bean.VeiculoBean;
import br.com.jppsantos.dao.VeiculoDAO;

public class VeiculoBO {
	
	private VeiculoDAO veiculoDAO = new VeiculoDAO();
	
	public String insereCarro(String modelo, String ano, String disp) {
		VeiculoBean veiculoBean = new VeiculoBean(modelo, ano, disp);
		
		if (veiculoDAO.insereCarro(veiculoBean)) {
			return  "/WEB-INF/jsp/" + "VeiculosList.jsp";
		}
		return "CadastraVeiculo.jsp";
	}
	
	public List<VeiculoBean> getVeiculos() {
		return veiculoDAO.listarVeiculos();
	}
	
	public List<VeiculoBean> getDispVeiculos() {
		return veiculoDAO.listarVeiculosDisponiveis();
	}
	
	public String alugarVeiculo(Integer idveiculo) {
		if (veiculoDAO.alugarVeiculo(idveiculo)) {
			return "VeiculosList.jsp";
		}
		return "AlugaVeiculo.jsp";
	}
	
	public String atualizarVeiculo(Integer id, String modelo, String ano) {
		if (veiculoDAO.atualizarVeiculo(id,modelo,ano)) {
			return "VeiculosList.jsp";
		}
		return "AtualizaVeiculo.jsp";
	}
	
	public boolean excluirVeiculo(Integer id) {
		if(!veiculoDAO.buscarVeiculo(id).getDisponibilidade().contains("Indispo")) {
			return veiculoDAO.excluirVeiculo(id);
		}
		return false;
	}

	public List<VeiculoBean> getVeiculos(String modelo) {
		return veiculoDAO.buscarVeiculoPorModelo(modelo);
	}
	
	public VeiculoBean getVeiculoPorId(Integer id) {
		return veiculoDAO.buscarVeiculo(id);
	}
	
}
