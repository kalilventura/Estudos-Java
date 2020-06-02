package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		Caixa<String> caixa = new Caixa<>();
		caixa.guardar("Guardando");
		
		System.out.println(caixa.abrir());
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(2.3);
		
		System.out.println(caixaB.abrir());
	}

}
