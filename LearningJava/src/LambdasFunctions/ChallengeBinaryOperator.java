package LambdasFunctions;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/* Description:
 * 1. From the product, calculate the final price (with discount);
 * 2. City tax: If >= 2500 should be 8.5%, if < 2500 should be exempt;
 * 3. Freight: If >= 3000 should be $100, if < 3000 should be $50;
 * 4. Round off: Leave only two decimal places;
 * 5. Format: $1234.56
 */

public class ChallengeBinaryOperator {
	
	public static void main(String[] args) {
		
		Function<Product, Double> finalPrice = product -> product.price * (1 - product.discount);
		UnaryOperator<Double> cityTax = price -> price >= 2500 ? price * 1.085 : price;
		UnaryOperator<Double> freight = price -> price >= 3000 ? price + 100 : price + 50;
		UnaryOperator<Double> roundOff = price -> Double.parseDouble(String.format("%.2f", price));
		Function<Double, String> formattedPrice = price -> ("R$" + price).replace(".", ",");

		Product p = new Product("Laptop Dell", 3235.89, 0.13);
		
		String price = finalPrice
				.andThen(cityTax)
				.andThen(freight)
				.andThen(roundOff)
				.andThen(formattedPrice)
				.apply(p);
		
		System.out.println("The final price of your product is: " + price);
	}
}


