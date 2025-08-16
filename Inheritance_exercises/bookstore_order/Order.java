public class Order {

	ItemOrder[] items;
	double discountPercentage;

	public Order(double discountPercentage, ItemOrder[] items) {
		this.items = items;
		this.discountPercentage = discountPercentage; 
	}

	public double calculateTotal() {
		double totalPrice = 0d;
		
		for (ItemOrder item: items) {
			totalPrice += item.product.getNetPrice() * item.quantity;
		}

		double discount = totalPrice * discountPercentage / 100d;

		return totalPrice - discount;
	}
}
