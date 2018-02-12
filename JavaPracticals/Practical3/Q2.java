package practical3_17205702;

import java.util.Scanner;

/* program to create a simple cypher. */


public class Q2 {
	public static void main(String[] args) {
		// Read a line of text
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a line of text: ");
		String s1 = input.nextLine();

		String s2= "";
		// Iterate over the characters in the string
		for (int i = 0; i < s1.length(); i++)
		{ 
			char ch = s1.charAt(i);
			//if char = z change to a insert into new s2
			if (ch == 'z')
			{ 
				ch ='a';
				s2 += ch;
	
			}
			//else if char is lower case, increment by 1 and use new value, insert into s2
			else if (Character.isLowerCase(ch)) {
				ch++;
				s2 += ch;
			}
			// else if
			else if (Character.isUpperCase(ch) || ch == ' ' || ch == '!') 
			{
				s2 += ch;
			}
		
		}
		// Display result
		System.out.println("Your new string is: " + s2);
		input.close();

}
}