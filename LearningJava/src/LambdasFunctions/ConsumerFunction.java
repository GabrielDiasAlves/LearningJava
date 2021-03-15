package LambdasFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunction {

	public static void main(String[] args) {
		
		Consumer<Product> showName = p -> System.out.println("- " + p.name);
		
		Product p01 = new Product("Pen", 12.34, 0.09);
		showName.accept(p01);
		
		Product p02 = new Product("Laptop", 2987.99, 0.25);
		Product p03 = new Product("Book", 19.90, 0.04);
		Product p04 = new Product("Pencil", 7.80, 0.18);
		Product p05 = new Product("Glass", 4.39, 0.19);
		
		List<Product> products = Arrays.asList(p01, p02, p03, p04, p05);
		
		//Show name
		products.forEach(showName);
		
		//Show price 
		products.forEach(p -> System.out.println(p.price));
		
		products.forEach(System.out::println);
	}
	
}
