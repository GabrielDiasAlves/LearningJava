package LambdasFunctions;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class binaryOperatorTest {

	public static void main(String[] args) {
		
		/* Simple example of function */
		BinaryOperator<Double> studentAverage = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(studentAverage.apply(8.4, 2.6));
		
		/* Composition of Functions */
		Function<Double, String> resultStr = m -> m >= 7 ? "Approved" : "Disapproved";
		System.out.println(studentAverage.andThen(resultStr).apply(8.4, 9.6));
		
		/* Multiple Tasks in One Function */
		BiFunction<Double, Double, String> resultAverage = (n1, n2) -> {
			double finalGrade = (n1 + n2) / 2;
			return finalGrade >= 7 ? "Approved" : "Disapproved";
		};
		System.out.println(resultAverage.apply(7.9, 4.3));
		
		/* In these cases it will be necessary to analyze what will be the best way to use the functions. 
		 * Because separating them will be possible to reuse them easily.*/
	}
}