package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/*
 * 1. Integer numbers to binary string. Ex.: 6 ... "110"
 * 2. Invert the string... "110" -> "011"
 * 3. Convert back to integer... "011" -> 3
 * */

public class ChallengeMap {
	
	public static void main(String[] args) {
		
	List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);	
	
	UnaryOperator<String> invertNumbers = 
			s -> new StringBuilder(s).reverse().toString();
		
	Function<String, Integer> binaryToInt =
			s -> Integer.parseInt(s, 2);
	
	nums.stream()
		.map(Integer::toBinaryString)
		.map(invertNumbers)
		.map(binaryToInt)
		.forEach(System.out::println);	
	}
}