package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();

		// Offer e Add -> adicionam elementos na fila

		// Ha diferen�as no comportamento quando a lista est� cheia

		// Caso n�o consiga adicionar retorna uma exce��o
		fila.add("Ana");

		// Caso a fila tenha restri��o, o offer vai verificar se pode adicionar
		// caso retorne false � porque ele n�o conseguiu e caso true conseguiu adicionar
		fila.offer("Bia");

		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Guilherme");

		// Peek e Element -> obter o pr�ximo elemento
		// da fila (sem remover)

		// Ha diferen�as no comportamento quando a lista est� vazia

		// Caso a fila estiver vazia retorna null
		fila.peek();

		// Caso a fila estiver vazia retorna uma exce��o
		fila.element();

		// Poll e Remove -> obter o pr�ximo elemento
		// da fila e remove!

		// Diferen�a � o comportamento ocorre
		// quando a fila est� vazia!

		// Retorna nulo quando n�o h� mais elementos na lista
		fila.poll();

		// Retorna uma exce��o quando n�o h� elementos
		fila.remove();

		// Outros metodos sao parecidos com os das outras colecoes
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains(...)
	}
}
