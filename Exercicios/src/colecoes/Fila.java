package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();

		// Offer e Add -> adicionam elementos na fila

		// Ha diferenças no comportamento quando a lista está cheia

		// Caso não consiga adicionar retorna uma exceção
		fila.add("Ana");

		// Caso a fila tenha restrição, o offer vai verificar se pode adicionar
		// caso retorne false é porque ele não conseguiu e caso true conseguiu adicionar
		fila.offer("Bia");

		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Guilherme");

		// Peek e Element -> obter o próximo elemento
		// da fila (sem remover)

		// Ha diferenças no comportamento quando a lista está vazia

		// Caso a fila estiver vazia retorna null
		fila.peek();

		// Caso a fila estiver vazia retorna uma exceção
		fila.element();

		// Poll e Remove -> obter o próximo elemento
		// da fila e remove!

		// Diferença é o comportamento ocorre
		// quando a fila está vazia!

		// Retorna nulo quando não há mais elementos na lista
		fila.poll();

		// Retorna uma exceção quando não há elementos
		fila.remove();

		// Outros metodos sao parecidos com os das outras colecoes
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains(...)
	}
}
