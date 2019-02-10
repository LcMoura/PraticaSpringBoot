package br.com.spring.pratica.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//
@Controller
//Criar os links das páginas
//Define a url que quando for requisitada chamara o metodo
@RequestMapping("/funcionarios")
public class FuncionarioController {
	
	//Link: http://localhost:8080/funcionarios/cadastrar
	@GetMapping("/cadastrar")
	public String cadastrar() {
		// Na pasta Template - pasta departamento e arquivo cadastro.html
		return("/funcionario/cadastro");
	}
	
	//http://localhost:8080/funcionarios/listar
	@GetMapping("/listar")
	public String listar() {
		// Na pasta Template - pasta departamento e arquivo cadastro.html
		return ("/funcionario/lista");
	}

}
