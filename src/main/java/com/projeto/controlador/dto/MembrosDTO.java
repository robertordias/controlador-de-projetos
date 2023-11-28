package com.projeto.controlador.dto;

public class MembrosDTO {
	
	public MembrosDTO( String nome, String atribuicao) {
		this.nome = nome;
		this.atribuicao = atribuicao;
	}
	
	private String nome;
	
	private String atribuicao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAtribuicao() {
		return atribuicao;
	}

	public void setAtribuicao(String atribuicao) {
		this.atribuicao = atribuicao;
	}

}
