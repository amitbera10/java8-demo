package com.java8.demo.stream;

import static com.java8.demo.Bootstrap.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.java8.demo.Gender;
import com.java8.demo.model.Employee;

public class MainStream {
	public static void main(String[] args) {
		init();

		/*
		 * list of employee having age greater than 25 1. this will use filter,
		 * map, collect 2. filter takes Predicate<T> which has abstract method
		 * "boolean test(T t)" 3. map takes Function<T, R> which has abstract
		 * method "R apply(T t)" 4. collect object of type Collector<T, A, R>.
		 * Collector is not an functional interfaces
		 */

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

		// System.out.println("Old employee : " + oldEmployee);

		// sort by age

		List<Employee> sortedEmpList = employees.stream()
		                                        .sorted(Employee::compareByAge)
		                                        .collect(Collectors.toList());

		// System.out.println("Employee list sort by age : " + sortedEmpList);

		// sort using comparator
		Comparator<Employee> comparator = Comparator.comparing(Employee::getAge)
		                                            .thenComparing(Employee::getSalary);
		List<Employee> employeesListCopy = employees;

		Collections.sort(employeesListCopy, comparator);

		System.out.println("Sorted employee list using : " + employeesListCopy);

		// Map employee id as key and name as value

		Map<Integer, String> empMap = employees.stream()
		                                       .collect(Collectors.toMap(Employee::getEmpId, Employee::getFirstName));

		// System.out.println("Employee map by id : " + empMap);
		// group by age

		Map<Integer, List<Employee>> empByAgeGroup = employees.stream()
		                                                      .collect(Collectors.groupingBy(e -> e.getAge()));
		// System.out.println("Employee by age group : " + empByAgeGroup);

		// Divide employee by age greater than 25

		Map<Boolean, List<Employee>> empOldAndNewGroup = employees.stream()
		                                                          .collect(Collectors.partitioningBy(
		                                                                  e -> e.getAge() > 25));

		// System.out.println("Employee group by age greater than 25 : " +
		// empOldAndNewGroup);

		// Intermediate peek opearion
		// peek generally use for debugging

		employees.stream()
		         .filter(e -> e.getAge() > 25)
		         .peek(e -> System.out.println(e))
		         .map(e -> e.getFirstName() + " " + e.getLastName())
		         .peek(e -> System.out.println(e))
		         .collect(Collectors.toList());

		// find distinct city from all male employee belongs to

		Set<String> cites = employees.stream()
		                             .filter(e -> Gender.MALE.equals(e.getGender()))
		                             .map(e -> e.getCity())
		                             .distinct()
		                             .collect(Collectors.toSet());
		System.out.println("Cities : "+cites);

	}

}
