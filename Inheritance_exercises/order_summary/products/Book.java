package products;

public class Book extends Products {

	public int pages;
	public String author;
	public int edition;

	public Book(String title, int year, String country, double grossPrice, int pages, String author, int edition) {
		super(title, year, country, grossPrice);
		this.pages = pages;
		this.author = author;
		this.edition = edition;
	}

	public double getNetPrice() {
		double increase = grossPrice / 100d * 15d;
		return grossPrice + increase;
	}
}