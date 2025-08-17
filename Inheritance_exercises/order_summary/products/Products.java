package products;
// abstract class Product
abstract public class Products {

	public String title;
	public int year;
	public String country;
	public double grossPrice;

	public Products(String title, int year, String country, double grossPrice) {
		this.title = title;
		this.year = year;
		this.country = country;
		this.grossPrice = grossPrice;
	}

	abstract public double getNetPrice();
}
