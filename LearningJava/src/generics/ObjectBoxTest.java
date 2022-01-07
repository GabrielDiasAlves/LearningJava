package generics;

public class ObjectBoxTest {

	public static void main(String[] args) {
		
		// First example without Generics
		ObjectBox boxA = new ObjectBox();
		boxA.keep(2.3); //double -> Double
		
		Double exampleA = (Double) boxA.open();
		System.out.println(exampleA);
		
		// Second example without Generics
		ObjectBox boxB = new ObjectBox();
		boxA.keep("Hello"); //double -> Double
		
		String exampleB = (String) boxA.open();
		System.out.println(exampleB);
	}
	
}
