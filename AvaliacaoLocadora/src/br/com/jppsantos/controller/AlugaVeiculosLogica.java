package br.com.jppsantos.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jppsantos.bo.VeiculoBO;

public class AlugaVeiculosLogica implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		 System.out.println("Executando a logica ...");
		 Integer idVeiculo = Integer.parseInt(request.getParameter("txtIdVeiculo"));
		
//         System.out.println("Retornando o nome da página JSP ...");
         VeiculoBO veiculoBO = new VeiculoBO();
         
         String proximaTela = veiculoBO.alugarVeiculo(idVeiculo);
         
         return "/WEB-INF/jsp/" + proximaTela;
	}

}
