import java.util.List;

public class SugarBeverage extends BeverageDecorator {
    public SugarBeverage(Beverage beverage) {
        super(beverage);
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = getDecoratedBeverage().getIngredients();
        ingredients.add("sugar");
        return ingredients;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.9d;
    }
}