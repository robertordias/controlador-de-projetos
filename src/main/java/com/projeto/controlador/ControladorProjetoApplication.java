package com.projeto.controlador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.projeto.controlador")
public class ControladorProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControladorProjetoApplication.class, args);
	}

}
