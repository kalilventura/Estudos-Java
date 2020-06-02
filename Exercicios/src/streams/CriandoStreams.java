package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
		// Maneiras de criar uma Stream
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "C# ", "JS\n");
		langs.forEach(print);
		
		String[] moreLangs = { "Python ", "Lisp ", "Golang ", "Perl\n" };	
		
		Stream.of(moreLangs).forEach(print);		
		Arrays.stream(moreLangs).forEach(print);		
		Arrays.stream(moreLangs, 1, 3).forEach(print);
		
		List<String> otherLangs = Arrays.asList("C ", "PHP ", "Kotlin \n");
		otherLangs.stream().forEach(print);
		otherLangs.parallelStream().forEach(print);
		
		// Dessa maneira é infinito 
		//Stream.generate(() -> "a").forEach(print);
		//Stream.iterate(0, (n) -> n +1).forEach(println);
	}
}
