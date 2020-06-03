package edu.gcu.cst135.salon;

// Concrete class in the Grooming/Haircut family
// The extends keyword makes this a child of Haircut
public class Haircut extends Grooming {

	// Class level Attributes go here
	// e.g. private int number;
	// TODO: NEED TO DETERMINE ACCESS LEVEL
	// TODO: NEED TO DETERMINE CONSTRUCTOR REQUIREMENTS
	// TODO: NEED TO DETERMINE GETTERS/SETTERS	
	
	// This is the default constructor that Java creates
	// Once the programmer makes their own Constructor,
	// the default one is no longer available 
	// unless the programmer makes their own like the one below
	public Haircut(double price, double length) {
		super(price, length);  // Makes an object parent class - Haircut
	}
	
	// Appropriate GETTER/SETTER for private attributes
	// SETTERS can implement data logic and rules
	// SETTERS can also be omitted to establish a final public attribute
	
	
	// Data object override methods: toString(), hashCode(), equals(), compareTo()
	// TODO: OVERRIDE public String toString(){ }
	// TODO: OVERRIDE public boolean hashCode() { }
	// TODO: OVERRIDE public boolean equals(Object o) { }
	// TODO: OVERRIDE public int compareTo(Object o) { }	
	
	public String toString() {
		return "Haircut \tid = " + getServiceId() + " Price = $" + getPrice() + " Length = " + getLength();
	}
}
