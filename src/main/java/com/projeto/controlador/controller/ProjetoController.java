package com.projeto.controlador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.projeto.controlador.model.Projeto;
import com.projeto.controlador.service.ProjetoService;

@Controller
@RequestMapping("/projetos")
public class ProjetoController {
	
	public static final String REDIRECT_PROJECT = "redirect:/projetos";

    @Autowired
    private ProjetoService projetoService;

    @GetMapping("/{id}")
    public String detalhesProjeto(@PathVariable Long id, Model model) {
        Projeto projeto = projetoService.obterProjeto(id);
        model.addAttribute("projeto", projeto);
        return "detalhes";
    }


    @PostMapping("/novo")
    public String salvarNovoProjeto(@ModelAttribute Projeto projeto) {
        projetoService.salvarProjeto(projeto);
        return REDIRECT_PROJECT;
    }

    @PostMapping("/{id}/editar")
    public String salvarEdicaoProjeto(@PathVariable Long id, @ModelAttribute Projeto projeto) {
    	projeto.setId(id);
    	
        projetoService.salvarProjeto(projeto);
        return REDIRECT_PROJECT;
    }

    @GetMapping("/{id}/excluir")
    public String excluirProjeto(@PathVariable Long id) {
        projetoService.excluirProjeto(id);
        return REDIRECT_PROJECT;
    }
    
}