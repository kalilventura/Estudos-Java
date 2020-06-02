package streams.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	public static void main(String[] args) {
		// O que eu criei
		List<Integer> numeros = Arrays.asList(1, 233, 321, 42, 588, 68, 7, 8, 9);

		Consumer<String> println = System.out::println;
		
		Predicate<Integer> verificarSeEpar = number -> number % 2 == 0;
		Predicate<Integer> verificarSeMenorQue100 = number -> number < 100;
		Function<Integer, String> mensagem = num -> num + " é par e menor que 100.";
		
		// Filter, Filter, Map
		numeros.stream()
		.filter(verificarSeEpar)
		.filter(verificarSeMenorQue100)
		.map(mensagem)
		.forEach(println);
		
		// Desafio da aula
		
		Produto p1 = new Produto("Lapis", 1.99, 0.35, 0);
		Produto p2 = new Produto("Notebook", 4899.89, 0.32, 0);
		Produto p3 = new Produto("Caderno", 30, 0.45, 0);
		Produto p4 = new Produto("Impressora", 1200, 0.40, 0);
		Produto p5 = new Produto("iPad", 3100, 0.29, 0);
		Produto p6 = new Produto("Relogio", 1900, 0.12, 0);
		Produto p7 = new Produto("Monitor", 800, 0.31, 0);
		
		List<Produto> produtos = 
				Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		
		// Filter, filter, map
		Predicate<Produto> superPromocao = p -> p.desconto >= 0.3;
		Predicate<Produto> freteGratis = p -> p.valorFrete == 0;
		Predicate<Produto> precoRelevante = p -> p.preco >= 500;
		Function<Produto, String> chamadaPromocional = p -> "Aproveite! " + p.nome + " por R$" + p.preco;
		
		produtos.stream()
			.filter(superPromocao)
			.filter(freteGratis)
			.filter(precoRelevante)
			.map(chamadaPromocional)
			.forEach(System.out::println);
	}
}
