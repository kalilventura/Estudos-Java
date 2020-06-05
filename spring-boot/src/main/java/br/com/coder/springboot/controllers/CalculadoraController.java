package br.com.coder.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/calculadora")
public class CalculadoraController {

	// /calculadora/somar/10/20
	@GetMapping(name = "/somar/{a}/{b}") 
	public int somar(@PathVariable int a, @PathVariable int b) {
		return a + b; 
	}

	// /calculadora/subtrair?a=10b=20
	@GetMapping(name = "/subtrair")
	public int subtrair(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b) {
		return a - b;
	}

}
