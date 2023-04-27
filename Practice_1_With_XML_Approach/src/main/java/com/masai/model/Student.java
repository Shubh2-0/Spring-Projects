package com.masai.model;

public class Student {
    
    private int id;
    private String name;
    private String address;
    
   public Student() {
    // TODO Auto-generated constructor stub
}

    public Student(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getAddress() {
        return address;
    }



    public void setAddress(String address) {
//	System.out.println("setting student address");
        this.address = address;
    }



    @Override
    public String toString() {
	return "Id : " + id + "\nName : " + name + "\nAddress : " + address + "\n===========\n";
    }
    
    
    
    

}
