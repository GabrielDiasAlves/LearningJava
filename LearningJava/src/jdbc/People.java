package jdbc;

public class People {

	private String name;
	private int cod;

	public People() {
	}

	public People(String name, int cod) {
		this.name = name;
		this.cod = cod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

}
