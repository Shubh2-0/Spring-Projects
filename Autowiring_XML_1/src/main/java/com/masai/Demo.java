package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    
    public static void main(String[] args) {
	
	ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");

	Employee e = cxt.getBean(Employee.class,"emp1");
	
	System.out.println(e.getEmpAddress());
	
	
    }

}
