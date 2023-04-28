package com.masai.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Bus {
    
    private int id;
    private String name;
    private String type;
    

    public Bus(int id, String name, String type) {
	this.id = id;
	this.name = name;
	this.type = type;
    }


    @Override
    public String toString() {
	return "Bus Id : " + id + "\nName : " + name + "\nType : " + type ;
    }
    
    
    
    
    

}
