package com.amazingsoftwarecompany.hrmanagement;

public class Department {

	private static int id = 0;
	private int departmentId;
	private String departmentName;
	private int numberOfEmployees;

	public Department(String departmentName, int numberOfEmployees) {
		super();
		this.departmentId = ++id;
		this.departmentName = departmentName;
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getNumberOfEmployees() {
		System.out.print("number of employees in the department is: ");
		return numberOfEmployees;
	}

	@Override
	public String toString() {
		return "Department: " + departmentId + "\nDepartmentName: " + departmentName + "\nNumberOfEmployees: "
				+ numberOfEmployees + "\n";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (departmentId != other.departmentId)
			return false;
		if (departmentName == null) {
			if (other.departmentName != null)
				return false;
		} else if (!departmentName.equals(other.departmentName))
			return false;
		if (numberOfEmployees != other.numberOfEmployees)
			return false;
		return true;
	}

}
