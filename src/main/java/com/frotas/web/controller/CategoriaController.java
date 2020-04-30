package com.frotas.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/veiculo")
public class CategoriaController {
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/veiculo/cadastro_categoria";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/veiculo/lista_categoria";
	}

}
