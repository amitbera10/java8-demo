package com.java.java8.demo;

public enum Gender {
   MALE("Male"),
   FEMALE("Female");
   
   String displayString;
   Gender(String gender){
	   this.displayString = gender;
   }
   
   
}
