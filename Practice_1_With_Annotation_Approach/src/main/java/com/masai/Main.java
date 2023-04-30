package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    
    public static void main(String[] args) {
	

	ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
	
	Bus b1 = ctx.getBean(Bus.class);
	b1.setId(573);
	b1.setMaxFare(600.23);
	b1.setMinFare(50);
	b1.setName("Sky Bus");
	b1.setType("Routine Bus");
	
	Passenger p1 = ctx.getBean(Passenger.class);
	p1.setId(1);
	p1.setName("Ram");
	
	System.out.println(p1);

	
	
    }
}
