package com.masai;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    
   private List<EmployeeSetter> employees;
   private List<EmployeeConstructorArg> employees2;

    public void setEmployees(List<EmployeeSetter> employees) {
    this.employees = employees;
    }

    public void myInit() {
	System.out.println("inside init method");
    }
    
    
    public void setEmployees2(List<EmployeeConstructorArg> employees2) {
        this.employees2 = employees2;
    }

    public void destroy() {
	System.out.println("inside destroy method");
    }
    

    public static void main(String[] args) {
	
	AbstractApplicationContext aactx = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Demo d1 = aactx.getBean(Demo.class,"d1");
	
	System.out.println(d1.employees);
	System.out.println(d1.employees2);
	
	
	
	aactx.close();
	
    }

}
