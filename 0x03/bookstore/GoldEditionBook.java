import exceptions.InvalidAuthorException;
import exceptions.InvalidBookException;

public class GoldEditionBook extends Book{
    
    GoldEditionBook(String title, String author, double price) throws InvalidBookException, InvalidAuthorException, InvalidBookException, InvalidAuthorException {
        super(title, author, price);
    }
    
    public double getPrice() {
        return this.price * 0.3d + this.price;
    }
}