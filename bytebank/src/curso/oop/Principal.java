package curso.oop;

public class Principal {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.setCpf("40771124864");
		func.setNome("Kalil");
		func.setSalario(1000);
		
		System.out.println(func.getBonificacao());		
	}

}
