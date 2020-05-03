package br.com.jppsantos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import br.com.jppsantos.bean.VeiculoBean;

public class VeiculoDAO {
	private Connection conn;
	private PreparedStatement ps;
	private Statement st;
	private ResultSet rs;
	
	private ArrayList<VeiculoBean> lista = new ArrayList<VeiculoBean>();

	public VeiculoDAO() {
		conn = new ConectionFactory().getConection();
	}
	
	public boolean insereCarro(VeiculoBean veiculoBean) {
		String sql = "INSERT INTO veiculo (modelo,ano,disponibilidade) values (?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, veiculoBean.getModelo());
			ps.setString(2, veiculoBean.getAno());
			ps.setString(3, veiculoBean.getDisponibilidade());
			
			ps.execute();
			ps.close();
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public ArrayList<VeiculoBean> listarVeiculos() {
		String sql = "SELECT * FROM veiculo";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);

			while (rs.next()) {
				String modelo = rs.getString("modelo");
				String ano = rs.getString("ano");
				String disp = rs.getString("disponibilidade");
				Integer idVeiculo = rs.getInt("idveiculo");
				
				VeiculoBean veiculoBean = new VeiculoBean(modelo, ano, disp);
				veiculoBean.setIdVeiculo(idVeiculo);
			
				System.out.println("\n\n\nmodelo" + rs.getString("modelo"));
				lista.add(veiculoBean);
			}
			
			st.close();
			rs.close();
			
		} catch (Exception e) {
			throw new RuntimeException("Erro na na listagem de veiculos " + e);
		}
		
		return lista;
	}
	
	public boolean alugarVeiculo(Integer id) {
		String sql = "UPDATE veiculo SET disponilidade='Indisponivel' WHERE idcarro=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			ps.executeUpdate();
			ps.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	
	
	
	
	
	
}
