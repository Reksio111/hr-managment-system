package com.amazingsoftwarecompany.hrmanagement.test;

import com.amazingsoftwarecompany.hrmanagement.Department;
import com.amazingsoftwarecompany.hrmanagement.Developer;
import com.amazingsoftwarecompany.hrmanagement.DeveloperLevel;
import com.amazingsoftwarecompany.hrmanagement.Employee;

public class ClassTester {

	public static void main(String[] args) {

		Department development = new Department("software design", 0);
		Department QA = new Department("quality & assurance", 0);
		Department devops = new Department("devops", 0);
		DeveloperLevel level=DeveloperLevel.LEVEL1;
		double rate=level.getRate();
		DeveloperLevel level2=DeveloperLevel.LEVEL2;
		double rate2=level2.getRate();
		DeveloperLevel level3=DeveloperLevel.LEVEL3;
		double rate3=level3.getRate();
		Developer dev1=new Developer("Mr","John","McCabe",12,12,2019, "12345678", 12,level,rate);
		Developer dev2=new Developer("Mr","John","McCabe",12,12,2019, "12345678", 1,level2,rate2);
		Developer dev3=new Developer("Mr","John","McCabe",12,12,2019, "12345678", 22,level3,rate3);


//		System.out.println(development.toString());
//		System.out.println(QA.toString());
//		System.out.println(devops.toString());
		System.out.println(dev1.toString());
		System.out.println(dev2.toString());
		System.out.println(dev3.toString());


//		System.out.println(devops.equals(development));
//		System.out.println(devops.equals(QA));
		System.out.println(dev1.equals(dev2));
	}

}
