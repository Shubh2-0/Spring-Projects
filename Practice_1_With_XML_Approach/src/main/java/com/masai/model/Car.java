package com.masai.model;

public class Car {
    
    
    private int idNumber;
    
    private String modelName;
    
    private String compnayName;
    
    private double price;
    
    private String yearOfLuanching;
    
    
    public Car() {
	// TODO Auto-generated constructor stub
    }


    public Car(int idNumber, String modelName, String compnayName, double price, String yearOfLuanching) {
	super();
	this.idNumber = idNumber;
	this.modelName = modelName;
	this.compnayName = compnayName;
	this.price = price;
	this.yearOfLuanching = yearOfLuanching;
    }


    public int getIdNumber() {
        return idNumber;
    }


    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }


    public String getModelName() {
        return modelName;
    }


    public void setModelName(String modelName) {
        this.modelName = modelName;
    }


    public String getCompnayName() {
        return compnayName;
    }


    public void setCompnayName(String compnayName) {
        this.compnayName = compnayName;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public String getYearOfLuanching() {
        return yearOfLuanching;
    }


    public void setYearOfLuanching(String yearOfLuanching) {
        this.yearOfLuanching = yearOfLuanching;
    }


    @Override
    public String toString() {
	return "Car Id Number : " + idNumber + "\nModel Name : " + modelName + "\nCompnay Name : " + compnayName + "\nPrice : "
		+ price + "\nYear Of Luanching : " + yearOfLuanching + "\n===============\n";
    }
    
    
    
    
    
    

}
