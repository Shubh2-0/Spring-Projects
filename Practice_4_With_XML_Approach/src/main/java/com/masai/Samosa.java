package com.masai;

public class Samosa {
    
    
    private double price;

    public Samosa(double price) {
	
	this.price = price;
    }

    
    public void init() {
		
	System.out.println("raw material collected for making samosa");
    }
 
    
    public void destroy() {
	
   	System.out.println("evening time now samosa is not available");
       }
       
    
    
}
