package LambdasFunctions;

public class TestCalc01 {
	
	public static void main(String[] args) {

		Calc calc = new Sum();
		System.out.println(calc.execute(5, 7));
		
		calc = new Multiply();
		System.out.println(calc.execute(5, 7));
	
	}

}
