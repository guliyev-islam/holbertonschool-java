package providers;

public class Fedex implements ShippingProvider{
    
    @Override
    public Shipping calculateShipping(double weight, double value) {
        double shippingPercentage = weight > 1000 ? 10: 5;
        double shippingCost = value * shippingPercentage / 100;

        return new Shipping(shippingCost, getShippingProviderType());
    }

    @Override
    public ShippingProviderType getShippingProviderType() {
        return ShippingProviderType.FEDEX;
    }
}