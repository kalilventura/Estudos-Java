package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {

		// LIFO
		Deque<String> livros = new ArrayDeque<String>();

		livros.add("O Pequeno Principe"); // Retorna um valor booleano

		livros.push("Dom Quixote"); // Não tem retorno e caso não consiga retorna uma exceção
		livros.push("Hobbit");

		System.out.println("Antes de remover elementos");
		System.out.println("---------------------------------------");
		for (String livro : livros) {
			System.out.println(livro);
		}
		System.out.println("---------------------------------------");

		// Funciona igual da fila, o que muda é o tipo de implementação
		livros.peek();
		livros.element();

		livros.poll();
		livros.remove();
		livros.pop(); // Retorna uma exceção

		System.out.println("Depois de remover elementos");
		System.out.println("---------------------------------------");
		for (String livro : livros) {
			System.out.println(livro);
		}
		System.out.println("---------------------------------------");

		// livros.size();
		// livros.clear();
		// livros.contains();
		// livros.isEmpty();
	}
}
