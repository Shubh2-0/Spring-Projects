package com.masai;

public class Employee {

    private Address empAddress;

    public Address getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(Address empAddress) {
        this.empAddress = empAddress;
    }

    @Override
    public String toString() {
	return "Employee [empAddress=" + empAddress + "]";
    }



    
    
    
    
}
