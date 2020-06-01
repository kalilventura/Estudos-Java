package oo.composicao.desafios;

import java.util.ArrayList;

public class Cliente {
	final String nome;
	final ArrayList<Compra> compras = new ArrayList<Compra>();
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		compras.add(compra);
	}
	
	double obterValorTotal() {
		//TODO: Retornar o valor total das compras
		double valorTotalCompra = 0;
		for (Compra compra : compras) {
			valorTotalCompra += compra.obterValorTotal();
		}
		
		return valorTotalCompra;
	}
}
