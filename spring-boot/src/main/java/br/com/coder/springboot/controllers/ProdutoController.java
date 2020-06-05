package br.com.coder.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.coder.springboot.model.entities.Produto;
import br.com.coder.springboot.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	// Anotação utilizada para a injeção de Dependencia
	@Autowired
	private ProdutoRepository produtoRepository;

	@PostMapping 
	public @ResponseBody Produto novoProduto(@RequestParam String nome) {
		Produto produto = new Produto(nome);
		produtoRepository.save(produto);
		return produto;
	}
}