package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
		// Função lambda sem corpo
		Calculo calc = (double a, double b) -> a + b;
		System.out.println(calc.executar(3, 2));

		// Função lambda com corpo
//		Calculo multiplicar = (double a, double b) -> {
//			return a * b;
//		};

		calc = (x, y) -> x * y;
		System.out.println(calc.executar(3, 2));

	}
}
