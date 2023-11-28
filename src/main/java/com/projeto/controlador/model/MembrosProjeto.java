package com.projeto.controlador.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity	
@Table(name = "membros")
public class MembrosProjeto implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @ManyToOne
    @JoinColumn(name = "idProjeto")
    private Projeto projeto;

    @Id
    @ManyToOne
    @JoinColumn(name = "idPessoa")
    private Pessoa pessoa;

    // getters e setters
}