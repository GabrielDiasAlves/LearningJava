package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	
	public static void main(String[] args) {
		
		Student a1 = new Student("Gabriel", 8.8);
		Student a2 = new Student("Leo", 5.2);
		Student a3 = new Student("Sofia", 9.1);
		Student a4 = new Student("Italo", 8.4);
		
		List<Student> students = Arrays.asList(a1, a2, a3, a4);

		Predicate<Student> approved = a -> a.grade >= 7;
		
		// It will check if all students was approved
		System.out.println(students.stream().allMatch(approved));
		
		// Has anyone been approved?
		System.out.println(students.stream().anyMatch(approved));
		
		// None were approved?
		System.out.println(students.stream().noneMatch(approved));
		
	}		
}