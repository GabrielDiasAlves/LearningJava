package LambdasFunctions;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> shoppingList = Arrays.asList("Pen", "Book", "Pencil", "Box");
		
		System.out.println("First way.. ");
		for(String buy: shoppingList) {
			System.out.println(buy);
		}
		
		System.out.println("\nLambda..");
		shoppingList.forEach((buy) -> {System.out.println(buy + "!!");} );
		
		System.out.println("\nMethod Reference.. ");
		shoppingList.forEach(System.out::println);
		
	}

}
