package com.masai.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class PessengerWithSetterAnnotation {

    
   private int id;
   private String name;
   private Bus bus;
   
public void setId(int id) {
    this.id = id;
}

public void setName(String name) {
    this.name = name;
}

@Autowired
public void setBus(Bus bus) {
    this.bus = bus;
}

@Override
public String toString() {
    return "Pessenger id : "  + id + "\nName : " + name + "\nBUS DETAILS :- \n" + bus + "\n**********\n";
}
   
   
   
   
    
}
