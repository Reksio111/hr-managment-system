package com.amazingsoftwarecompany.hrmanagement.test;

import com.amazingsoftwarecompany.hrmanagement.Department;
import com.amazingsoftwarecompany.hrmanagement.Developer;
import com.amazingsoftwarecompany.hrmanagement.DeveloperLevel;
import com.amazingsoftwarecompany.hrmanagement.Manager;

public class ClassTester {

	public static void main(String[] args) {

		Department development = new Department("software design", 0);
		Department QA = new Department("quality & assurance", 0);
		Department devops = new Department("devops", 0);

		System.out.println(development.toString());
		System.out.println(QA.toString());
		System.out.println(devops.toString());

		System.out.println(devops.equals(development));
		System.out.println(devops.equals(QA));

		Manager manager = new Manager("mr", "paul", "buchanan", 30, 07, 2000, "0861234578", 1, 2000, 0.20);
		System.out.println(manager.weeklyPay(20));
		
		

//		DeveloperLevel level1 = DeveloperLevel.LEVEL1;
//		double rate = level1.getRate();
//		Developer developer = new Developer("MR", "Bryan", "Buchanan", 30, 07, 2000, "0861234578", 1, level1, rate);
//
//		System.out.println(developer.toString() + "your wage is: " + developer.weeklyPay(36));
//
//		DeveloperLevel level2 = DeveloperLevel.LEVEL2;
//		double rate2 = level2.getRate();
//		Developer developer2 = new Developer("MR", "Ryan", "Asfgh", 30, 07, 2000, "0861234578", 1, level2, rate2);
//
//		System.out.println(developer2.toString() + "your wage is: " + developer2.weeklyPay(36));
//
//		DeveloperLevel level3 = DeveloperLevel.LEVEL3;
//		double rate3 = level3.getRate();
//		Developer developer3 = new Developer("MR", "tj", "Dgdfh", 30, 07, 2000, "0861234578", 1, level3, rate3);
//
//		System.out.println(developer3.toString() + "your wage is: " + developer3.weeklyPay(36));

	}

}
