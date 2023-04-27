package com.masai.demo;

public class Book {

    private String name;
    private int price;
    
    
    public Book(String name, int price) {
	this.name = name;
	this.price = price;
    }


    @Override
    public String toString() {
	return "Book Name : " + name + "\nPrice : " + price + "\n\n======\n\n";
    }
    
    
    
    
    
    
}
