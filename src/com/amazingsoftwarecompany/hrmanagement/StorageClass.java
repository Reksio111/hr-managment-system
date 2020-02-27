package com.amazingsoftwarecompany.hrmanagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StorageClass {

	private List<Department> departments = new ArrayList<Department>();;
	private List<Employee> employees = new ArrayList<Employee>();

	public void getDepartments() {
		for (Department d : departments) {
			System.out.println(d);
		}
	}

	public void getEmployees() {
		for (Employee e : employees) {
			System.out.println(e);
		}
	}

	public void addDepartment(Department d) {
		departments.add(d);
	}

	public void addEmployee(Employee e) {
		employees.add(e);
	}

	public void displayManagers() {
		for (Employee e : employees) {
			if (e instanceof Manager) {
				System.out.println(e);
			}
		}
	}

	public void displayDevelopers() {
		for (Employee e : employees) {
			if (e instanceof Developer) {
				System.out.println(e);
			}
		}
	}

	public void addNewEmployee() {
		LocalDate date = LocalDate.now();
		int day = date.getDayOfMonth();
		int month = date.getMonthValue();
		int year = date.getDayOfYear();

		Scanner keyIn = new Scanner(System.in);
		System.out.println("Ente your details plaese");
		System.out.print("Position: ");
		String pos = keyIn.nextLine();
		System.out.print("Title: ");
		String title = keyIn.nextLine();
		System.out.print("Your first name: ");
		String fname = keyIn.nextLine();
		System.out.print("Your last name: ");
		String lname = keyIn.nextLine();
		System.out.print("Phone number: ");
		String phone = keyIn.nextLine();
		System.out.print("Department number: ");
		int dept = keyIn.nextInt();

		if (pos.equalsIgnoreCase("Manager")) {

			Manager temp = new Manager(title, fname, lname, day, month, year, phone, dept, 1200, 0);
			employees.add(temp);
		} else if (pos.equalsIgnoreCase("Developer")) {
			DeveloperLevel lev = DeveloperLevel.LEVEL1;
			double rate = lev.getRate();
			Developer temp = new Developer(title, fname, lname, day, month, year, phone, dept, lev, rate);
			employees.add(temp);
		}

	}
}