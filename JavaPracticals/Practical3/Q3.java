package practical3_17205702;

import java.util.Scanner;

/* program  that prompts the user to enter two strings and displays the largest common
prefix of the two strings */


	public class Q3 {
		public static void main(String[] args) {
			// Read a line of text
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a line of text: ");
			String s1 = input.nextLine();
			// Read a second line of text
			System.out.print("Enter a second line of text: ");
			String s2 = input.nextLine();

			
			String s3 = "";
			for (int i = 0; i < s1.length() && i < s2.length(); i++) {
				char ch = s1.charAt(i);
				if (s1.charAt(i) == s2.charAt(i))
					s3 += ch ;
				else
					break;
			}
			
		// Display result
		if (s3.length() > 0)
		{
			System.out.println("Prefix of your two strings is: " + s3);
		}
		else
		{
			System.out.println(s1 + " and " + s2 + " have no common prefix.");
		}
		input.close();
		
	}
}
