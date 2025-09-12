import java.util.ArrayList;
import java.util.List;

public class ProductSearch {

    public static List<Product> filter(List<Product> products, FilterCriteria filterCriteria) {
        List<Product> filteredProducts = new ArrayList<Product>();

        for (Product product: products) {
            if (filterCriteria.test(product)) {
                filteredProducts.add(product);
            }
        }

        return filteredProducts;
    } 
}