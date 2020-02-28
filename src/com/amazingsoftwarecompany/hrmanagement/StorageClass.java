package com.amazingsoftwarecompany.hrmanagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StorageClass {

	private List<Department> departments = new ArrayList<Department>();;
	private List<Employee> employees = new ArrayList<Employee>();
	

	public void displayDepartments() {
		departments();
		for (Department d : departments) {
			System.out.println(d);
		}
		System.out.println();
	}

	public void displayEmployees() {
		if (!employees.isEmpty()) {
			for (Employee e : employees) {
				System.out.println(e);
			}
			System.out.println();
		} else {
			System.out.println("The list is empty\n");
		}
	}

	public List<Department> departments() {

		Department development = new Department("software design", 0);
		Department QA = new Department("quality & assurance", 0);
		Department devops = new Department("devops", 0);

		departments.add(development);
		departments.add(QA);
		departments.add(devops);
		return departments;

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
		System.out.println();
	}

	public void displayDevelopers() {
		for (Employee e : employees) {
			if (e instanceof Developer) {
				System.out.println(e);
			}
		}
		System.out.println();
	}

	public void addNewEmployee() {
		Scanner keyIn = new Scanner(System.in);
		LocalDate date = LocalDate.now();
		int day = date.getDayOfMonth();
		int month = date.getMonthValue();
		int year = date.getYear();

		System.out.println("Enter your details plaese");
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
		System.out.println();
	}

	public void removeEmployee() {
		Scanner keyIn = new Scanner(System.in);
		System.out.print("Enter employee number:");
		int num = keyIn.nextInt();

		for (int i = 0; i < employees.size(); i++) {
			if (num == employees.get(i).getEmployeeId()) {
				employees.remove(i);
			}
		}
		for (Employee e : employees) {
			System.out.println(e);
		}
	}

	public void editEmployeeById() {
		Scanner keyIn = new Scanner(System.in);
		boolean employeeFound = false;
		System.out.print("Enter employee number to be edited:  ");
		int id = keyIn.nextInt();
		for (Employee emp : employees) {
			employeeFound = true;
			if (id == emp.getEmployeeId()) {
				
				Employee temp = emp;
				Name tempN = emp.getName();
				System.out.print("Enter new title:");
				String title = keyIn.nextLine();
				System.out.print("Enter new last name:");
				String lname = keyIn.nextLine();
				System.out.print("Enter new phone number:");
				String phone = keyIn.nextLine();
				
				if (emp instanceof Manager) {
					Manager tempM = (Manager) emp;
					System.out.print("Enter new wage:");
					int wage = keyIn.nextInt();
					System.out.print("Enter new bonus rate:");
					double bonus = keyIn.nextDouble();
					tempN.setTitle(title);
					tempN.setLname(lname);
					temp.setPhoneNumber(phone);
					tempM.setMonthlySalary(wage);
					tempM.setBonus(bonus);
				} else {
					System.out.print("Enter new level:");
					int level = keyIn.nextInt();
					Developer tempD = (Developer) emp;
					tempN.setTitle(title);
					tempN.setLname(lname);
					tempD.setPhoneNumber(phone);
					if (level == 1) {
						tempD.setDevLevel(DeveloperLevel.LEVEL1);
					}
					if (level == 2) {
						tempD.setDevLevel(DeveloperLevel.LEVEL2);
					}
					if (level == 3) {
						tempD.setDevLevel(DeveloperLevel.LEVEL3);
					}
				}

			}
			if (employeeFound) {
				System.out.println("Employee details updated sucessfully\n");
			} else {
				System.out.println("Employee with given name not found...\n");
			}
		}
		keyIn.close();
	}
}
