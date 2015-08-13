package com.bustem.business;

public class Order {
	private ShippingStrategy shippingStrategy;
	
	public Order() {
		shippingStrategy = new StandardShippingStrategy();
	}
	
	public void setShippingStrategy(ShippingStrategy shippingStrategy) {
		this.shippingStrategy = shippingStrategy;
	}
	
	public double getTotalPrice() {
		double price = 0;
		// calculate prices and tax
	
		price += shippingStrategy.getShippingCost();
				
		return price;
	 }

	

}
