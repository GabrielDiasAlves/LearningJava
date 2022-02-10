package generics;

public class PairTeste {

	public static void main(String[] args) {

		Pairs<Integer, String> contestResult = new Pairs<>();
		
		contestResult.add(1,"Gabriel");
		contestResult.add(2,"Rafael");
		contestResult.add(3,"Samuel");
		contestResult.add(4,"Daniel");
		contestResult.add(2,"Leonel");
		
		System.out.println(contestResult.getValue(1));
		System.out.println(contestResult.getValue(3));
		System.out.println(contestResult.getValue(2));
	}

}
