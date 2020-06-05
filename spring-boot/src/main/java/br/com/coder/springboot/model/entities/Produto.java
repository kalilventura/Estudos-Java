package br.com.coder.springboot.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;	
	private String nome;	
	private int desconto;
	private double preco;

	public int getDesconto() {
		return desconto;
	}

	public Produto(String nome, int desconto, double preco) {
		super();
		this.nome = nome;
		this.desconto = desconto;
		this.preco = preco;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produto(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Produto(String nome) {
		super();
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
