package com.projeto.controlador.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable{
	
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "datanascimento")
    private Date dataNascimento;
    
    private String nome;
    
    private String cpf;
    
    private boolean funcionario;
    
    private boolean gerente;
    
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public boolean isFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(boolean funcionario) {
		this.funcionario = funcionario;
	}
	
	public boolean isGerente() {
		return gerente;
	}
	
	public void setGerente(boolean gerente) {
		this.gerente = gerente;
	}

}
