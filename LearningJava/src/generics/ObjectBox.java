package generics;

public class ObjectBox {
	
	private Object example;
	
	public void keep(Object example) {
		this.example = example;
	}
	
	public Object open() {
		return example;
	}
	
}
