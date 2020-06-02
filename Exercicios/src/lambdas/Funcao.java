package lambdas;

import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
		Function<String, String> oResultadoEh = val -> "O resultado é: " + val;
		Function<String, String> empolgado = text -> text + " !!!";

		System.out.println(parOuImpar.apply(66));
		
		String resultadoFinal = parOuImpar
										.andThen(oResultadoEh)
										.andThen(empolgado)
										.apply(32);
		
		System.out.println(resultadoFinal);

	}
}
