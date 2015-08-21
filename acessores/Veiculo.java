package br.com.ceopark.acessores;

import java.util.Date;

public class Veiculo {
	
	private int idVeiculo;
	private String tipoVeiculo;
	private String placa;
	private Date ano;
	private String marca;
	private String modelo;
	private String observacao;
	private String mensalistaCpf;
		
	public int getIdVeiculo() {
		return idVeiculo;
	}
	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}
	public String getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Date getAno() {
		return ano;
	}
	public void setAno(Date ano) {
		this.ano = ano;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getMensalistaCpf() {
		return mensalistaCpf;
	}
	public void setMensalistaCpf(String mensalistaCpf) {
		this.mensalistaCpf = mensalistaCpf;
	}
	

}
