package com.projeto.controlador.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.ui.ModelMap;

import com.projeto.controlador.model.Projeto;
import com.projeto.controlador.service.ProjetoService;

class ProjetoControladorControllerTest {
	
	@InjectMocks
    private ControladorProjetoController controladorProjetoController;

    @Mock
    private ProjetoService projetoService;

    @Test
    void testListarProjetos() {

        when(projetoService.listarProjetos()).thenReturn(Collections.singletonList(new Projeto()));

        ModelMap model = Mockito.mock(ModelMap.class);

        String viewName = controladorProjetoController.listarProjetos(model);

        assertEquals("index", viewName);
    }

}
