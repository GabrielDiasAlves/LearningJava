package LambdasFunctions;

import java.util.function.Predicate;

public class PredicateFunction {

	public static void main(String[] args) {
		
		// The Prdeicate Function received one parameter and return "True" or "False"
		// In this example, if the product with discount is more or equal '$750', it's expensive "True"
		Predicate<Product> isExpensive = (prod) -> (prod.price * (1 - prod.discount)) >= 750;
		
		Product product01 = new Product("Laptop", 3893.89, 0.15); 
		System.out.println(isExpensive.test(product01));

	}

}
