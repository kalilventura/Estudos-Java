package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {

		double raio = 3.4;
		/*
		 * final -> Palavra reservada para constantes A convencao para variaveis
		 * constantes é letra maiuscula
		 */
		final double PI = 3.14159;

		double area = PI * raio * raio;

		System.out.println("Area = " + area + " m2.");

	}
}
