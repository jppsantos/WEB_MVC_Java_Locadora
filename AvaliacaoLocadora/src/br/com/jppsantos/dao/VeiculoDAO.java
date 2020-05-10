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
		ArrayList<VeiculoBean> lista = new ArrayList<VeiculoBean>();
		
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
			
				lista.add(veiculoBean);
			}
			
			st.close();
			rs.close();
			
		} catch (Exception e) {
			throw new RuntimeException("Erro na na listagem de veiculos " + e);
		}
		
		return lista;
	}
	
	public ArrayList<VeiculoBean> listarVeiculosDisponiveis() {
		String sql = "SELECT * FROM veiculo WHERE disponibilidade='Disponível'";
		ArrayList<VeiculoBean> lista = new ArrayList<VeiculoBean>();
		
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
		String sql = "UPDATE veiculo SET disponibilidade='Indisponivel' WHERE idveiculo=?";
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
	
	public boolean atualizarVeiculo(Integer id, String modelo, String ano) {
		String sql = "UPDATE veiculo SET modelo=?,ano=? WHERE idveiculo=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, modelo);
			ps.setString(2, ano);
			ps.setInt(3, id);
			ps.executeUpdate();
			ps.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean excluirVeiculo(Integer id) {
		String sql = "DELETE FROM veiculo WHERE idveiculo=?";
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
	
	public VeiculoBean buscarVeiculo(Integer id) {
		String sql = "SELECT * FROM veiculo WHERE idveiculo=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();
			rs = ps.getResultSet();
			
			rs.next();
			
			String modelo = rs.getString("modelo");
			String ano = rs.getString("ano");
			String disp = rs.getString("disponibilidade");
			Integer idVeiculo = rs.getInt("idveiculo");
			
			VeiculoBean veiculoBean = new VeiculoBean(modelo, ano, disp);
			veiculoBean.setIdVeiculo(idVeiculo);
			
			rs.close();
			ps.close();
			
			return veiculoBean;

		} catch (Exception e) {
			throw new RuntimeException("Erro na na busca de veiculos por id : " + e);
		}
		
	}
	
	public ArrayList<VeiculoBean> buscarVeiculoPorModelo(String modelo) {
		String sql = "SELECT * FROM veiculo WHERE modelo LIKE '%"+modelo+"%'";
		ArrayList<VeiculoBean> lista = new ArrayList<VeiculoBean>();
		
		System.out.println("cheguei até aqui rapaziada");
		try {
			
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
//			ps.setString(1, modelo);
//			ps.executeUpdate();
//			rs = ps.getResultSet();
			while(rs.next()) {
				String modeloVeiculo = rs.getString("modelo");
				String ano = rs.getString("ano");
				String disp = rs.getString("disponibilidade");
				Integer idVeiculo = rs.getInt("idveiculo");
				
				
				VeiculoBean veiculoBean = new VeiculoBean(modeloVeiculo, ano, disp);
				veiculoBean.setIdVeiculo(idVeiculo);
				
				lista.add(veiculoBean);
			}
			
			rs.close();
			st.close();
			
		} catch (Exception e) {
			throw new RuntimeException("Erro na na listagem de veiculos " + e);
		}
		
		return lista;
	}
}
