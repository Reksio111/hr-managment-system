package com.amazingsoftwarecompany.hrmanagement.test;

import com.amazingsoftwarecompany.hrmanagement.Department;
import com.amazingsoftwarecompany.hrmanagement.Employee;

public class ClassTester {

	public static void main(String[] args) {

		Department development = new Department("software design", 0);
		Department QA = new Department("quality & assurance", 0);
		Department devops = new Department("devops", 0);
		Employee emp=new Employee("Mr","John","McCabe", 12,10,1988, "12345678",12);
		Employee emp1=new Employee("Mr","John","McCabe", 12,10,1988, "12345678",12);

		System.out.println(development.toString());
		System.out.println(QA.toString());
		System.out.println(devops.toString());

		System.out.println(devops.equals(development));
		System.out.println(devops.equals(QA));
		System.out.println(emp.toString());
		System.out.println(emp1.toString());
		System.out.println(emp.equals(emp1));
	}

}
