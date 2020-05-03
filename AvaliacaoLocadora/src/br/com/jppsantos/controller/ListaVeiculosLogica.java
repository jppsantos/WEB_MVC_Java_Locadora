package br.com.jppsantos.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jppsantos.bo.VeiculoBO;

public class ListaVeiculosLogica implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		VeiculoBO veiculoBO = new VeiculoBO();
		
		request.setAttribute("veiculos", veiculoBO.getVeiculos());
		
		return "/WEB-INF/jsp/VeiculosList.jsp";
	}
	
}
