package com.bustem.business;

public class Ticket implements Citation {

	private Driver driver;
	private Officer officer;
	private Violaton violation;

	public Ticket(Driver driver, Officer officer, String violationInfo) {
		this.driver = driver;
		this.officer = officer;
		this.violation = new Violaton(violationInfo);
	}
	
	public void addViolation(String violationInfo) {
		
	}
	
	/* (non-Javadoc)
	 * @see com.bustem.business.Citation#getDriver()
	 */
	@Override
	public Driver getDriver() {
		return driver; 
	}

	/* (non-Javadoc)
	 * @see com.bustem.business.Citation#getOfficer()
	 */
	@Override
	public Officer getOfficer() {
		return officer;
	}

	/* (non-Javadoc)
	 * @see com.bustem.business.Citation#getViolation()
	 */
	@Override
	public Violaton getViolation() {
		return violation;
	}

}
