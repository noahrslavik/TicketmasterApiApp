package gclabs;
import java.util.Scanner;
public class LabTwo {
	public static void main (String [] args) {
		String answer = "y";
		
		Scanner kbd = new Scanner (System.in);
		
		while(answer.charAt(0) == 'y') {
			
		System.out.println("Enter width: ");
		double width = kbd.nextDouble();
		System.out.println("Enter length: ");
		double length = kbd.nextDouble();
		System.out.println("Enter height: ");
		double height = kbd.nextDouble();

		double area = width * length;
		double perimeter = (width * 2) + (length * 2);
		double volume = length * width * height;
		System.out.println("Area: " + area );
		System.out.println("Perimeter: " + perimeter );
		System.out.println("Volume: " + volume );
		
		System.out.println("Continue? y/n ");
		 answer = kbd.next();
		
	}

}
}