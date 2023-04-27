package com.masai.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masai.model.Student;
import com.masai.model.Teacher;
import com.masai.model.Teacher2;

public class Demo {
    
    public static void main(String[] args) {
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

	Teacher t1 = ctx.getBean(Teacher.class,"t1");
	
	System.out.println(t1);
	
	
	Teacher2 t2 = ctx.getBean(Teacher2.class,"t2");
	
	System.out.println(t2);
    }
    

}
