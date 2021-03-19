package LambdasFunctions;

import java.util.function.Predicate;

public class CompositionPredicateFunction {
	
	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isThreeDigitos = num -> num >= 100 && num <= 999;
		
		System.out.println(isPar.and(isThreeDigitos).test(122));
		
		System.out.println(isPar.or(isThreeDigitos).test(331));
		
		//In this case, it was possible use two checks, "isPar" and "isThreeDigitos", because it's "Boolean"
		
		
	}

}
