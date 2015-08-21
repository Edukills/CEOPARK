package br.com.ceopark.acessores;

import java.util.Date;

public class Mensalista extends Pessoa {

	private String telComercial;
	private String observacoes;
	private int qtdVeiculos;
	private Date vencimento;
	private double mensalidade;
	private String ativo;
	
	public String getTelComercial() {
		return telComercial;
	}
	public void setTelComercial(String telComercial) {
		this.telComercial = telComercial;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public int getQtdVeiculos() {
		return qtdVeiculos;
	}
	public void setQtdVeiculos(int qtdVeiculos) {
		this.qtdVeiculos = qtdVeiculos;
	}
	public Date getVencimento() {
		return vencimento;
	}
	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	public String getAtivo() {
		return ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	

}
