package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce01 {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> sum = (ac, n) -> ac + n;
		
		Integer result1 = nums.stream().reduce(sum).get();
		System.out.println("Result: " + result1);
		
		// It isn't necessary ".get()", because the result never will be "null"
		Integer result2 = nums.stream().reduce(100, sum);
		System.out.println("Result: " + result2);
		
		// If you want sum a value in all, just necessary alter for "parallelStream()" 
		Integer result3 = nums.parallelStream().reduce(100, sum);
		System.out.println("Result: " + result3);
		
		// Result was a Opcional<Integer>
		nums.stream()
		    .filter(n -> n > 5)
		    .reduce(sum)
		    .ifPresent(System.out::println);
		
	}
}