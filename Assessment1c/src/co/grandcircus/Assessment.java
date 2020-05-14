package co.grandcircus;

import java.util.Scanner;

public class Assessment {
	
	private static Scanner kbd = new Scanner(System.in);
	
	public static void main(String[]args) {
		
	
	System.out.println("Enter the current day of class (1 - 50): ");
	int userInput = kbd.nextInt();
	while(userInput >= 1 && userInput<=50) {
	
	if(userInput <= 37 ) {
		
		if(userInput <= 6) {
			System.out.println("The next test topic is Continents");
			if(userInput == 6) {
				System.out.println("It is today.");	
			}
			else {
				System.out.println("It is " + Math.abs(6 - userInput) + " days away.");
			}
		}
		else if(userInput > 6 && userInput < 20) {
			System.out.println("The next topic is Oceans");
			if(userInput == 20) {
				System.out.println("It is today.");
			}
			else {
				System.out.println("It is " + Math.abs(20 - userInput) + " days away.");
			}
		}
		else {
			System.out.println("The next topic is The Solar System");
			if(userInput == 37) {
				System.out.println("It is today.");
			}
			else {
				System.out.println("It is " + Math.abs(37 - userInput) + " days away.");
			}
		}
	}	
	else {
		System.out.println("There are no more tests.");
	}
	
	System.out.println(dayOfWeek(userInput));
	
	System.out.println("\nEnter the current day of class (1 - 50): ");
	userInput = kbd.nextInt();
	}
	System.out.println("Thank you. Goodbye");
	}

	
	public static String dayOfWeek(int input) {
		String result = null;
		if     ((input + 4) % 5 == 0){
			result = "Today is Monday.";
			return result;
		}
		else if((input + 3) % 5 == 0) {
			result = "Today is Tuesday.";
			return result;
		}
		else if((input + 2) % 5 == 0) {
			result = "Today is Wednesday.";
			return result;
		}
		else if((input + 1) % 5 == 0){
			result = "Today is Thursday.";
			return result;
		}
		else if(input % 5 == 0) {
			result = "Today is Friday.";
			return result;
		}
		return result;	
			
		}	
	}

