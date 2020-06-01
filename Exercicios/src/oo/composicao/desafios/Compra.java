package oo.composicao.desafios;

import java.util.ArrayList;

public class Compra {
	final ArrayList<Item> itens = new ArrayList<>();

	void adicionarItem(Produto produto, int quantidade) {
		itens.add(new Item(quantidade, produto));
	}
	
	double obterValorTotal() {
		// TODO: retornar o valor total dos itens
		double valorTotalItens = 0;

		for (Item item : itens) {
			valorTotalItens += item.quantidade * item.produto.preco;
		}

		return valorTotalItens;
	}
}
