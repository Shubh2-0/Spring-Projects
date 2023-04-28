package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    
    
    public static void main(String[] args) {
	

	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Bus b1 = ctx.getBean(Bus.class,"bus");
	
	System.out.println(b1);
	
	Passenger p1 = ctx.getBean(Passenger.class,"p1");
	
	System.out.println(p1);
	
    }

}
