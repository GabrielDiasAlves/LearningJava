package streams;

import java.util.Arrays;
import java.util.List;

public class OthersMethods {
	
	public static void main(String[] args) {
		
		Student a1 = new Student("Gabriel", 8.8);
		Student a2 = new Student("Leo", 5.2);
		Student a3 = new Student("Sofia", 9.1);
		Student a4 = new Student("Italo", 8.4);
		Student a5 = new Student("Talita", 9.8);
		Student a6 = new Student("Leo", 5.2);
		Student a7 = new Student("Sofia", 9.1);
		Student a8 = new Student("Gabriel", 8.8);

		List<Student> students = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		// Remove duplicates
		System.out.println("Distinct..");
		students.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit..");
		students.stream()
			  .distinct()
			  .skip(2)
			  .limit(2)
			  .forEach(System.out::println);
		
		System.out.println("\ntakeWhile");
		students.stream()
			  .distinct()
			  .takeWhile(a -> a.grade >= 7)
			  .forEach(System.out::println);
	}

}
