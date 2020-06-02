package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimirObjetos {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Gui", "Luca", "Lu");

		// Foreach
		for (String aprovado : aprovados) {
			System.out.println(aprovado);
		}
		
		// Iterator -> Interface Java que retorna booleano
		Iterator<String> iterator = aprovados.iterator();		
		while(iterator.hasNext()) {
			String nome = iterator.next();
			System.out.println(nome);
		}
		
		for (Iterator<String> it = aprovados.iterator(); it.hasNext();) {
			String nome = (String) it.next();
			System.out.println(nome);
		}
		
		//Stream -> A Iteracao ocorre internamente
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
		
	}
}
