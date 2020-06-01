package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Guilherme"));
		
		// Caso não tenha implementado de um HashCode vai retornar falso
		boolean resultado = usuarios.contains(new Usuario("Guilherme"));
		
		System.out.println(resultado);
	}
}
