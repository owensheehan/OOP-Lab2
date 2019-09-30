package r00038222_lab2_part3;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Car {
	Scanner scan = new Scanner(System.in);
	private String make;
	private String model;
	private String condition;
	private int age;
	private String data;
	int ref;
	
	public String carMake() {
		System.out.println("Enter the make of the car:");
		this.make = scan.next();
		return make;
	}
	public String carModel() {
		System.out.println("Enter the model of the car:");
		this.model = scan.next();	
		return model;
	}
	public void setAge() {
		boolean test = false;
		while (test == false) {
			try {
				System.out.println("Enter the age of the car:");
				this.age = Input.userInput();
				condition();
				test = true;
			}
			catch (InputMismatchException e){// catches wrong input types.
				System.out.println("Error! Please use only numbers for the age of the car!");
				Input.nextInput();
				continue;
			}
		}
	}
	public void condition(){
		switch (this.age) { // creates a string for the age and condition of the car.
		case 0 : this.condition = " is less than 1 year of age and is Shiny New";break;
		case 1 : this.condition = " is 1 year old and is Shiny New";break;
		case 2 : case 3 : this.condition ="is "+age+" years old and is Shiny New";break;
		case 4 : case 5 : this.condition ="is "+age+" years old and is Slightly worn";break;
		case 6 : case 7 : this.condition ="is "+age+" years old and is Past its best";break;
		case 8 : case 9 : this.condition ="is "+age+" years old and is Showing signs of age";break;
		case 10 : default : this.condition ="is "+age+" years old and is a Banger";break;
		}
	}
	public void description() {//builds the description of the car
		this.data = ref+" "+make+" "+model+" "+condition;
	}
	public void print(int ref) {
		this.ref = ref;
		this.description();
		System.out.println(data);
	}
}
