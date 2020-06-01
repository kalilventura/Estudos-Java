package oo.heranca.desafios;

public class TesteCarro {
	public static void main(String[] args) {
		Ferrari ferrari = new Ferrari();
		Civic civic = new Civic();

		System.out.println(ferrari.velocidadeAtual);
		System.out.println(civic.velocidadeAtual);

		ferrari.acelerar();
		civic.acelerar();

		System.out.println(ferrari.velocidadeAtual);
		System.out.println(civic.velocidadeAtual);
		
		ferrari.ligarTurbo();
		
		ferrari.acelerar();
		ferrari.acelerar();
		System.out.println(ferrari.velocidadeAtual);

		ferrari.desligarTurbo();
		ferrari.acelerar();
		System.out.println(ferrari.velocidadeAtual);
	}
}
