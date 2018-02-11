package practical2_17205702;

/*
Author: Elena Lanigan
Date: 05/02/18

Write a program that prompts the user to enter values for a, b, and c and displays the result based on
the discriminant. If the discriminant is positive, display two roots. If the discriminant is zero, display
one root. Otherwise, display “The equation has no real roots”. Note – the value of a must be non-zero
and your program should first test this condition and exit with an appropriate message if it is not true.*/

import java.util.Scanner;

public class Q1 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		System.out.println("Enter a number for a: ");
		double A = input.nextDouble();


		System.out.println("Enter a number for b: ");
		double B = input.nextDouble();


		System.out.println("Enter a number for c: ");
		double C = input.nextDouble();

		double discriminant = Math.pow(B, 2) - 4 * A * C;
		System.out.print(discriminant);


		if (A == 0)
			System.out.print("A must be greater less than zero.");
		else if (discriminant > 0) {
			double r1 = (-B + Math.sqrt(Math.pow(discriminant, 2))) / 2 * A;
			double r2 = (-B - Math.sqrt(Math.pow(discriminant, 2))) / 2 * A;
			System.out.print("Your number is positive, here are two roots: " + r1 + " and " + r2);
			}
		else if (discriminant == 0) {
			double r1 = (-B + Math.sqrt(Math.pow(discriminant, 2))) / 2 * A;
			System.out.print("Your number is zero, here is one root: " + r1);
			}	
		else
			System.out.print("Your number has no real roots.");
			

	}
}
