package oo.composicao;

public class Item {

	Compra compra;
	public Item(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	String nome;
	int quantidade;
	double preco;

}
