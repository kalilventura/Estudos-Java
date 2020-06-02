package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForeachFuncional {
	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

		// Foreach #01
		aprovados.forEach(nome -> System.out.println("Aprovado: " + nome));

		// Method Reference
		aprovados.forEach(System.out::println);

		// Foreach #02 Passando uma função customizada
		aprovados.forEach(nome -> meuImprimir(nome));

		// Method Reference com a funcao personalizada
		aprovados.forEach(ForeachFuncional::meuImprimir);

	}

	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é: " + nome);
	}
}
