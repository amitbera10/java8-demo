package com.java8.demo;

import static com.java8.demo.util.Bootstrap.*;

import com.java8.demo.model.Employee;

public class MethodRef {
	public static void main(String[] args) {
		init();
		employees.stream().filter(MethodRef::isMale).map(Employee::getFirstName).reduce("", String::concat);
		employees.stream().map(Employee::getSalary).reduce(0.0,Double::sum);

	}

	public static boolean isMale(Employee employee) {

		return Gender.MALE.equals(employee.getGender());
	}

}
