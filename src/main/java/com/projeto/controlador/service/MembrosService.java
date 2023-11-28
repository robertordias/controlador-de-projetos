package com.projeto.controlador.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.controlador.model.Pessoa;
import com.projeto.controlador.repository.PessoaRepository;

@Service
public class MembrosService {
	
	public MembrosService(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}
	
	@Autowired
    private PessoaRepository pessoaRepository;

	public void cadastrarNovoMembro(String nome, String atribuicao) {
	    Pessoa novoMembro = new Pessoa();
	    novoMembro.setNome(nome);

	    switch (atribuicao) {
	        case "F":
	            novoMembro.setFuncionario(true);
	            novoMembro.setGerente(false);
	            break;
	        case "G":
	            novoMembro.setFuncionario(false);
	            novoMembro.setGerente(true);
	            break;
	        default:
	            throw new IllegalArgumentException("Atribuição inválida: " + atribuicao);
	    }

	    pessoaRepository.save(novoMembro);
	}

}
