package com.masai;

public class EmployeeConstructorArg {
    
    private int id;
    
    private String name;
    
    private String city;
    
    private int salary;

    public EmployeeConstructorArg(int id, String name, String city, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.salary = salary;
    }

    @Override
    public String toString() {
	return "\nEmployee Id : " + id + "\nName : " + name + "\nCity : " + city + "\nSalary : " + salary + "\n\n==============\n\n";
    }
    
    
    
    
    

}
