package com.masai;

public class EmployeeSetter {

    private int id;
    private String name;
    private String city;
    private int salary;
    
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
	return "\nEmployee ID : " + id + "\nName : " + name + "\nCity : " + city + "\nSalary : " + salary + "\n\n============\n\n";
    }
    
    
    
    
    
}
