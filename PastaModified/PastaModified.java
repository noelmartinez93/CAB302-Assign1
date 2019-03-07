package oop.PastaModified;

public class PastaModified {
	// Private properties
	private int price;
	private String type;

	// Constructs a Pasta object with a price and a type
	public PastaModified(PastaType type) {
		this.price = type.price();
		this.type = type.toString();
	}

	// Gets the price of the pasta
	public int price() {
		return price;
	}

	// Gets the type of the pasta
	public String type() {
		return type;
	}
}