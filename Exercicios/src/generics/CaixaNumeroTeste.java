package generics;

public class CaixaNumeroTeste {
	public static void main(String[] args) {
		CaixaNumero<Double> c = new CaixaNumero<>();
		c.guardar(5.8988);
		
		System.out.println(c.abrir());
		
		CaixaNumero<Integer> c1 = new CaixaNumero<>();
		c1.guardar(58);
		
		System.out.println(c1.abrir());
		
	}
}
