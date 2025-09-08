public class Food {

    private String name;
    private Double calories;
    private Double price;

    public Food(String name, Double calories, Double price) {
        setName(name);
        setCalories(calories);
        setPrice(price);
    }
    
    public String getName() {
        return name;
    }

    public Double getCalories() {
        return calories;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("[%s] %f $ %f", getName(), getCalories(), getPrice()).replace(".", ",");
    }
}