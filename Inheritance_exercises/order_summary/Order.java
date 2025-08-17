public class Order {

    double totalPrice = 0;
    double discount;

	ItemOrder[] items;
	double discountPercentage;

	public Order(double discountPercentage, ItemOrder[] items) {
		this.items = items;
		this.discountPercentage = discountPercentage;
        setTotalPrice(items);
        this.discount = totalPrice / 100d * discountPercentage;
	}

    public void setTotalPrice(ItemOrder[] items) {
        for (ItemOrder item: items) {
            this.totalPrice += item.quantity * item.product.getNetPrice();
        }
    }

    public double calculateTotal() {
		return totalPrice - discount;
	}

	public void presentOrderSummary() {
        System.out.println("------- ORDER SUMMARY -------");
        for (ItemOrder item: items) {
            System.out.printf(String.format("Type: %s  Title: %s  Price: %.2f  Quant: 1  Total: %.2f\n", (item.product.getClass() + "").split("\\.")[1], item.product.title, item.product.getNetPrice(), item.product.getNetPrice() * item.quantity).replace(".", ","));
        }

        System.out.println("----------------------------");
        System.out.printf(String.format("DISCOUNT: %.2f\n", discount).replace(".", ","));
        System.out.printf(String.format("TOTAL PRODUCTS: %.2f\n", totalPrice).replace(".", ","));
        System.out.println("----------------------------");
        System.out.printf(String.format("TOTAL ORDER: %.2f\n", totalPrice - discount).replace(".", ","));
        System.out.println("----------------------------");
    }
}
