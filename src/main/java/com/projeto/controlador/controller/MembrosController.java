package com.projeto.controlador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.controlador.dto.MembrosDTO;
import com.projeto.controlador.service.MembrosService;

@RestController
@RequestMapping("/membros")
public class MembrosController {
	
	public MembrosController( MembrosService membrosService ) {
		this.membrosService = membrosService;
	}

	@Autowired
    private MembrosService membrosService;

    @PostMapping
    public ResponseEntity<String> cadastrarMembro(@RequestBody MembrosDTO membrosDTO) {
        try {
            membrosService.cadastrarNovoMembro(membrosDTO.getNome(), membrosDTO.getAtribuicao());
            return new ResponseEntity<>("Membro cadastrado com sucesso!", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Erro ao cadastrar membro: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
