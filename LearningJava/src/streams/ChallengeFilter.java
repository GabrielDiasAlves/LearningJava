package streams;

import java.util.Arrays;
import java.util.List;

/* 
 * 1. Use two or more .filter 
 * 2. Use a .map
 * 3. use creativity
 *  */

public class ChallengeFilter {
	
	public static void main(String[] args) {
		
		Product p1 = new Product("Glass", 0.99, 0.1, false);
		Product p2 = new Product("Door", 99.90, 4.0, true);
		Product p3 = new Product("Chair", 24.50, 5.5, true);
		Product p4 = new Product("Sofa", 550.00, 120.9, true);
		
		List<Product> products = Arrays.asList(p1, p2, p3, p4);
		
		products.stream()
				.filter(p -> p.price >= 25)
				.filter(p -> p.weight <= 150)
				.filter(p -> p.freight)
				.map(p -> "Product: " + p.name)
				.forEach(System.out::println);
	}
}