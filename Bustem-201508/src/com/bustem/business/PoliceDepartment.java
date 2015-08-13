package com.bustem.business;

import java.util.HashMap;
import java.util.Map;

public class PoliceDepartment {

	private Map<String, Officer> officers = new HashMap<String, Officer>();
	private Map<String, Ticket> tickets = new HashMap<String, Ticket>();
	
	public PoliceDepartment() {
		 populateOfficers();
	} 

	private void populateOfficers() {
		officers.put("starsky3341", new Officer("starsky3341"));
	}

	public Citation createTicket(Driver driver, String badgeId, String violationInfo) {
		
		Officer officer = officers.get(badgeId);
		Ticket ticket = new Ticket(driver, officer, violationInfo);
		tickets.put("someid", ticket);
		return ticket;
	}

}
