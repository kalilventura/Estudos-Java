package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	public static void main(String[] args) {
		
		// Tipo colocado no <> é o dado que sera retornado
		Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println(umaLista.get());
	}
}
