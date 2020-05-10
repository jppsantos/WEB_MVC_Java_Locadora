package br.com.jppsantos.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jppsantos.bo.VeiculoBO;

public class AtualizarVeiculosLogica implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Integer id = Integer.parseInt(request.getParameter("txtIdVeiculo"));
		String modelo = request.getParameter("txtModelo");
		String ano = request.getParameter("txtAno");

		VeiculoBO veiculoBO = new VeiculoBO();
		String proximaTela = veiculoBO.atualizarVeiculo(id, modelo, ano);
		
		if (proximaTela.compareTo("AtualizaVeiculo.jsp") == 0) {
			request.setAttribute("erroAoAtualizar", true);
		} else {
			request.setAttribute("veiculos", veiculoBO.getVeiculos());
		}
		
		return "/WEB-INF/jsp/" + proximaTela;
	}

}
