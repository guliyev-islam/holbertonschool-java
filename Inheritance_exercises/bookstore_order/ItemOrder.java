import products.Products;

public class ItemOrder {

	Products product;
	int quantity;

	public ItemOrder(Products product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
}
