import java.util.ArrayList;

public class BeverageDecorator extends Beverage {
    private Beverage decoratedBeverage;

    public BeverageDecorator(Beverage beverage) {
        setDecoratedBeverage(beverage);
    }

    @Override
    public ArrayList<String> getIngredients() {
        return getDecoratedBeverage().getIngredients();
    }

    @Override
    public double getPrice() {
        return getDecoratedBeverage().getPrice();
    }

    public Beverage getDecoratedBeverage() {
        return this.decoratedBeverage;
    }

    public void setDecoratedBeverage(Beverage beverage) {
        this.decoratedBeverage = beverage;
    }
}