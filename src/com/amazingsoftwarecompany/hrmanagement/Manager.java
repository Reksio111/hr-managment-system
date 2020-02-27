package com.amazingsoftwarecompany.hrmanagement;

public class Manager extends Employee {

	private double monthlySalary;
	private double bonus;

	public Manager(String title, String fn, String ln, int day, int month, int year, String phone, int deptId,
			double monthlySalary, double bonus) {
		super(title, fn, ln, day, month, year, phone, deptId);
		this.monthlySalary = monthlySalary;
		this.bonus = bonus;
	}

	@Override
	public double weeklyPay(double bonus) {
		return monthlySalary = ((monthlySalary / 100) * bonus) + monthlySalary;

	}

	@Override
	public String toString() {
		return "monthlySalary: " + monthlySalary + "\nbonus=" + bonus + "\n";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		if (Double.doubleToLongBits(bonus) != Double.doubleToLongBits(other.bonus))
			return false;
		if (Double.doubleToLongBits(monthlySalary) != Double.doubleToLongBits(other.monthlySalary))
			return false;
		return true;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}
