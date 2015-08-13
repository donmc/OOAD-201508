package com.bustem.business;

public class RealDMV implements DMV {

	@Override
	public Driver getDriver(String dl) {
		//DMVProxy dmv = new DMVProxy();
	//	String xmlDR = dmv.getRecordFor(dl);
		
		
		return new Driver("","");
	}

}
