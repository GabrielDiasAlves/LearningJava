package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {

		Student a1 = new Student("Gabriel", 8.8);
		Student a2 = new Student("Leo", 5.2);
		Student a3 = new Student("Sofia", 9.1);
		Student a4 = new Student("Italo", 8.4);

		List<Student> students = Arrays.asList(a1, a2, a3, a4);
		
		Comparator<Student> theBestGrade = (student1, student2) -> {
			if(student1.grade > student2.grade) return 1;
			if(student1.grade < student2.grade) return -1;
			return 0;
		};
		
		Comparator<Student> theWorstGrade = (student1, student2) -> {
			if(student1.grade > student2.grade) return -1;
			if(student1.grade < student2.grade) return 1;
			return 0;
		};
		
		// The best grade
		System.out.println(students.stream().max(theBestGrade).get());
		System.out.println(students.stream().min(theWorstGrade).get());
		
		// The worst grade
		System.out.println(students.stream().min(theBestGrade).get());
		System.out.println(students.stream().max(theWorstGrade).get());
		
		
		
	}
}