package LambdasFunctions;

/*
 * Doesn't receive any parameters, but return values
 * The more specific in this case, better understanding of the usefulness 
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Supplieer {
	
	public static void main(String[] args) {
		
		Supplier<List<String>> justList = () -> Arrays.asList("Gabriel", "Samnuel", "Daniel");
		//or
		Supplier<Object> justListOb = () -> Arrays.asList("Gabriel", "Samnuel", "Daniel");
		
		System.out.println("String: "+justList.get());
		System.out.println(" or ");
		System.out.println("Objects: "+ justListOb.get());
	}
}
