package br.com.coder.app.calculo.interno;

import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

import br.com.coder.app.logging.Logger;

public class OperacoesAritmeticas {
	public double soma(double... numbers) {
		Logger.info("Somando ...");
		DoubleBinaryOperator sum = (t, a) -> t + a;
		return Arrays.stream(numbers).reduce(0, sum);
	}

}
