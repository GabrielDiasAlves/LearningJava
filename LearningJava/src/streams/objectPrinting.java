package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class objectPrinting {

	public static void main(String[] args) {
		
		List<String> approved = Arrays.asList("Talita", "Sofia", "Italo", "Gabriel");
		
		System.out.println("Using foreach...");
		for(String name: approved) {
			System.out.println(name);
		}
		
		System.out.println("\nUsing Iterator...");
		Iterator<String> it = approved.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			
		System.out.println("\nUsing Stream...");
		Stream<String> st = approved.stream();
		st.forEach(System.out::println); // Internal repeat loop!
		
	}
}