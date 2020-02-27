package com.amazingsoftwarecompany.hrmanagement;

public class Developer extends Employee {

	private double hourlyRate;
	private DeveloperLevel devLevel;

	public Developer(String t, String fn, String ln, int day, int month, int year, String phone, int deptid,
			DeveloperLevel level, double rate) {
		super(t, fn, ln, day, month, year, phone, deptid);
		this.devLevel = level;
		this.hourlyRate = rate;

	}

	@Override
	public double weeklyPay(double hoursWorked) {

		double devolplementRate = devLevel.getRate();
		if (hoursWorked > 35) {
			return hoursWorked = (35 * devolplementRate) + ((hoursWorked - 35) * devolplementRate * 1.5);
		} else {
			return hoursWorked * devolplementRate;
		}

	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public DeveloperLevel getDevLevel() {
		return devLevel;
	}

	public void setDevLevel(DeveloperLevel devLevel) {
		this.devLevel = devLevel;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Developer other = (Developer) obj;
		if (devLevel != other.devLevel)
			return false;
		if (Double.doubleToLongBits(hourlyRate) != Double.doubleToLongBits(other.hourlyRate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nDeveloper " + super.toString() + "\nHourly Rate: " + hourlyRate + "\nLevel:" + devLevel + "\n";
	}

}
