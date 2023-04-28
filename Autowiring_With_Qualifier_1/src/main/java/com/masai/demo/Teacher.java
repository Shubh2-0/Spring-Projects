package com.masai.demo;

public class Teacher {
    
    private int id;
    private String name;
    private String courseName;
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    @Override
    public String toString() {
	return "Teacher Id : " + id + "\nNme : " + name + "\nCourse Name : " + courseName + "\n=============\n";
    }
    
    
    
    
    
    
    

}
