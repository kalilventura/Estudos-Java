package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		// O objeto string é um tipo Imutavel
		String s = "Bom dia";

		// Quando fazemos uma atribuição, nos substituimos todo o seu valor
		s = "Boa noite";

		System.out.println(s.equals("Boa noite")); // Valor exato
		System.out.println(s.equalsIgnoreCase("boa noite")); // ignora as letras maiusculas e minusculas

		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 123456.789;

		System.out.printf("O senhor %s %s tem %d e ganha R$: %.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("O senhor %s %s tem %d e ganha R$: %.2f.", nome, sobrenome, idade, salario);
		
		System.out.println(frase);
	}
}
