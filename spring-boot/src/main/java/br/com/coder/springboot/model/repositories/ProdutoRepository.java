package br.com.coder.springboot.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.coder.springboot.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}