package br.com.jppsantos.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jppsantos.bo.VeiculoBO;

public class AlugaVeiculoLogica implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//Executando a logica
		 Integer idVeiculo = Integer.parseInt(request.getParameter("txtIdVeiculo"));
		 VeiculoBO veiculoBO = new VeiculoBO();
		 
		 //Retornando o nome da página JSP  
         String proximaTela = veiculoBO.alugarVeiculo(idVeiculo);
         
         request.setAttribute("veiculos", veiculoBO.getVeiculos());
         
         return "/WEB-INF/jsp/" + proximaTela;
	}

}
