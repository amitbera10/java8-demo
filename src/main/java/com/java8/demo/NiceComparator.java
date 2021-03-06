package com.java8.demo;

import static com.java8.demo.util.Bootstrap.*;

import java.util.Collections;
import java.util.Comparator;

import com.java8.demo.model.Employee;


public class NiceComparator {

	public static void main(String[] args) {
		init();
		Collections.sort(employees, Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getAge));
	}
}
