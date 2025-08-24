package providers;

public class DalseyHillblomLynn implements ShippingProvider {

    @Override
    public Shipping calculateShipping(double weight, double value) {
        double shippingPercentage = weight > 5000 ? 12: 4;
        double shippingCost = value * shippingPercentage / 100;

        return new Shipping(shippingCost, getShippingProviderType());
    }

    @Override
    public ShippingProviderType getShippingProviderType() {
        return ShippingProviderType.DHL;
    }
}