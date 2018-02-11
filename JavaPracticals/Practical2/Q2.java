package practical2_17205702;

/*
Author: Elena Lanigan
Date: 05/02/18

Write a program that reads the lengths of the three sides of a triangle and computes the perimeter
if the input is valid. Otherwise, display that the input is invalid. The input is valid if the sum of
every pair of the lengths of two sides is greater than the length of the remaining side.*/

import java.util.Scanner;

public class Q2 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		System.out.println("Enter three lengths of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)) {
			double perimeter = side1 + side2 + side3;
			System.out.println("The perimeter is: " + perimeter);
		}
		else
			System.out.println("Invalid input");

	}
}