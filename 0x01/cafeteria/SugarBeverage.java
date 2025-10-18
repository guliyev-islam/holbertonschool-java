import java.util.ArrayList;

public class SugarBeverage extends BeverageDecorator {
    public SugarBeverage(Beverage beverage) {
        super(beverage);
    }

    @Override
    public ArrayList<String> getIngredients() {
        ArrayList<String> ingredients = getDecoratedBeverage().getIngredients();
        ingredients.add("sugar");
        return ingredients;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.9d;
    }
}