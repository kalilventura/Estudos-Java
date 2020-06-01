package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoHomogenio {
	public static void main(String[] args) {
		// Não ordenado
		//Set<String> listaAprovados = new HashSet<>();
		
		// Ordenado
		SortedSet<String> listaAprovados = new TreeSet<>();
		
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		// Na instancia de um Set, não aceita tipos primitivos
		// caso for criar, utilizamos o wrapper
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		// nums.get(1); Não é possível acessar pelo índice
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
}
