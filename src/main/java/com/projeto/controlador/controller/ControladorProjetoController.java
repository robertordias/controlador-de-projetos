package com.projeto.controlador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.projeto.controlador.model.Projeto;
import com.projeto.controlador.service.ProjetoService;

@Controller
public class ControladorProjetoController {

	@Autowired
    private ProjetoService projetoService;

	@GetMapping
    public String listarProjetos(ModelMap model) {
        List<Projeto> projetos = projetoService.listarProjetos();
        model.addAttribute("projetos", projetos);
        return "index";
    }
}
