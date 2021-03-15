package LambdasFunctions;

import java.util.Arrays;
import java.util.List;

/**
 * @author Gabriel
 * 
 * If you need to show the values in a list, you can do it this way:
 */

public class Foreach {

	public static void main(String[] args) {
		
		List<String> shoppingList = Arrays.asList("Pen", "Book", "Pencil", "Box");
		
		System.out.println("First way.. ");
		for(String buy: shoppingList) {
			System.out.println(buy);
		}
		
		System.out.println("\nLambda #01..");
		shoppingList.forEach((buy) -> {System.out.println(buy + "!!");} );
		
		System.out.println("\nLambda #02..");
		shoppingList.forEach((buy) -> {showValues(buy);} );
		
		
		System.out.println("\nMethod Reference #01.. ");
		shoppingList.forEach(System.out::println);
		
		System.out.println("\nMethod Reference #02.. ");
		shoppingList.forEach(Foreach::showValues);
		
	}
	
	static void showValues(String buy) {
		System.out.println("I need to buy: " + buy);
	}

}
