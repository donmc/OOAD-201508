package com.bustem.business;

public class StandardShippingStrategy implements ShippingStrategy {

	@Override
	public double getShippingCost() {
		return 45;
	}

}
