package com.masai.model;

public class Teacher {
    
    private String name;
    private Student st;
    public void setName(String name) {
        this.name = name;
    }
    public void setSt(Student st) {
        this.st = st;
    }
    @Override
    public String toString() {
	return "Teacher Name : " + name + "\nStudent Details\n" + st + "]";
    }
    
    
    

}
