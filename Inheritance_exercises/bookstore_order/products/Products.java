package products;
// abstract public class Product
abstract public class Products {

	String title;
	int year;
	String country;
	double grossPrice;

	public Products(String title, int year, String country, double grossPrice) {
		this.title = title;
		this.year = year;
		this.country = country;
		this.grossPrice = grossPrice;
	}

	abstract public double getNetPrice();
}
