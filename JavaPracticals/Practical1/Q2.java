package practicalX1_17205702;
//By Elena Lanigan 29/01/18

import java.util.Scanner;

//Program to commute gratuity rate

public class Q2 {
	private static Scanner input;

	//main method
	public static void main(String[] args ) {
		input = new Scanner(System.in);
		// Prompt the user for the subtoal
		System.out.println("Enter the subtotal: ");
		double subtotal = input.nextDouble();
		// Prompt the user for the Gratuity Rate
		System.out.println("Enter the gratuity rate: ");
		double gratRate = input.nextDouble();
		double calculateGrat = subtotal * gratRate / 100;
		double total = subtotal + calculateGrat;
		System.out.println("The Gratuity is €: " +  calculateGrat  + " and total is : €" + total);

	}

}
