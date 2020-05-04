package br.com.jppsantos.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jppsantos.bo.VeiculoBO;

public class ListaEditavelVeiculosLogica implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		VeiculoBO veiculoBO = new VeiculoBO();
		
		request.setAttribute("veiculos", veiculoBO.getDispVeiculos());
		
		return "/WEB-INF/jsp/AlugaVeiculo.jsp";
	}

}
