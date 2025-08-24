package providers;

public class Shipping {

    public double value;
    public ShippingProviderType shippingProviderType;

    public Shipping(double value, ShippingProviderType shippingProviderType) {
        this.value = value;
        this.shippingProviderType = shippingProviderType;
    }

    public ShippingProviderType getShippingProviderType() {
        return shippingProviderType;
    }

    public void setShippingProviderType(ShippingProviderType shippingProviderType) {
        this.shippingProviderType = shippingProviderType;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}