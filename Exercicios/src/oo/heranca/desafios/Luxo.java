package oo.heranca.desafios;

public interface Luxo {
	void ligarAr();
	void desligarAr();
	
	// Implementação padrao em uma interface
	default int velocidadeDoAr() {
		return 1;
	}
}
