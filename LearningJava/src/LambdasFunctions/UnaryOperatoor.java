package LambdasFunctions;

import java.util.Scanner;
import java.util.function.UnaryOperator;

/*
 * It works great for chaining multiple calls, ie, an input and an output
 * And this output, can be the parameter of another call and so on
 */

public class UnaryOperatoor {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> plusTwo = n -> n + 2;
		UnaryOperator<Integer> multiplicationTwo = n -> n * 2;
		UnaryOperator<Integer> squareed = n -> n * n;

		Scanner in = new Scanner(System.in);
		System.out.print("Choose a integer: ");
		int myValue = in.nextInt();
		

		int result1 = plusTwo.andThen(multiplicationTwo).andThen(squareed).apply(myValue);
		System.out.println("\nThe Result is: "+result1);
		
		
		in.close(); 
	}
}
