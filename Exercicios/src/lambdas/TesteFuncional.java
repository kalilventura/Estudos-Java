package lambdas;

import java.util.function.BinaryOperator;

public class TesteFuncional {
	public static void main(String[] args) {

		// A interface recebe somente Wrappers para tipos primitivos
		BinaryOperator<Double> calc = (x, y) -> x + y;

		System.out.println(calc.apply(2.0, 3.0));

		calc = (x, y) -> x * y;
		System.out.println(calc.apply(2.0, 3.0));
		
		BinaryOperator<Integer> c = (x, y) -> x + y;
		System.out.println(c.apply(3, 2));

	}
}
