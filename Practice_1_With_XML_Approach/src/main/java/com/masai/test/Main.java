package com.masai.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masai.model.Car;
import com.masai.model.RollNumbers;
import com.masai.model.Student;

public class Main {
    
    public static void main(String[] args) {

	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Student st = ctx.getBean(Student.class, "student1");
	
	Car car = ctx.getBean(Car.class,"car1");
      
	RollNumbers rollsNumbers = ctx.getBean(RollNumbers.class,"numbers");

	System.out.println(rollsNumbers);

	System.out.println(st);
	System.out.println(car);

	
    }

}
