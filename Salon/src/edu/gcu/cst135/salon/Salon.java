package edu.gcu.cst135.salon;

import java.util.ArrayList;

// Starting class where we will tie Customer objects to
// Grooming (BeardTrim and HairTrim) objects
public class Salon {
	
	// Class level Attributes go here
	// e.g. private int number;
	private String name;
	private ArrayList<Service> services = new ArrayList<>();
	// TODO: NEED TO DETERMINE CONSTRUCTOR REQUIREMENTS
	// TODO: NEED TO DETERMINE GETTERS/SETTERS
	
	public Salon() {
		
		// Add a menu of services and costs to the Salon
		services.add(new BeardTrim(9.99, .25));
		services.add(new BeardTrim(12.99, 12.0));	
		services.add(new Haircut(4.99, 2.0));	
	}

	public static void main(String[] args) {
		
		// Create an object of Salon that customers can interact with
		Salon salon = new Salon();
		
		Service service1 = new BeardTrim(9.99, .25);
		System.out.println(service1);
		Service service2 = new BeardTrim(10.99, 0.0);
		System.out.println(service2);
		Service service3 = new BeardTrim(11.99,4.5);
		System.out.println(service3);
		Service service4 = new BeardTrim(12.99, 12.0);
		System.out.println(service4);
		Service service5 = new BeardTrim(13.99, .05);
		System.out.println(service5);
		Service bob = new Haircut(4.99, 2.0);
		System.out.println(bob);		
	}

	// Appropriate GETTER/SETTER for private attributes
	// SETTERS can implement data logic and rules
	// SETTERS can also be omitted to establish a final public attribute
	
	
	// Data object override methods: toString(), hashCode(), equals(), compareTo()
	// TODO: OVERRIDE public String toString(){ }
	// TODO: OVERRIDE public boolean hashCode() { }
	// TODO: OVERRIDE public boolean equals(Object o) { }
	// TODO: OVERRIDE public int compareTo(Object o) { }	
}
