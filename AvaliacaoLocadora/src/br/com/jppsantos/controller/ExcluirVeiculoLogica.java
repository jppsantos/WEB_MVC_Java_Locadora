package br.com.jppsantos.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jppsantos.bo.VeiculoBO;

public class ExcluirVeiculoLogica implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//Executando a logica
		 Integer idVeiculo = Integer.parseInt(request.getParameter("txtIdVeiculo"));
		 VeiculoBO veiculoBO = new VeiculoBO();
		 
		 
        if(veiculoBO.excluirVeiculo(idVeiculo)) {
        	request.setAttribute("veiculos", veiculoBO.getVeiculos());
        } else {
        	request.setAttribute("erroAoExcluir", true);
        }
        
        //Retornando o nome da página JSP  
        return "/WEB-INF/jsp/" + "VeiculosList.jsp";
		
	}

}
