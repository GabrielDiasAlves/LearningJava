package generics;

public class BoxTest {
	
	public static void main(String[] args) {
		
		// First example with Generics
		Box<String> boxA = new Box<>();
		boxA.keep("Secret");
		
		String exampleA = boxA.open();
		System.out.println(exampleA);
		
		// Second example with Generics
		Box<Double> boxB = new Box<>();
		boxB.keep(3.1415);
		
		Double exampleB = boxB.open();
		System.out.println(exampleB);
	}

}
