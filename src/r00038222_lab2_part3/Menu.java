package r00038222_lab2_part3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu{
	static int selection;
	static ArrayListOptions run = new ArrayListOptions();// creates a new instance of the ArrayListOptions class called run.
	private static Scanner scan;
	
	public static void firstMenu() {//Main Menu		
		System.out.println("Welcome to TestCarPartB.\nPlease select:");
		System.out.println("1     Add a Car(begin list).");
		System.out.println("0     Exit");
		selection = Input.userInput();
		switch (selection) {
		case 1 : System.out.println("Begin by adding the first car.");run.addCar();break;
		case 0 : System.out.println("Goodbye");
				 System.exit(0);
		}				
	}
	
	public static Boolean moreData() {//Asks how you wish to continue.
		Boolean more = true;
		System.out.println("How would you like to continue?");
		System.out.println("1     Add another car.");
		System.out.println("2     Remove a car.");
		System.out.println("3     View List of cars");
		System.out.println("0     No! Exit data entry");
		selection = Input.userInput();
		switch (selection) {
		case 1 : more = true; break;
		case 2 : System.out.println("Lets remove a car/cars");remove();break;
		case 3 : System.out.println("These are the cars you have entered");run.viewList();break;
		case 0 : System.out.println("Goodbye");more = false;System.exit(0);
		
				 
		}
		return more;		 
		
	}
	public static void remove() {// menu for removing cars.
		System.out.println("To remove a car you must know the reference number, which appears before the car");
		System.out.println("description in the list.");
		System.out.println("1	You know the reference number");
		System.out.println("2 	You need to see the list");
		selection = Input.userInput();// gets a value for selection from the Input class
		switch (selection) {
		case 1 : run.removeCar();break;// runs the removeCar method in the run object
		case 2 : run.viewList();run.removeCar();break;// Shows the list of cars before running removeCar
		default : System.out.println("Invalid Input\n\n\n\n\n");Menu.remove();;break;
		}
	}
	
}
