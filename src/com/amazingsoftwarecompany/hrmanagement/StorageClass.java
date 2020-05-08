package com.amazingsoftwarecompany.hrmanagement;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StorageClass implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -5534690237680248878L;
	private List<Department> departments = new ArrayList<Department>();;
	private List<Employee> employees = new ArrayList<Employee>();
	String fileName = "employees_List.txt";

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
			saveToFile();

		} else if (pos.equalsIgnoreCase("Developer")) {
			DeveloperLevel lev = DeveloperLevel.LEVEL1;
			double rate = lev.getRate();
			Employee temp = new Developer(title, fname, lname, day, month, year, phone, dept, lev, rate);
			employees.add(temp);
			saveToFile();
		}

		System.out.println();
	}

	public void removeEmployee() {
		Scanner keyIn = new Scanner(System.in);
		boolean emplFound = false;
		System.out.print("Enter employee number:");
		int num = keyIn.nextInt();

		for (int i = 0; i < employees.size(); i++) {
			if (num == employees.get(i).getEmployeeId()) {
				emplFound = true;
				employees.remove(i);
			}
		}
		if (emplFound) {
			System.out.println("Employee removed from the database sucesfully");

		} else {
			System.out.println("Given id not extists in the database");
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
				System.out.println("Employee with given number not found...\n");
			}
		}
	}

	public void saveToFile() {
		try {

			FileOutputStream saveToFile = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(saveToFile);
			out.writeInt(employees.size());
			for (Employee empl : employees) {
				out.writeObject(empl);
			}
			out.close();
			System.out.println("The file overewritten sucessfully");
		} catch (IOException error) {
			error.toString();
		}
	}

	public void readListFromFile() {

		try {
			FileInputStream fileInput = new FileInputStream(fileName);
			ObjectInputStream objectStream = new ObjectInputStream(fileInput);
			int count = objectStream.readInt();
			if (count > 0) {
				for (int i = 0; i < count; i++) {
					employees.add((Employee) objectStream.readObject());
				}
			}
			objectStream.close();
		} catch (ClassNotFoundException error) {
			error.toString();
		} catch (IOException error) {
			error.toString();
		}

	}
}
