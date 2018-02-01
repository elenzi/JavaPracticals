package practicalX1_17205702;

//Program to read the radius and length of a 
//cylinder and computes the area and volume.
//By Elena Lanigan 29/01/18

public class Q1 {
//main method
	public static void main(String[] args ) {
		double radius;
		double area;
		double length;
		double volume;

		//assign radius
		radius = 20;
		//assign length
		length = 3;
		//compute area
		area = radius * radius * Math.PI; 
		//compute volume
		volume = area * length;
		//Display area of cylinder
		System.out.println("The area of the cylinder is " + area);
		//Display volume of cylinder
		System.out.println("The volume of the cylinder is " + volume);
				
	}
}
