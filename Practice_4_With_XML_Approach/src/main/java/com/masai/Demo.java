package com.masai;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    public static void main(String[] args) {
	
	AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    
    Samosa s = ctx.getBean(Samosa.class,"s");
    
  
    
    ctx.registerShutdownHook();
    
    
	
    }
}
