package com.bustem.business;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WhenEnteringViolation {

	private BustEm application;
	private Driver driver;
	private String dl;
	private Citation ticket;
	private Officer officer;

	@Before
	public void setup() {
		application = new BustEm(new FakeDmv());
		dl = "TX1234";
		String violationInfo = "60 in a 40";
	
		driver = application.lookupDriver(dl);
		ticket = application.createTicket(driver, "starsky3341", violationInfo);
		officer = ticket.getOfficer();
	}
	
	@Test
	public void shouldLookupDriver() {

		assertNotNull(driver);
		assertEquals(dl, driver.getDriversLicenseNumber());
	}	
	
	@Test
	public void shouldLookupDriverWithCorrectName() {
		assertEquals("Don", driver.getName());
	}
	
	@Test
	public void shouldLookupTwoDrivers() {
		// setup
		String dl2 = "IA1234";
	
		// exercise
		Driver driver2 = application.lookupDriver(dl2);
		
		// verify
		assertEquals(dl, driver.getDriversLicenseNumber());
		assertEquals(dl2, driver2.getDriversLicenseNumber()); 
	}

	@Test
	public void shouldCreateTicket() {
		assertNotNull(ticket);
	}
	
	@Test
	public void shouldAssociateDriverToTicket() {
		assertEquals(driver, ticket.getDriver()); 
	}
	
	@Test
	public void shouldAssociateOfficerToTicket() {
		assertEquals("starsky3341", officer.getBadgeId());
	}
	
	@Test
	public void shouldCreateViolation() {
		
		Violaton violation = ticket.getViolation();
		assertNotNull(violation);
		assertEquals("60 in a 40", violation.getInfo());
	}
	
}
