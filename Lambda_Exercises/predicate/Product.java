public class Product {

    private String name;
    private double price;
    private double weight;
    private int stockQuantity;
    private ProductTypes type;

    public Product(String name,
            double price,
            double weight,
            int stockQuantity,
            ProductTypes type) {
        setName(name);
        setPrice(price);
        setWeight(weight);
        setStockQuantity(stockQuantity);
        setType(type);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public ProductTypes getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public void setType(ProductTypes type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s %f %f %d %s",
                getName(),
                getPrice(),
                getWeight(),
                getStockQuantity(),
                getType());
    }
}