package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce02 {

	public static void main(String[] args) {

		Student a1 = new Student("Gabriel", 8.8);
		Student a2 = new Student("Leo", 5.2);
		Student a3 = new Student("Sofia", 9.1);
		Student a4 = new Student("Italo", 8.4);
		List<Student> students = Arrays.asList(a1, a2, a3, a4);

		Predicate<Student> aproved = a -> a.grade >= 7;
		Function<Student, Double> getGrade = a -> a.grade;
		BinaryOperator<Double> sumGrade = (a, b) -> a + b;

		students.parallelStream()
		        .filter(aproved)
		        .map(getGrade)
		        .reduce(sumGrade)
		        .ifPresent(System.out::println);
	}
}