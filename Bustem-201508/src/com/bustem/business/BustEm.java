package com.bustem.business;

public class BustEm {

	private DMV dmv;
	private PoliceDepartment policeDepartment = new PoliceDepartment();
	
	public BustEm(DMV dmv) {
		this.dmv = dmv;
	}
	
	public Driver lookupDriver(String dl) {
		return dmv.getDriver(dl);
	}

	public Citation createTicket(Driver driver, String badgeId, String violationInfo) {
		return policeDepartment.createTicket(driver, badgeId, violationInfo);
	} 

}
