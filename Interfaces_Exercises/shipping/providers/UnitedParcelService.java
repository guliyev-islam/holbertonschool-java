package providers;

public class UnitedParcelService implements ShippingProvider {

    @Override
    public Shipping calculateShipping(double weight, double value) {
        double shippingPercentage = weight > 2000 ? 7: 4.5;
        double shippingCost = value * shippingPercentage / 100;

        return new Shipping(shippingCost, getShippingProviderType());
    }

    @Override
    public ShippingProviderType getShippingProviderType() {
        return ShippingProviderType.UPS;
    }
}