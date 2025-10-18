import java.util.ArrayList;

public class MilkBeverage extends BeverageDecorator {
    public MilkBeverage(Beverage beverage) {
        super(beverage);
    }

    @Override
    public ArrayList<String> getIngredients() {
        ArrayList<String> ingredients = getDecoratedBeverage().getIngredients();
        ingredients.add("milk");
        return ingredients;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 3.2d;
    }
}