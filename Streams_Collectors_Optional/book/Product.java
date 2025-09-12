public class Product {

    private int code;
    private String name;
    private ProductCategory category;
    private double price;

    public Product(int code,
            String name,
            ProductCategory category,
            double price) {
                setCode(code);
                setName(name);
                setCategory(category);
                setPrice(price);
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        
        return String.format("[%d] %s %s $ %.2f]", getCode(), getName(), getCategory(), getPrice());
    }
}