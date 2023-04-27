package com.masai.model;

import java.util.List;

public class Teacher2 {
    
    private String name;
    
    private List<Student> students;

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
	return "Teacher Name : " + name + "\n\n=======Students Deatils=======\n\n" + students + "***********";
    }
    
    
    

}
