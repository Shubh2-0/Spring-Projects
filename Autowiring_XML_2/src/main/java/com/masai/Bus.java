package com.masai;

public class Bus {
    
    private String id;
    private String name;
    private String type;
    
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
	return "\nBus Id : " + id + "\nName : " + name + "\nType : " + type + "\n\n========================\n\n";
    }
    
    

}
