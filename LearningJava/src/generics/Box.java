package generics;

public class Box<T> {
	
	// Example with generics
	private T example;
	
	public void keep(T example) {
		this.example = example;
	}
	
	public T open() {
		return example;
	}

}
