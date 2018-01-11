package com.java8.demo.stream;

import static com.java8.demo.util.Bootstrap.*;

import com.java8.demo.Gender;
import com.java8.demo.model.Employee;

public class LazyStream {
  public static void main(String[] args) {
	  init();
	  employees.stream()
	  			.filter(e->isMaleEmployee(e))
	  			.map(e->e.getFirstName());
  }
  
  public static boolean isMaleEmployee(Employee employee) {
	  System.out.println("Is an employee male or female");
	  return employee.getGender().equals(Gender.MALE);
  }
}
