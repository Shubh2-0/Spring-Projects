package com.masai.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

    
    private String name;
    private List<String> phones;
    private Set<String> addresses;
    private Map<String, String> courses;
    private Properties userInfo;
    
    
    public Employee() {
	// TODO Auto-generated constructor stub
    }


    public Employee(String name, List<String> phones, Set<String> addresses, Map<String, String> courses) {
	super();
	this.name = name;
	this.phones = phones;
	this.addresses = addresses;
	this.courses = courses;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public List<String> getPhones() {
        return phones;
    }


    public void setPhones(List<String> phones) {
        this.phones = phones;
    }


    public Set<String> getAddresses() {
        return addresses;
    }


    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }


    public Map<String, String> getCourses() {
        return courses;
    }


    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }
    
    


    public Properties getUserInfo() {
        return userInfo;
    }


    public void setUserInfo(Properties userInfo) {
        this.userInfo = userInfo;
    }


    @Override
    public String toString() {
	return "Employee Name : " + name + "\nPhones : " + phones + ",\nAddresses : " + addresses + "\nCourses : " + courses
		+"\nUser Info : " + userInfo + "\n========\n";
    }



    
    
    
}
