package com.masai.demo;

public class Student {
    
    private String name;
    private int age;
    private String city;
    
    
   
    
    public Student(String name, int age, String city) {
	this.name = name;
	this.age = age;
	this.city = city;
    }




    @Override
    public String toString() {
	return "Student Name : " + name + "\nAge : " + age + "\nCity : " + city + "\n=========\n";
    }
    
    
    

}
