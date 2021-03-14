package LambdasFunctions;

public class TestCalc02 {

	public static void main(String[] args) {
		
		//Lambda Function
		Calc calc03 = (x, y) -> {
			return x + y;
		};
		
		System.out.println(calc03.execute(2, 3));
		
		//or 
		
		Calc calc04 = (x, y) -> x * y;
		System.out.println(calc04.execute(2, 3));
		
		//Others examples
		
		System.out.println(calc03.cool());
		
		System.out.println(Calc.veryCool());
	}
}
