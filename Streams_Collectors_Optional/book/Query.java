import java.util.List;
import java.util.stream.Collectors;

public class Query {

    public static List<Product> getBooksFromOrder(Order order) {
        return order.getProducts().stream().filter(product -> product.getCategory().equals(ProductCategory.BOOK)).collect(Collectors.toList());
    }
}