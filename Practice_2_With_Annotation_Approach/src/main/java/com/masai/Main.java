package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    
    public static void main(String[] args) {

	ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
	
	Address ad1 = ctx.getBean(Address.class,"getAddress");
	ad1.setAddressId(582);
	ad1.setCity("Indore");
	ad1.setCountry("India");
	ad1.setState("Madhya Pradesh");
	
	Employee emp1 = ctx.getBean(Employee.class);
	emp1.setEmpId(24);
	emp1.setName("Karam");
	emp1.setSalary(60000);
	
	System.out.println(emp1);
	
	
	
	
    }

}
