package oo.composicao.desafios;

public class Desafio {
	public static void main(String[] args) {
		//TODO: Criar um cliente, vincular ao cliente compras e pegar o valor total das compras
		Cliente cliente = new Cliente("João");
		
		Produto caneta = new Produto("Caneta", 1.99);
		Produto caderno = new Produto("Caderno", 5.00);
		Produto estojo = new Produto("Estojo", 10.00);
		
		Compra compraCliente = new Compra();
		
		compraCliente.adicionarItem(caneta, 10);
		compraCliente.adicionarItem(caderno, 10);
		compraCliente.adicionarItem(estojo, 1);
		
		cliente.adicionarCompra(compraCliente);
		
		System.out.println("Total da compra: R$ "+ cliente.obterValorTotal());
		
	}
}
