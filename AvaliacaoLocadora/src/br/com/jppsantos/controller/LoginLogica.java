package br.com.jppsantos.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jppsantos.bo.UsuarioBO;

public class LoginLogica implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String login = request.getParameter("txtLogin");
		String senha = request.getParameter("txtSenha");
	
		UsuarioBO usuarioBO = new UsuarioBO();
		String proximaPagina = usuarioBO.realizarLogin(login, senha);
		return proximaPagina;
	}

}
