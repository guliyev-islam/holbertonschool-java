package products;

public class Dvd extends Product {

	String director;
	String genre;
	int duration;

	public Dvd(String title, int year, String country, double grossPrice, String director, String genre, int duration) {
		super(title, year, country, grossPrice);
		this.director = director;
		this.genre = genre;
		this.duration = duration;
	}

	public double getNetPrice() {
		double increase = grossPrice / 100d * 20d;
		return grossPrice + increase;
	}
}
