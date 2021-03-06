package com.java8.demo.util;

import java.util.ArrayList;
import java.util.List;

import com.java8.demo.Gender;
import com.java8.demo.model.Employee;

public class Bootstrap {
	public static List<Employee> employees = new ArrayList<>();

	public static void init() {
		loadData();
	}

	public static void loadData() {
		Employee e1 = new Employee(1001, "Smith", "Hall", Gender.MALE, "NY", "9878675434", 25,2000.35);
		Employee e2 = new Employee(1002, "Allen", "Johnson", Gender.FEMALE, "CA", "8786453487", 26,3000.50);
		Employee e3 = new Employee(1003, "Williams", "Jones", Gender.MALE, "LA", "8786453453", 24,2500.67);
		Employee e4 = new Employee(1004, "Moore", "Hill", Gender.FEMALE, "WC", "7278675643", 28,2300.78);
		Employee e5 = new Employee(1005, "Taylor", "Lopez ", Gender.FEMALE, "NY", "8786753423", 30,2799.76);
		Employee e6 = new Employee(1006, "Wilson", "Green", Gender.MALE, "CH", "9873456566", 23,4003.88);
		Employee e7 = new Employee(1007, "Anderson", "Hall", Gender.MALE, "DE", "8383674747", 23,6363.88);
		Employee e8 = new Employee(1008, "Thomas ", "Scott", Gender.MALE, "SA", "8738383838", 24,5467.77);
		Employee e9 = new Employee(1009, "Garcia", "Campbell", Gender.MALE, "WE", "8484846749", 31,2276.87);
		Employee e10 = new Employee(1010, "Garcia", "Cavanagh", Gender.MALE, "SA", "7274747487", 26,2543.84);
		if (employees.size() == 0) {
			employees.add(e1);
			employees.add(e2);
			employees.add(e3);
			employees.add(e4);
			employees.add(e5);
			employees.add(e6);
			employees.add(e7);
			employees.add(e8);
			employees.add(e9);
			employees.add(e10);
		}
	}
}
