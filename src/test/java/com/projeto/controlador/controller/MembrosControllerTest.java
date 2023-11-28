package com.projeto.controlador.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.projeto.controlador.controller.MembrosController;
import com.projeto.controlador.dto.MembrosDTO;
import com.projeto.controlador.model.Pessoa;
import com.projeto.controlador.repository.PessoaRepository;
import com.projeto.controlador.service.MembrosService;

class MembrosControllerTest {

    @Test
    void testCadastrarNovoMembro() {
        PessoaRepository pessoaRepositoryMock = mock(PessoaRepository.class);

        MembrosService membrosService = new MembrosService(pessoaRepositoryMock);

        MembrosController membrosController = new MembrosController(membrosService);

        String nome = "John Doe";
        String atribuicaoValida = "F";
        String atribuicaoInvalida = "X"; 

        ResponseEntity<String> responseValida = membrosController.cadastrarMembro(new MembrosDTO(nome, atribuicaoValida));
        assertEquals(HttpStatus.CREATED, responseValida.getStatusCode());
        assertEquals("Membro cadastrado com sucesso!", responseValida.getBody());

        verify(pessoaRepositoryMock, times(1)).save(any(Pessoa.class));
        
        ResponseEntity<String> responseInvalida = membrosController.cadastrarMembro(new MembrosDTO(nome, atribuicaoInvalida));
        assertEquals(HttpStatus.BAD_REQUEST, responseInvalida.getStatusCode());
        assertTrue(responseInvalida.getBody().contains("Atribuição inválida"));

        verify(pessoaRepositoryMock, times(1)).save(any(Pessoa.class));
        }
}
