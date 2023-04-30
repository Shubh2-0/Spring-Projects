package com.masai;




public class Address {
    
    private int addressId;
    private String state;
    private String city;
    private String country;
    
    
    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }
    
    
    public void setState(String state) {
        this.state = state;
    }
    
    
    public void setCity(String city) {
        this.city = city;
    }
    
    
    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public String toString() {
	return "\n*******Address*******\nAddress Id : " + addressId + "\nState : " + state + "\nCity : " + city + "\nCountry : " + country + "\n*********";
    }
    
    
    
    

}
