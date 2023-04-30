package com.masai;

import org.springframework.stereotype.Component;

@Component
public class Bus {
    
    private int id;
    private String name;
    private String type;
    private double minFare;
    private double maxFare;
    
    
    public void setId(int id) {
        this.id = id;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    public void setType(String type) {
        this.type = type;
    }
    
    
    public void setMinFare(double minFare) {
        this.minFare = minFare;
    }
    
    
    public void setMaxFare(double maxFare) {
        this.maxFare = maxFare;
    }


    @Override
    public String toString() {
	return "\n*******Bus Details*******\nID : " + id + "\nNAME : " + name + "\nTYPE : " + type + "\nMINIMUM FARE : " + minFare + "\nMAXIMUM FARE : " + maxFare
		;
    }
    
    
    

}
