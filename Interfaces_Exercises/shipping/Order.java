import providers.Shipping;

public class Order {

    int code;
    double weight;
    double total;
    Shipping shipping;

    public Order(int code, double weight, double total) {
        this.code = code;
        this.weight = weight;
        this.total = total;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }
}