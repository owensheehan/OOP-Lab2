package r00038222_lab2_part3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
	private static Scanner scan;
	static int input;
	public static int userInput() {// gets and validates any ints input by the user
		scan = new Scanner(System.in);// creates a new instance of the scanner class
		boolean test = false;
		while (test == false) {
			try {
				input = scan.nextInt();
				test = true;
			}
			catch (InputMismatchException e) {// Catches input mismatch exceptions, and gives the user another go
				System.out.println("Error! Please use only numbers for your selection! Try again.");
				nextInput();
				continue;
			}
			}
		return input;
	}
	public static void nextInput() {
		scan.next();
	}
}
