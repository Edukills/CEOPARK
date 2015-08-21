package br.com.ceopark.acessores;

import br.com.ceopark.exception.ExceptionSenha;
import br.com.ceopark.exception.ExceptionUsuario;

public class Funcionario extends Pessoa {

	private int matricula;
	private String usuario;
	private String senha;
	private String grupo;
	private String cnh;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) throws ExceptionUsuario {
		if (usuario.length() >= 3 && usuario.length() <= 15) {
			this.usuario = usuario;
		} else {
			throw new ExceptionUsuario();
		}
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) throws ExceptionSenha {
		if (senha.length() >= 8 && senha.length() <= 12) {
			this.senha = senha;
		} else {
			throw new ExceptionSenha();
		}
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}













}
