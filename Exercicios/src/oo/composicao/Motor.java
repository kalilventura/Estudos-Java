package oo.composicao;

public class Motor {
	final Carro carro;
	double fatorInjecao = 1;
	boolean ligado = false;

	public Motor(Carro carro) {
		this.carro = carro;
	}
	
	int giros() {
		if (!ligado)
			return 0;

		return (int) Math.round(fatorInjecao * 3000);
	}

}
