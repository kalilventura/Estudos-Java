package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		Produto produto = new Produto("iPad", 3235.89, 0.13);

		Function<Produto, Double> precoReal = p -> p.preco * (1 - p.desconto);
		UnaryOperator<Double> impostoMunicipal = val -> val >= 2500 ? val * 1.085 : val;
		UnaryOperator<Double> frete = f -> f >= 3000 ? f + 100.0 : f + 50.0;
		UnaryOperator<Double> arredondar = n -> Double.parseDouble(String.format("%.2f", n));
		Function<Double, String> valorFormatado = val -> ("R$" + val).replace(".", ",");
		
		String resultado = precoReal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(valorFormatado)
				.apply(produto);
		
		System.out.println(resultado);
	}

}
