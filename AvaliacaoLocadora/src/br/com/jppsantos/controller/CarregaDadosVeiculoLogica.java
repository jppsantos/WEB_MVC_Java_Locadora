package br.com.jppsantos.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jppsantos.bo.VeiculoBO;

public class CarregaDadosVeiculoLogica implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		 Integer idVeiculo = Integer.parseInt(request.getParameter("txtIdVeiculo"));
		 VeiculoBO veiculoBO = new VeiculoBO();
		  
		 request.setAttribute("veiculo", veiculoBO.getVeiculoPorId(idVeiculo));
		 
       //Retornando o nome da página JSP  
       return "/WEB-INF/jsp/" + "AtualizaVeiculo.jsp";
	}
	
}
