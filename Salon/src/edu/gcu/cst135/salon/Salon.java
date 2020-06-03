package edu.gcu.cst135.salon;

import java.util.ArrayList;
import java.util.Scanner;

// Starting class where we will tie Customer objects to
// Grooming (BeardTrim and HairTrim) objects
public class Salon {

	Scanner sc = new Scanner(System.in);

	// Class level Attributes go here
	// e.g. private int number;
	private String name;
	private ArrayList<Service> services = new ArrayList<>();
	// TODO: NEED TO DETERMINE CONSTRUCTOR REQUIREMENTS
	// TODO: NEED TO DETERMINE GETTERS/SETTERS

	public Salon() {

		// Add a menu of services and costs to the Salon
		services.add(new BeardTrim(9.98, .25));
		services.add(new BeardTrim(12.98, 12.0));	
		services.add(new Haircut(4.98, 2.0));	
		services.add(new BeardTrim(9.99, .25));
		services.add(new BeardTrim(10.99, 0.0));
		services.add(new BeardTrim(11.99,4.5));
		services.add(new BeardTrim(12.99, 12.0));
		services.add(new BeardTrim(13.99, .05));
		services.add(new Haircut(4.99, 2.0));
	}

	public static void main(String[] args) {

		// Create an object of Salon that customers can interact with
		Salon salon = new Salon();

		do {
			int option = salon.displayMainMenu();
			switch (option) {
			case 0:			
				System.out.println("THANK YOU!");
				System.exit(0);
				break;
			case 1:
				System.out.println("ADD SERVICE");
				break;
			case 2:
				int opt1 = salon.displayService();
				switch (opt1){
				case -1:
					System.out.println("THANK YOU!");
					System.exit(0);
					break;
				case -2:
					System.out.println("Bad user Input!");
					break;
				default:
					System.out.println("CUSTOMER PICKED " + salon.services.get(opt1 - 1));
				}
				break;
			case 3:
				System.out.println("SHOW BEARD SERVICES");
				break;
			case 4:
				System.out.println("SHOW HAIR SERVICES");	
				break;
			}
			
		} while (true);

	}

	private int displayMainMenu() {
		System.out.println("SALON SERVICE LIST");
		System.out.println("=====================");
		System.out.println("0 ] Exit List");
		System.out.println("1 ] Add a Service");
		System.out.println("2 ] List all Services");
		System.out.println("3 ] List Beard Services");
		System.out.println("4 ] List Hair Services");		
		System.out.println("=====================");
		System.out.println("What itemwould you like to do? ");
		try {
			int serviceID = Integer.parseInt(sc.nextLine());
			return serviceID;
		} catch(NumberFormatException e) {
			return -2;
			// LOG THE ERROR (java logger) - e.printStackTrace();
		}
	}

	private int displayService() {
		System.out.println("SALON SERVICE LIST");
		System.out.println("=====================");
		for(Service svc : services) {
			System.out.println(svc);
		}
		System.out.println("What service id would you like? (0 to exit)");
		try {
			int serviceID = Integer.parseInt(sc.nextLine());
			if (serviceID == 0)
				return -1;
			if (serviceID <= services.size())
				return serviceID;
			else {
				throw new NumberFormatException();
			}
		} catch(NumberFormatException e) {
			return -2;
			// LOG THE ERROR (java logger) - e.printStackTrace();
		}
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
