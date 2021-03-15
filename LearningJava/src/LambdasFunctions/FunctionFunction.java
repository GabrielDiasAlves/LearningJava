package LambdasFunctions;

import java.util.function.*;

public class FunctionFunction {

	public static void main(String[] args) {
		//Function<T,R>	--> Represents a function that accepts one argument and produces a result.
		//Example of functions communications
	
		Function<Integer, String> evenOrOdd = 
							(number) -> number % 2 == 0 ? "Even" : "Odd";
							
		Function<String, String> theResult = 
							value -> "The result is: " + value;
							
		Function<String, String> cool = 
							veryCool -> veryCool + "!!!!";
							
		Function<String, String> waitWhat = 
						noNoNo -> noNoNo + "????";
						
		String finalResult = evenOrOdd
				            .andThen(theResult)
				            .andThen(cool)
				            .apply(32);
		
		String finalResultWhat = evenOrOdd
								.andThen(theResult)
								.andThen(waitWhat)
								.apply(32);
		
		System.out.println(evenOrOdd.apply(23));
		System.out.println(finalResult);
		System.out.println(finalResultWhat);
		
	}
	
}
