package oo.heranca.desafios;

public interface Luxo {
	void ligarAr();
	void desligarAr();
	
	// Implementa��o padrao em uma interface
	default int velocidadeDoAr() {
		return 1;
	}
}
