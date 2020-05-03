package br.com.jppsantos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class UsuarioDAO {
	private Connection conn;
	private PreparedStatement ps;
	private Statement st;
	private ResultSet rs;
	
	public UsuarioDAO() {
		conn = new ConectionFactory().getConection();
	}
	
	public boolean getUser(String login, String senha) {
		String sql = "SELECT * FROM usuario WHERE login = ? and senha = ?";
//		String sql = "SELECT * FROM usuario";

		
		boolean userExists = false;
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, login);
			ps.setString(2, senha);
			
			rs = ps.executeQuery();

			userExists = rs.next();
			
			ps.close();
			rs.close();
			
		} catch (Exception e) {
			throw new RuntimeException("Erro ao identificar usuario no banco " + e);
		}
		
		return userExists;
	}
	
		
}
