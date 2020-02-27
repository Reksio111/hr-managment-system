package com.amazingsoftwarecompany.hrmanagement.test;

import com.amazingsoftwarecompany.hrmanagement.Department;
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

		System.out.println(manager.wagesAfterBonus(20));

	}

}
