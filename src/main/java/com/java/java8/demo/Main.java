package com.java.java8.demo;

import static com.java.java8.demo.Bootstrap.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java.java8.demo.pojo.Employee;

public class Main {
	public static void main(String[] args) {
		init();

		// print each employee
		// employees.stream().forEach(System.out::println);

		// list of employee having age greater than 25

		List<String> oldEmpNames = employees.stream()
		                                    .filter(e -> e.getAge() > 25)
		                                    .map(e -> e.getFirstName() + " " + e.getLastName())
		                                    .collect(Collectors.toList());
		System.out.println(oldEmpNames);

		// find the first employee with age greater than 30

		Employee oldEmployee = employees.stream()
		                                .filter(e -> e.getAge() > 30)
		                                .findFirst()
		                                .orElse(null);

		System.out.println("Old employee : " + oldEmployee);

		// sort by age

		List<Employee> sortedEmpList = employees.stream()
		                                        .sorted(Employee::compareByAge)
		                                        .collect(Collectors.toList());

		System.out.println("Employee list sort by age : " + sortedEmpList);

		// Map employee id as key and name as value

		Map<Integer, String> empMap = employees.stream()
		                                       .collect(Collectors.toMap(Employee::getEmpId, Employee::getFirstName));

		System.out.println("Employee map by id : " + empMap);

		// group by age

		Map<Integer, List<Employee>> empByAgeGroup = employees.stream()
		                                                      .collect(Collectors.groupingBy(e -> e.getAge()));
		System.out.println("Employee by age group : " + empByAgeGroup);

		// Divide employee by age greater than 25

		Map<Boolean, List<Employee>> empOldAndNewGroup = employees.stream()
		                                                          .collect(Collectors.partitioningBy(
		                                                                  e -> e.getAge() > 25));
		System.out.println("Employee  group by age greater than 25 : " + empOldAndNewGroup);

	}

}
