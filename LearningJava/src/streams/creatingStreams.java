package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class creatingStreams {
	
	public static void main(String[] args) {
		
		// First example to create a Stream with "Stream.of" 
		Consumer<String> print = System.out::print; // Will be used multiple times
		Consumer<Integer> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java ", "JS ", "Python\n");
		langs.forEach(print);
		
		// Second example
		String[] moreLangs = { "Lisp ", "Pearl ", "Go\n", };
		Stream.of(moreLangs).forEach(print);
		
		// Third example
		Arrays.stream(moreLangs).forEach(print);
		// Filtering an array item
		Arrays.stream(moreLangs, 1, 2).forEach(print);
		
		// Fourth example to create a Stream
		List<String> othersLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		othersLangs.stream().forEach(print);
		// With parallel - Maybe it won't follow the order defined in the array above
		othersLangs.parallelStream().forEach(print);
		
		// Others examples to crate a infinite Streams
		Stream.generate(() -> "a").forEach(print);
		Stream.iterate(0, n -> n + 1).forEach(println);
	}
}