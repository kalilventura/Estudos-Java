package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		//Formula: (�F - 32) x 5/9 = �C
		final double FATOR = 5.0/9.0;
		final int AJUSTE = 32;
		
		double fahrenheit = 86;
		
		final double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println(celsius);
		
	}
}
