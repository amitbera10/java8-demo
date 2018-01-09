package com.java.java8.demo.pojo;

import com.java.java8.demo.Gender;

public class Employee {
	private int empId;
	private String firstName;
	private String lastName;
	private Gender gender;
	private String address;
	private String phoneNumber;
	private int age;

	public Employee() {
	}
	
	
	public Employee(int empId, String firstName, String lastName, Gender gender, String address, String phoneNumber,int age) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.age = age;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + ", age=" + age + "]";
	}

	public static int compareByAge(Employee e1,Employee e2){
		return e1.getAge() - e2.getAge();  
	}
	
	
}
