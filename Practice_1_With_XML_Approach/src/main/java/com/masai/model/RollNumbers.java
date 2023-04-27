package com.masai.model;

import java.util.List;
import java.util.Set;

public class RollNumbers {
    
    private List<Integer> rollNumbers;
    
    private Set<Integer> setOfNumbers;
    
    public RollNumbers() {
	// TODO Auto-generated constructor stub
    }
    
    

    public void setSetOfNumbers(Set<Integer> setOfNumbers) {
        this.setOfNumbers = setOfNumbers;
    }



    public void setRollNumbers(List<Integer> rollNumbers) {
        this.rollNumbers = rollNumbers;
    }



    @Override
    public String toString() {
	return "List of Roll Numbers : " + rollNumbers + "\n"
		+ "Set Of Numbers : " + setOfNumbers + "\n===\n";
    }

 
    
      
    

}
