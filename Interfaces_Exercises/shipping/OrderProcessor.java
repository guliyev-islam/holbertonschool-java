import providers.ShippingProvider;

public class OrderProcessor {

    ShippingProvider shippingProvider;

    public OrderProcessor(ShippingProvider shippingProvider) {
        this.shippingProvider = shippingProvider;
    }

    public void process(Order order) {
        order.shipping = shippingProvider.calculateShipping(order.weight, order.total);
    }
}