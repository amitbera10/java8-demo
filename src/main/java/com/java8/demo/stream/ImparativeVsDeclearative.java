package com.java8.demo.stream;

import static com.java8.demo.Bootstrap.*;

import com.java.java8.demo.pojo.Employee;
import com.java8.demo.Gender;

public class ImparativeVsDeclearative {

	public static void main(String[] args) {
		init();
		// find avg salary of all female employee over age 25
		double totalSal = 0;
		int numberOfFemale = 0;
		for (int i = 0; i < employees.size(); i++) {
			Employee e = employees.get(i);
			if (Gender.FEMALE.equals(e.getGender()) && e.getAge() > 25) {
				totalSal += e.getSalary();
				numberOfFemale++;
			}
		}

		System.out.println("Avg sal of female emp with age greater than 25 : " + (totalSal / numberOfFemale));

		// same problem using stream
		double avgSal = employees.stream()
		                         .filter(e -> Gender.FEMALE.equals(e.getGender()))
		                         .filter(e -> e.getAge() > 25)
		                         .mapToDouble(e -> e.getSalary())
		                         .average()
		                         .orElse(0);
		System.out.println("Avg sal of female emp with age greater than 25 : " + avgSal);
	}
}
