package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Passenger {
    
    private int id;
    private String name;
    @Autowired
    private Bus bus;
    
    
    public void setId(int id) {
        this.id = id;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    public void setBus(Bus bus) {
        this.bus = bus;
    }
    
    
    @Override
    public String toString() {
	return "Passenger Id : " + id + "\nName : " + name + bus;
    }
    
    

}
