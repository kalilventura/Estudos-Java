package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> temTresDigitos = num -> num >=100 && num <= 999;
		
		System.out.println(isPar.and(temTresDigitos).test(122));
		System.out.println(isPar.and(temTresDigitos).negate().test(123));
		System.out.println(isPar.or(temTresDigitos).test(122));
	}
}
