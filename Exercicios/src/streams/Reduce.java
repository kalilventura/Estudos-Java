package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		// Obs: O reduce é uma função Terminal, onde o resultado dela não é um stream
		
		// Para recuperar o valor do reduce, precisamos utilizar o get()
		Integer total = nums.stream().reduce(soma).get();
		System.out.println(total);
		
		// Sempre vai retornar um integer pois estamos passando um valor inicial
		// caso chamarmos de forma paralela, devemos ter cuidado, pois como estamos passando
		// o valor inicial ele pode considerar para todos os numeros no reduce
		Integer total2 = nums.stream().reduce(100, soma);
		System.out.println(total2);
		
		// Resultado foi um Opcional<Integer>
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
	}
}
