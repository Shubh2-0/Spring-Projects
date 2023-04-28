package com.masai;

public class Passenger {
    
    
    private int id;
    private String name;
    private int age;
    private Bus bus;
    
   public Passenger() {
  
   }



    







    public void setId(int id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public void setBus(Bus bus) {
        this.bus = bus;
    }


    @Override
    public String toString() {
	return "Passenger Id : " + id + "\nName : " + name + "\nAge : " + age + "\n*********BUS INFORMATION*********\n" + bus;
    }
    
    

}
