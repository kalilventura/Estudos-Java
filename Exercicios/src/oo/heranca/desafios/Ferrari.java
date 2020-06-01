package oo.heranca.desafios;

public class Ferrari extends Carro {

	Ferrari() {
		this(315);
	}

	Ferrari(double velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;
	}

//	@Override
//	void acelerar() {
//		velocidadeAtual += 15;
//	}
}
