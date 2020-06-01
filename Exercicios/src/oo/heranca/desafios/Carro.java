package oo.heranca.desafios;

public class Carro {
	protected final double VELOCIDADE_MAXIMA;
	public double velocidadeAtual;
	protected int delta = 5;

	protected Carro(double velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		if(velocidadeAtual +  delta > VELOCIDADE_MAXIMA)
			velocidadeAtual = VELOCIDADE_MAXIMA;
		else
		velocidadeAtual += delta;
	}

	void freiar() {
		if (velocidadeAtual >= 5)
			velocidadeAtual += 5;
		else
			velocidadeAtual = 0;
	}
}
