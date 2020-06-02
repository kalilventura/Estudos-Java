package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimir = el -> System.out.println(el.nome);
		
		Produto p1 = new Produto("Caneta", 12.34, 0.9);
		Produto p2 = new Produto("Caderno", 12.34, 0.9);
		Produto p3 = new Produto("Borracha", 12.34, 0.9);
		Produto p4 = new Produto("Lápis", 12.34, 0.9);
		Produto p5 = new Produto("Notebook", 12.34, 0.9);
		
		imprimir.accept(p1);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		
		produtos.forEach(System.out::println);
	}
}
