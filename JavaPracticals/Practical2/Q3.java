package practical2_17205702;

/*
Author: Elena Lanigan
Date: 05/02/18

*Write a program that prompts the user to enter an integer between 0 and 15, inclusive. Check if
the input is valid and if so, display its corresponding hex number.*/

import java.util.Scanner;

public class Q3 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		System.out.println("Please enter a number between 1 and 15: " );
		int number = input.nextInt();
		
		if (number >= 0 && number <= 9)
			System.out.print("Your number in hex is: " + number + ".");
		else if (number >= 9 && number <= 15) {
			String hex = Integer.toHexString(number);
			System.out.print("Your number in hex is: " + hex + ".");
		}
		else
			System.out.print("Your input is invalid. Goodbye.");

	}
	
}