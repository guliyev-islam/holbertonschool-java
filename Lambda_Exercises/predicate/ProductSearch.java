import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ProductSearch {

    public static List<Product> filter(List<Product> products, Predicate<Product> filterCriteria) {
        List<Product> filteredProducts = new ArrayList<Product>();

        for (Product product: products) {
            if (filterCriteria.test(product)) {
                filteredProducts.add(product);
            }
        }

        return filteredProducts;
    } 
}