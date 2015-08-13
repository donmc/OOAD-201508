package com.bustem.business;

import java.util.HashMap;
import java.util.Map;

public class FakeDmv implements DMV {

	private Map<String, Driver> drivers = new HashMap<String, Driver>();
	
	public FakeDmv() {
		drivers.put("TX1234", new Driver("TX1234", "Don"));
		drivers.put("IA1234", new Driver("IA1234", "Bob"));
	}
	
	
	@Override
	public Driver getDriver(String dl) {
		return drivers.get(dl);
	}

}
