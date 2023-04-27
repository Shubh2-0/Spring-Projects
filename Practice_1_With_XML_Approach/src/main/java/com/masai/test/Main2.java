package com.masai.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masai.model.Employee;

public class Main2 {
    
    public static void main(String[] args) {
	

	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("collectionConfig.xml");
	
	Employee emp = ctx.getBean(Employee.class,"emp1");
	
	
	
	System.out.println(emp);
	
	
	
	
    }

}
