package com.codingdojo.fruityloops.models;

public class fruityModel {
	
    // MEMBER VARIABLES
    private String name;
    private double price;
    
    // CONSTRUCTOR
    public fruityModel(String name, double price) {
        this.name = name;
        this.price = price;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    
    


}
