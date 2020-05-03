package br.com.jppsantos.bean;

public class VeiculoBean {
	private Integer idVeiculo;
	private String modelo;
	private String ano;
	private String disponibilidade;
	
	public VeiculoBean(String modelo, String ano, String disponibilidade) {
		super();
		this.modelo = modelo;
		this.ano = ano;
		this.disponibilidade = disponibilidade;
	}
	
	public Integer getIdVeiculo() {
		return idVeiculo;
	}
	public void setIdVeiculo(Integer idVeiculo) {
		this.idVeiculo = idVeiculo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	
}
