package products;

abstract public class Product {

	String title;
	int year;
	String country;
	double grossPrice;

	public Product(String title, int year, String country, double grossPrice) {
		this.title = title;
		this.year = year;
		this.country = country;
		this.grossPrice = grossPrice;
	}

	abstract public double getNetPrice();
}
