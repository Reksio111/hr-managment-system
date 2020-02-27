package com.amazingsoftwarecompany.hrmanagement;

import java.time.LocalDate;

public abstract class Employee {

	private static int num = 1;
	private int employeeId;
	private Name name;
	private int departmentId;
	private LocalDate date;
	private String phoneNumber;

	public Employee(String title, String fn, String ln, int day, int month, int year, String phone, int deptId) {
		this.name = new Name(title, fn, ln);
		this.date = LocalDate.of(year, month, day);
		this.departmentId = deptId;
		this.phoneNumber = phone;
		this.employeeId = num++;
	}

	public static int getNum() {
		return num;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public Name getName() {
		return name;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public static void setNum(int num) {
		Employee.num = num;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "EmployeeId: " + employeeId + "\nName: " + name + "\nDepartment id: " + departmentId
				+ "\nDate start: " + date + "\nPhone number: " + phoneNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (departmentId != other.departmentId)
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}

}
