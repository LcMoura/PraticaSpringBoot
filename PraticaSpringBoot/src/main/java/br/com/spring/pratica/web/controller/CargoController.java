package br.com.spring.pratica.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//Criar os links das páginas
//Define a url que quando for requisitada chamara o metodo
@RequestMapping("/cargos")
public class CargoController {
	
	//Link: http://localhost:8080/cargos/cadastrar
	@GetMapping("/cadastrar")
	public String cadastrar() {
		// Na pasta Template - pasta cargo e arquivo cadastro.html
		return ("/cargo/cadastro");
	}
	
	//Link: http://localhost:8080/cargos/listar
	@GetMapping("/listar")
	public String listar() {
		// Na pasta Template - pasta cargo e arquivo lista.html
		return ("/cargo/lista");
	}

}
