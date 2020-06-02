package streams.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	public static void main(String[] args) {
		
		Consumer<Integer> print = System.out::println;
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		Function<Integer, String> converterInteiroParaBinario = (num) -> Integer.toBinaryString(num);
		
		UnaryOperator<String> inverterBinario = (b) -> {
			StringBuffer stringBuffer = new StringBuffer(b);
			stringBuffer.reverse();
			return stringBuffer.toString();
		};
		
		Function<String, Integer> converterBinarioParaInteiro = (b) -> Integer.parseInt(b, 2);
		
		nums.stream()
		.map(converterInteiroParaBinario)
		.map(inverterBinario)
		.map(converterBinarioParaInteiro)
		.forEach(print);

	}
}
