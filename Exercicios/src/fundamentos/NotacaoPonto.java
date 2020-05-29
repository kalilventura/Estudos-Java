package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		/*
		 * Funciona somente quando temos tipos complexos, ou seja,
		 * tipos primitivos não tem "."
		 * o ponto é utilizado para ver os metodos que existem dentro
		 * daquele tipo
		 * */
		String s = "bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
	}
}
