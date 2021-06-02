package LambdasFunctions;

/**
 * @author Gabriel
 * The first lesson about functions lambdas, with Leonardo Moura Leitao
 * 
 * When add "@FuncionalInterface" in your code, like the example below, only be possible to create a function in this Class.
 * But, if you need, exists a possibilits then... Use "default" or a method "static".
 */

@FunctionalInterface
public interface Calc {
	
	double execute(double a, double b);

	default String cool() {
		return "Cool";
	}
	
	static String veryCool() {
		return "Very Cool";
	}
}