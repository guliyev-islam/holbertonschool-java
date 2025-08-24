package providers;

public interface ShippingProvider {

    public Shipping calculateShipping(double weight, double value);
    public ShippingProviderType getShippingProviderType();
}