package com.masai.demo;

public class Student2 {

    
    private String name;
    private int age;
    private Book b;
    
    public Student2(String name, int age, Book b) {
	this.name = name;
	this.age = age;
	this.b = b;
    }

    @Override
    public String toString() {
	return "Student Name : " + name + "\nAge : " + age + "\n==Book Detail==\n" + b;
    }
    
    
    
}
