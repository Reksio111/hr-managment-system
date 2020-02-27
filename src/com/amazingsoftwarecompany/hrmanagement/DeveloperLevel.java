package com.amazingsoftwarecompany.hrmanagement;

public enum DeveloperLevel {
	LEVEL1(17), LEVEL2(18), LEVEL3(19.5);

	private double rate;

	DeveloperLevel(double rate) {
		this.rate = rate;
	}

	public double getRate() {
		return this.rate;
	}
	
}
