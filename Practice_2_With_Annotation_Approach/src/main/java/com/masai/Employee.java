package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Employee {

    private int EmpId;
    private String name;
    private int salary;
    @Autowired
    private Address add;
    
    public void setEmpId(int empId) {
        EmpId = empId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int i) {
        this.salary = i;
    }
    public void setAdd(Address add) {
        this.add = add;
    }
    @Override
    public String toString() {
	return "Employee Id : " + EmpId + "\nName : " + name + "\nSalary : " + salary + add;
    }
    
    
    
    
    
}
