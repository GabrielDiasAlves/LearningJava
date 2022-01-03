package streams;

public class Average {

	private double total;
	private int amount;

	public Average add(double value) {
		total += value;
		amount++;
		return this;
	}

	public double getValue() {
		return total / amount;
	}

	public static Average combine(Average a1, Average a2) {
		Average result = new Average();

		result.total = a1.total + a2.total;
		result.amount = a1.amount + a2.amount;

		return result;
	}

}