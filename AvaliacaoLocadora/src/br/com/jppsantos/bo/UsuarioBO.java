package br.com.jppsantos.bo;

import br.com.jppsantos.dao.UsuarioDAO;

public class UsuarioBO {
	private UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	public String realizarLogin(String login, String senha) {
		if (usuarioDAO.getUser(login, senha)) {
			return "/WEB-INF/jsp/" + "MenuPrincipal.jsp";
		}
		return "Login.jsp";
	}
}
