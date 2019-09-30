package r00038222_lab2_part3;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListOptions {
	ArrayList<Car> cars = new ArrayList<Car>();// creates new array object to store the car data
	
	public ArrayListOptions() {
		// TODO Auto-generated constructor stub
	}
	public void addCar() {
		Boolean more = true;
		while (more == true){// A loop to enter multiple cars.
			Car car = new Car();
			car.carMake();
			car.carModel();
			car.setAge();
			cars.add(car);
			more = Menu.moreData();
		}
	}
	public void removeCar() {
		System.out.println("Please enter the cars reference number:");
		int ref = Input.userInput();// gets the reference of the car to be removed
		if (ref <= cars.size() && ref > 0) {// ensures the ref number is not out of bounds
			cars.remove(ref-1);
			viewList();
		}else {
			System.out.println("That number does not correspond to a car\n\n\n\n\n");
			Menu.moreData();
		}
			
	}
	public void viewList() {

		int i;
		int size = cars.size()-1;
		for(i = 0;i <= size;i++) { // Prints the contents of the arraylist

			Car b =cars.get(i);
			b.print(i+1);
			
		}
		Menu.moreData();
	}
}