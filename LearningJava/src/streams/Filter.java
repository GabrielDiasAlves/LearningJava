package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* Created a class "Student" */

public class Filter {

	public static void main(String[] args) {
		
		Student a1 = new Student("Gabriel", 8.7);
		Student a2 = new Student("Talita", 9.4);
		Student a3 = new Student("Leo", 3.9);
		Student a4 = new Student("Gui", 6.8);
		
		List<Student> students = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Student> approved = 
				s -> s.grade >= 7;
		
 		Function<Student, String> messageApproved = 
 				s -> "Congratulations " + s.name + "!! You were approved.";
 		
 		students.stream()
 		  	    .filter(approved)
 		  	    .map(messageApproved)
 		  	    .forEach(System.out::println);
 		
 		//or
 		
 		students.stream()
 		        .filter(s -> s.grade >= 7)
 		        .map(s -> "Congratulations " + s.name + "!! You were approved.")
 		        .forEach(System.out::println);
 		
	}
}