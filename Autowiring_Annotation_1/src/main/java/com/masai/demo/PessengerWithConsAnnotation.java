package com.masai.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class PessengerWithConsAnnotation {

    private int id;
    private String name;
    private Bus bus;
    
    
    @Autowired
    public PessengerWithConsAnnotation(int id, String name, Bus bus) {
	this.id = id;
	this.name = name;
	this.bus = bus;
    }


    @Override
    public String toString() {
	return "Pessenger id : "  + id + "\nName : " + name + "\nBUS DETAILS :- \n" + bus + "\n**********\n";
    }
    
    
    
    
    
    
}
