package br.com.jppsantos.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jppsantos.bo.VeiculoBO;

public class PesquisaVeiculosLogica implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//Executando a logica
		 String modelo = request.getParameter("txtModelo");
		 VeiculoBO veiculoBO = new VeiculoBO();
		 
       	request.setAttribute("veiculos", veiculoBO.getVeiculos(modelo));
    
       
       //Retornando o nome da página JSP  
       return "/WEB-INF/jsp/" + "VeiculosList.jsp";
	}

}
