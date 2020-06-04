package br.com.coder.app.calculo;

import br.com.coder.app.calculo.interno.OperacoesAritmeticas;

public class Calculadora {
	private OperacoesAritmeticas operacoes = new OperacoesAritmeticas();

	public double soma(double... numbers) {
		return operacoes.soma(numbers);
	}	
	
}
