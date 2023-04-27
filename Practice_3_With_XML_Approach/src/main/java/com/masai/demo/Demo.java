package com.masai.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    
    
    public static void main(String[] args) {
	
   
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	
//	Student st1 = ctx.getBean(Student.class,"st1");
	Student2 st2 = ctx.getBean(Student2.class,"st2");
	
//	System.out.println(st1);
	
	System.out.println(st2);
	
	
    }

}
