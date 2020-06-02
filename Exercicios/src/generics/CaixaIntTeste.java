package generics;

public class CaixaIntTeste {
	public static void main(String[] args) {
		CaixaInt c = new CaixaInt();
		c.guardar(123);
		
		System.out.println(c.abrir());
	}
}
