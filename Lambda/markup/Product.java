import java.util.function.Supplier;
import java.util.function.Consumer;

public class Product {

    private Double price;
    private String name;
    private Double markupPercentage;
    public Supplier<Double> priceWithMarkup = () -> getPrice() +  getPrice() * markupPercentage / 100;
    public Consumer<Double> updateMarkup = (Double markupPercentage) -> {setMarkupPercentage(markupPercentage);};

    public Product(Double price, String name) {
        setPrice(price);
        setName(name);
        setMarkupPercentage(10d);
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Double getMarkupPercentage() {
        return markupPercentage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setMarkupPercentage(Double markupPercentage) {
        this.markupPercentage = markupPercentage;
    }
}