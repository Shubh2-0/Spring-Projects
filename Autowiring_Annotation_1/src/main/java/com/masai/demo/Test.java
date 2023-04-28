package com.masai.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    
    public static void main(String[] args) {

	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Bus b = ctx.getBean(Bus.class,"b1");
	
	System.out.println(b);
	
	PessengerWithConsAnnotation p1 = ctx.getBean(PessengerWithConsAnnotation.class,"pwca1");
	System.out.println("\n\nBus Autowiring using Annotation on Constructor Injection\n" + p1);
	
	
	PessengerWithSetterAnnotation p2 = ctx.getBean(PessengerWithSetterAnnotation.class,"pwsa1");
	System.out.println("\n\nBus Autowiring using Annotation on Setter Injection On Bus\n" + p2);
	
	
	
	PessengerWithVariableAnnotation p3 = ctx.getBean(PessengerWithVariableAnnotation.class,"pwva1");
	System.out.println("\n\nBus Autowiring using Annotation on Variable On bus variable\n" + p3);
	
	
	
    }

}
