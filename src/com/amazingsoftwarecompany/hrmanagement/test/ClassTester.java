package com.amazingsoftwarecompany.hrmanagement.test;

import java.util.ArrayList;

import com.amazingsoftwarecompany.hrmanagement.*;

public class ClassTester {
	public static void main(String args[]) {


		StorageClass storage = new StorageClass();

		
		DeveloperLevel level=DeveloperLevel.LEVEL2;
		double rate=level.getRate();
		DeveloperLevel level1=DeveloperLevel.LEVEL3;
		double rate1=level1.getRate();
		Employee manager = new Manager("mr", "john", "mccabe", 12, 12, 2019, "12345678", 1, 1000, .5);
		Employee developer = new Developer("mr", "john", "mccabe", 12, 12, 2019, "12345678", 1, level,rate);
		Employee developer1 = new Developer("mr", "john", "Smith", 6, 12, 2009, "12345734", 1, level1,rate1);
		
		Employee manager1 = new Manager("mr", "will", "smith", 25, 1, 2012, "12345678", 1, 1200, .2);
		Department development = new Department("software design", 0);
		Department QA = new Department("quality & assurance", 0);
		Department devops = new Department("devops", 0);
		storage.addDepartment(QA);
		storage.addDepartment(development);
		storage.addDepartment(devops);
		storage.addEmployee(developer);
		storage.addEmployee(developer1);
		storage.addEmployee(manager);
		storage.addEmployee(manager1);
		
//		
//		System.out.println("Departments");
//		storage.getDepartments();
//		System.out.println("\nEmployees");
//		storage.getEmployees();
//		
//		System.out.println("\nManagers only");
//		storage.displayManagers();
//		
//		System.out.println("\nDevelopers only");
//		storage.displayDevelopers();

		storage.addNewEmployee();
		storage.getEmployees();
		
	}
}



