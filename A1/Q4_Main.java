
package oops;

class Laptop {
	private String model;
	private double price;

	public void setModel(String model) {
		this.model = model;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop Model: " + model + ", Price: $" + price;
	}
}

public class Q4_Main {
	public static void main(String[] args) {

		Laptop laptop = new Laptop();

		laptop.setModel("Dell Inspiron");

		System.out.println(laptop.toString());
	}
}
