package com.projeto.controlador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.controlador.model.Projeto;
import com.projeto.controlador.repository.ProjetoRepository;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;
	
	public List<Projeto> listarProjetos() {
        return projetoRepository.findAll();
    }

    public Projeto obterProjeto(Long id) {
        Projeto projeto = projetoRepository.findOne(id);
        if( projeto != null ){ 
        	return projeto;
        }
        return null;
    }

    public void salvarProjeto(Projeto projeto) {
        projetoRepository.save(projeto);
    }

    public void excluirProjeto(Long id) {
        projetoRepository.delete(id);
    }

}
