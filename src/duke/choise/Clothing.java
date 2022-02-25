package duke.choise;

public class Clothing {
	private String description;
	private double price;
	private char aSize;
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public char getaSize() {
		return aSize;
	}

	public void setaSize(char aSize) {
		this.aSize = aSize;
	}

	public Clothing(String description, double price, char aSize) {
		super();
		this.description = description;
		this.price = price;
		this.aSize = aSize;
	}
	
	@Override
	public String toString() {
		return getDescription()+", "+getPrice()+", "+getaSize();
	}
}
