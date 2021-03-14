package LambdasFunctions;

import java.util.function.BinaryOperator;

public class TestCalc03 {

	public static void main(String[] args) {

		// Types
		// int -> Double	 Not allowed 
		// double -> Double  Allowed
		
		// In this way, the "Calc" Functio/Class would not be necessary, as it would be directly at the right local
		
		BinaryOperator<Double> calc05 = (x, y) -> { return x + y; };
		System.out.println(calc05.apply(2.0, 5.0));
		
		//Example with Integer
		BinaryOperator<Integer> calc06 = (x, y) -> { return x + y; };
		System.out.println(calc06.apply(5, 5));

	}
}
