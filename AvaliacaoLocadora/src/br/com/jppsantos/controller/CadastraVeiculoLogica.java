package br.com.jppsantos.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jppsantos.bo.VeiculoBO;

public class CadastraVeiculoLogica implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		System.out.println("Executando a logica ...");
		String modelo = request.getParameter("txtModelo");
		String ano = request.getParameter("txtAno");
		String disponibilidade = request.getParameter("txtDisponibilidade");

		VeiculoBO veiculoBO = new VeiculoBO();
		String proximaTela = veiculoBO.insereCarro(modelo, ano, disponibilidade);
		
		request.setAttribute("veiculos", veiculoBO.getVeiculos());
		
		return proximaTela;
	}

}
