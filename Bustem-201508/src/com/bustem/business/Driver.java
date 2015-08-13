package com.bustem.business;

public class Driver {

	private String driversLicenseNumber;
	private String name;

	public Driver(String dl, String name) {
		this.driversLicenseNumber = dl;
		this.name = name;
	}

	public String getDriversLicenseNumber() {
		return driversLicenseNumber;
	}

	public String getName() {
		return name;
	}

}
