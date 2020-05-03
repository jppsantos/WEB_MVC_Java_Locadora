package br.com.jppsantos.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectionFactory {
	public Connection getConection() {
		String url = "jdbc:mysql://127.0.0.1:3306/dblocadora_veiculos";
		String user = "root";
		String password = "password";
		
		try {
			//Inicializando o Driver que foi importado
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url,user,password);
			
		} catch (Exception e) {
			//e.printStackTrace();
			throw new RuntimeException("Erro na na conexão" + e);
		}
	}
}
