package com.amazingsoftwarecompany.hrmanagement.test;

import com.amazingsoftwarecompany.hrmanagement.Department;

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
	}

}
