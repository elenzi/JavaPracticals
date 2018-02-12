package practical3_17205702;

import java.util.Scanner;

/* Program to read a string from the console. Ignoring case, display the number of vowels
and consonants in the text. */

public class Q1 {
	public static void main(String[] args) {
		// Read a line of text
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a line of text: ");
		String s1 = input.nextLine();
		int numVowels = 0;
		int numConsonants = 0;
		s1 = s1.toLowerCase();
		// Iterate over the characters in the string
		for (int i = 0; i < s1.length(); i++)
		{ 
			char ch = s1.charAt(i);
			//check if vowel
			if (ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u') 
			{
				++numVowels;

			}
			//check if consonant
			else if ((ch >= 'a' && ch <= 'z'))
			{ 
				++numConsonants;
			}

		}
		// Display result
		System.out.println("Number of vowels is: " + numVowels);
		System.out.println("Number of consenents is: " + numConsonants);
		input.close();

	}
}