package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> car = Arrays.asList("BMW ", "Audi ", "Honda ");
		car.stream().map(c -> c.toUpperCase()).forEach(print);
		
		//UnaryOperator<String> upper = n -> n.toUpperCase(); -- Create another class to do this (Utilities)
		//UnaryOperator<String> addCharAt = n -> n + "!!!";   -- Create another class to do this (Utilities)
		UnaryOperator<String> firstLetter = n -> n.charAt(0) + "";

		
		System.out.println("\n\nUsing composition of functions...");
		car.stream()
		   .map(Utilities.upper)
		   .map(firstLetter)
		   .map(Utilities::addCharAt)
		   .forEach(print);
		
		
		
		
		
	}
}
