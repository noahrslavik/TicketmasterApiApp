package day3basicjava;

import java.util.Scanner;

public class HeatingNCoolin {
	public static void main(String[]args) {
		
	Scanner kbd = new Scanner(System.in);
	
	System.out.println("Enter the temp, then the desired temp: ");
	
	double actualTemp = kbd.nextDouble();
	double desiredTemp = kbd.nextDouble();
	
	if(actualTemp > desiredTemp) {	
		System.out.println("Run A/C");
	}
	else if (actualTemp < desiredTemp){
	System.out.println("Run heat");
	}	
	else {
		System.out.println("Stand by");
	}
			
	}

}
