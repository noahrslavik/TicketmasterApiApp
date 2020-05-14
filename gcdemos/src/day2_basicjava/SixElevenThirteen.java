package day2_basicjava;

import java.util.Scanner;

public class SixElevenThirteen {

	public static void main (String [] args) {
		Scanner kbd = new Scanner(System.in);
		String response;
		boolean isTrue = true;
		
		//6
		do {
			
			System.out.println("Hello World");
			
			System.out.println("Would you like to continue(y/n)");
			response = kbd.next();
			isTrue = response.equalsIgnoreCase("y");
		}
		while(isTrue);
			System.out.println("Goodbye for now.");
		
		//11
		do {	
			for (int i = 0; i < 10; i++)
				System.out.print(i + " ");
		
			System.out.println();
			System.out.println("Would you like to continue(y/n)");
			response = kbd.next();
			isTrue = response.equalsIgnoreCase("y");
			
		}
		while(isTrue);
			System.out.println("Goodbye for now.");
		
		
		//13	
		
					
			
		do {	
				
			System.out.println("Enter a number: ");
				int userInt = kbd.nextInt();
				
				
				for (int i = userInt; i >= 0; i--)
					System.out.print(i + " ");
			
				System.out.println();
				System.out.println("Would you like to continue(y/n)");
				response = kbd.next();
				isTrue = response.equalsIgnoreCase("y");
				
			}
			while(isTrue);
				
		
			System.out.println("Goodbye for now.");
			
				
		
			
			
			
			
			
			
			
			
		
	}
	
	
}
