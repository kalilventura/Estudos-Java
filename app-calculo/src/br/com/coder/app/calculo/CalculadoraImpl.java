package br.com.coder.app.calculo;

import br.com.coder.app.Calculadora;
import br.com.coder.app.calculo.interno.OperacoesAritmeticas;

public class CalculadoraImpl implements Calculadora {
	
	private String id = "aa";
	
	private OperacoesAritmeticas operacoes = new OperacoesAritmeticas();

	public double soma(double... numbers) {
		return operacoes.soma(numbers);
	}	
	
}
