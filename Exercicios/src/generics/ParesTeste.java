package generics;

public class ParesTeste {

	public static void main(String[] args) {
		Pares<Integer, String> resultadoConcurso = new Pares<Integer, String>();
		
		resultadoConcurso.adicionar(1, "Maria");
		resultadoConcurso.adicionar(2, "Ana");
		resultadoConcurso.adicionar(3, "Pedro");
		resultadoConcurso.adicionar(4, "Gui");
		resultadoConcurso.adicionar(2, "Rebeca");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(4));
		System.out.println(resultadoConcurso.getValor(2));
	}

}
