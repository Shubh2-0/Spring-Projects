package com.masai.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class PessengerWithVariableAnnotation {
    
    private int id;
    private String name;
    @Autowired
    private Bus bus;
    
    
    public PessengerWithVariableAnnotation(int id, String name, Bus bus) {
	this.id = id;
	this.name = name;
	this.bus = bus;
    }


    @Override
    public String toString() {
	return "Pessenger id : "  + id + "\nName : " + name + "\nBUS DETAILS :- \n" + bus + "\n**********\n";
    }

    
    
    
    
}
