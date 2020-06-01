package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {

		// LIFO
		Deque<String> livros = new ArrayDeque<String>();

		livros.add("O Pequeno Principe"); // Retorna um valor booleano

		livros.push("Dom Quixote"); // N�o tem retorno e caso n�o consiga retorna uma exce��o
		livros.push("Hobbit");

		System.out.println("Antes de remover elementos");
		System.out.println("---------------------------------------");
		for (String livro : livros) {
			System.out.println(livro);
		}
		System.out.println("---------------------------------------");

		// Funciona igual da fila, o que muda � o tipo de implementa��o
		livros.peek();
		livros.element();

		livros.poll();
		livros.remove();
		livros.pop(); // Retorna uma exce��o

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
