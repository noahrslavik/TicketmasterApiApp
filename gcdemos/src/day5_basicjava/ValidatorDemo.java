package day5_basicjava;
import java.util.Scanner;

public class ValidatorDemo {
	
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		 do {
		String name = ValidatorHelper.getString(kbd, "Enter your name: ");
		//int age = ValidatorHelper.getIntAtOrAbove(kbd, "Enter your age: ", 0);
		double doubleAge = ValidatorHelper.getDouble(kbd, "Enter your age: ");
		
		for (int i = 1; i <= doubleAge; i++) {
			System.out.println(name + " turns " + i);
		}
		 }while(ValidatorHelper.getYesNo(kbd,"Do you want to continue(y/n): "));
		
		System.out.println("Thank you. Goodbye.");
		kbd.close();
	}

}