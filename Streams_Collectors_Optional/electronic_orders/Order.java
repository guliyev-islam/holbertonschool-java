import java.util.List;

public class Order {

    private int code;
    private List<Product> products;
    private Client client;

    public Order(int code, List<Product> products, Client client) {
        setCode(code);
        setProducts(products);
        setClient(client);
    }

    public int getCode() {
        return code;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Client getClient() {
        return client;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setProducts (List<Product> products) {
        this.products = products;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s", getCode(), getClient().getName());
    }
}