package edu.gcu.cst135.salon;

import java.util.ArrayList;

// Abstract parent of HairTrim and BeardTrim and Child of Grooming
public abstract class Grooming extends Service {    	

	// Class level Attributes go here
	// e.g. private int number;
	// TODO: NEED TO DETERMINE ACCESS LEVEL
	// TODO: NEED TO DETERMINE CONSTRUCTOR REQUIREMENTS
	// TODO: NEED TO DETERMINE GETTERS/SETTERS
	private ArrayList<Style> styles = new ArrayList<>();
	private  Equipment equipment;
	private double length;
	private ArrayList<Product> products = new ArrayList<>();
	
	
	// Constructor Grooming, this is the same one that is 
	// created automatically within Java - no parameters.
	public Grooming(double price, double length) {
		super(price);  // Makes an object parent class - Grooming
		this.length = length;
	}
	
	// Appropriate GETTER/SETTER for private attributes
	// SETTERS can implement data logic and rules
	// SETTERS can also be omitted to establish a final public attribute
	public double getLength() {
		return this.length;
	}
	
	// Data object override methods: toString(), hashCode(), equals(), compareTo()
	// TODO: OVERRIDE public String toString(){ }
	// TODO: OVERRIDE public boolean hashCode() { }
	// TODO: OVERRIDE public boolean equals(Object o) { }
	// TODO: OVERRIDE public int compareTo(Object o) { }
}
