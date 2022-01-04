package streams;

import java.util.Objects;

/* Created this class for assistant in examples and exercises */

public class Student {

	final String name;
	final double grade;

	public Student(String name, double grade) {
		this.name = name;
		this.grade = grade;
	}

	public String toString() {
		return name + " have the grade " + grade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(grade, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Double.doubleToLongBits(grade) == Double.doubleToLongBits(other.grade)
				&& Objects.equals(name, other.name);
	}

}