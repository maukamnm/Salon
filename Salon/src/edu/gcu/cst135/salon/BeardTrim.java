package edu.gcu.cst135.salon;

//Concrete class in the Grooming/Haircut family
//The extends keyword makes this a child of Haircut
public class BeardTrim extends Grooming {

	// Class level Attributes go here
	// e.g. private int number;
	// TODO: NEED TO DETERMINE ACCESS LEVEL
	// TODO: NEED TO DETERMINE CONSTRUCTOR REQUIREMENTS
	// TODO: NEED TO DETERMINE GETTERS/SETTERS
	private boolean useCream;
	private boolean useAftershave;
	
	
	// This is the default constructor that Java creates
	// Once the programmer makes their own Constructor,
	// the default one is no longer available 
	// unless the programmer makes their own like the one below
	public BeardTrim(double price, double length) {
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
		return "Service id = " + getServiceId() + " Price = $" + getPrice();
	}
}
