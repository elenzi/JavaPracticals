package practicalX1_17205702;

//program that reads an integer between 0 and 999
//and prints the sum of the digits
//By Elena Lanigan 29/01/18

import java.util.Scanner;

public class Q3 {
	private static Scanner input;
	public static void main(String[] args ) {
		input = new Scanner(System.in);
		// Prompt the user for a number
		System.out.println("Enter a number: ");
		int number1 = input.nextInt();	
		int under10 = number1 % 10;
		number1 /= 10;
		int tens = number1 % 10;
		number1 /=10;
		int hundreds = number1 % 10;
		number1 /=10;
		int total = under10 + tens + hundreds;
		System.out.println("The total of your digits is: " + total);
		
	}

}
