package com.masai.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
    
    private int rollNo;
    private String name;
    private String city;
    private int age;
    @Autowired
    @Qualifier("t1")
    private Teacher teacher;

    
    
    


    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }




    public void setName(String name) {
        this.name = name;
    }




    public void setCity(String city) {
        this.city = city;
    }




    public void setAge(int age) {
        this.age = age;
    }




    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }




    @Override
    public String toString() {
	return "Student Roll Number : " + rollNo + "\nName : " + name + "\nCity : " + city + "\nAge : " + age + "\n\n******Techer Details******\n"+teacher;
    }
    
    
    
    
    

}
