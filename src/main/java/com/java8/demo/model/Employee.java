package com.java8.demo.model;

import com.java8.demo.Gender;

public class Employee {
	private int empId;
	private String firstName;
	private String lastName;
	private Gender gender;
	private String city;
	private String phoneNumber;
	private int age;
	private double salary;

	public Employee() {
	}
	
	
	public Employee(int empId, String firstName, String lastName, Gender gender, String address, String phoneNumber,int age,double salary) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.city = address;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.salary = salary;
	}



	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String address) {
		this.city = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
		        + ", age=" + age + ", salary=" + salary + "]";
	}


	public static int compareByAge(Employee e1,Employee e2){
		return e1.getAge() - e2.getAge();  
	}
	
	
}
