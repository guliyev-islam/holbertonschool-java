import exceptions.InvalidAuthorException;
import exceptions.InvalidBookException;

public class Book {

    String title;
    String author;
    double price;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) throws InvalidBookException {
        if (title.length() < 3) {
            throw new InvalidBookException("Invalid book title");
        }

        this.title = title;
    }

    public void setAuthor(String author) throws InvalidAuthorException {
        if (author.split("\\s+").length < 2) {
            throw new InvalidAuthorException("Invalid author name");
        }

        this.author = author;
    }

    public void setPrice(double price) throws InvalidBookException {
        if (price <= 0d) {
            throw new InvalidBookException("Invalid book price");
        }
        this.price = price;
    }

    Book(String title, String author, double price) throws InvalidBookException, InvalidAuthorException {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }
}
