package br.com.ceopark.acessores;

import java.util.Date;

import br.com.ceopark.exception.ExceptionBairro;
import br.com.ceopark.exception.ExceptionCep;
import br.com.ceopark.exception.ExceptionCidade;
import br.com.ceopark.exception.ExceptionComplemento;
import br.com.ceopark.exception.ExceptionCpf;
import br.com.ceopark.exception.ExceptionData;
import br.com.ceopark.exception.ExceptionEndereco;
import br.com.ceopark.exception.ExceptionNome;
import br.com.ceopark.exception.ExceptionNumero;
import br.com.ceopark.exception.ExceptionTelefone;
import br.com.ceopark.validacao.ValidaCPF;

public class Pessoa {

	private String cpf;
	private String nome;
	private String endereco;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String cep;
	private String telFixo;
	private String telCelular;
	private Date dataNascimento;
	private ValidaCPF valCPF;
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) throws ExceptionCpf {
		if (valCPF.isCPF(cpf) == true) {
			this.cpf = cpf;
		} else {
			throw new ExceptionCpf();
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws ExceptionNome {
		if (nome.length() >= 4 && nome.length() <= 150) {
			this.nome = nome;
		} else {
			throw new ExceptionNome();
		}
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) throws ExceptionEndereco {
		if (endereco.length() >= 5 && endereco.length() <= 100) {
			this.endereco = endereco;
		} else {
			throw new ExceptionEndereco();
		}
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) throws ExceptionNumero {
		if (numero.length() > 0 && numero.length() <= 6) {
			this.numero = numero;
		} else {
			throw new ExceptionNumero();
		}
	}
	
	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) throws ExceptionComplemento {
		if (complemento.length() <= 20) {
			this.complemento = complemento;
		} else {
			throw new ExceptionComplemento();
		}
	}
	
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) throws ExceptionBairro {
		if (bairro.length() >= 3 && bairro.length() <= 50) {
			this.bairro = bairro;
		} else {
			throw new ExceptionBairro();
		}
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) throws ExceptionCidade {
		if (cidade.length() >= 3 && cidade.length() <= 50) {
			this.cidade = cidade;
		} else {
			throw new ExceptionCidade();
		}
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) throws ExceptionCep {
		if (cep.length() == 8) {
			this.cep = cep;
		} else {
			throw new ExceptionCep();
		}
	}
	
	public String getTelResidencial() {
		return telFixo;
	}

	public void setTelResidencial(String telFixo)
			throws ExceptionTelefone {
		if (telFixo.length() > 9 && telFixo.length() < 12) {
			this.telFixo = telFixo;
		} else {
			throw new ExceptionTelefone();
		}
	}
	
	public String getTelCelular() {
		return telCelular;
	}

	public void setTelCelular(String telCelular) throws ExceptionTelefone {
		if (telCelular.length() > 9 && telCelular.length() < 12) {
			this.telCelular = telCelular;
		} else {
			throw new ExceptionTelefone();
		}
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) throws ExceptionData {
		if (!dataNascimento.after(new Date())) {			
			this.dataNascimento = dataNascimento;
		} else {
			
			throw new ExceptionData();
		}
	}	
}
