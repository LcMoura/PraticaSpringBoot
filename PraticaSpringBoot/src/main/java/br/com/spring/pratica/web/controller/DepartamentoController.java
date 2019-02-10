package br.com.spring.pratica.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//Criar o link das páginas
//Define a url que quando for requisitada chamara o metodo
@RequestMapping("/departamentos")
public class DepartamentoController {

	//Link: http://localhost:8080/departamentos/cadastrar
	@GetMapping("/cadastrar")
	public String cadastrar() {
		// Na pasta Template - pasta departamento e arquivo cadastro.html
		return "/departamento/cadastro";
	}
	
	//Link: localhost:8080/departamentos/listar
	@GetMapping("/listar")
	public String listar() {
		// Na pasta Template - pasta departamento e arquivo lista.html
		return "/departamento/lista";
	}
}
