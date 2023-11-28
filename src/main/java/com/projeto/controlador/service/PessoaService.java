package com.projeto.controlador.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.controlador.repository.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

	public PessoaRepository getPessoaRepository() {
		return pessoaRepository;
	}

}
