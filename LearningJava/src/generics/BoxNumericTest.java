package generics;

public class BoxNumericTest {
	
	public static void main(String[] args) {
		
		BoxNumeric<Double> boxA = new BoxNumeric<>();
		boxA.keep(123.6);
		System.out.println(boxA.open());
		
		BoxNumeric<Integer> boxB = new BoxNumeric<>();
		boxB.keep(12);
		System.out.println(boxB.open());
		
	}

}
