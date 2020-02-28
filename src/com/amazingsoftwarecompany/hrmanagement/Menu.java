package com.amazingsoftwarecompany.hrmanagement;

import java.util.Scanner;

public class Menu {

	public void showMenu() {
		StorageClass storage = new StorageClass();

		Scanner sc = new Scanner(System.in);
		int userOption;
		do {
			System.out.println("1. List all Employees");
			System.out.println("2. List all Departments");
			System.out.println("3. Add a new Employee");
			System.out.println("4. Edit an Employee by id");
			System.out.println("5. Delete an Employee by id");
			System.out.println("6. View all Managers");
			System.out.println("7. View all Developers");
			System.out.println("8. View number of staff within a department");
			System.out.println("9. Payment");
			System.out.println("10. Show help");
			System.out.println("11. Exit Menu");

			System.out.println("\nenter your option please between 1-11");
			userOption = sc.nextInt();
			switch (userOption) {

			case 1:
				storage.displayEmployees();
				break;
			case 2:
				storage.displayDepartments();
				break;
			case 3:
				storage.addNewEmployee();
				break;
			case 4:
				storage.editEmployeeById();
				break;
			case 5:
				storage.removeEmployee();
				break;
			case 6:
				storage.displayManagers();
				break;
			case 7:
				storage.displayDevelopers();
				break;
			case 8:
				System.out.println("Number of staff in that department is: ");
				break;
			case 9:
				System.out.println("Your pay is; ");
				break;
			case 10:
				System.out.println("In this menu 1-11 you can choice different opions to do different tasks."
						+ "\nYou just enter in a single number eg 7 and it does that task."
						+ "\nNumber 1 just prints out all employees. Number 2 prints out all departments."
						+ "\nNumber 3 lets you add a new employee. number 4 lets you edit an employee info"
						+ "\nNumber 5 lets you delete an employee. number 6 shows you all managers"
						+ "\nNumber 7 shows you all your developers. number 8 shows you how many workers in a department"
						+ "\nNumber 9 shows a employee there pay and number 11 exits the menu"
						+ "\nHope this was helpfully");
				break;
			case 11:
				System.out.println("Thanks menu is closed");
				break;
			default:
				System.out.println("avabile choice from 1-11");
				break;
			}

		} while (userOption != 11);

	}

}
