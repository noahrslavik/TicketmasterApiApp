package day1_basicjava;
import java.util.Scanner;
public class GasMileageConverter {
	
	public static void main(String [] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter the gas mileage (mpg) and the number of gallons left in your tank, followed by the distance you would like to travel");
		
		int gasMileage = kbd.nextInt();
		int gallonsLeft = kbd.nextInt();
		int tripDistance = kbd.nextInt();
		
		
		int totalDistance = gasMileage * gallonsLeft;
		
		System.out.println(totalDistance);
		if(tripDistance < totalDistance) {
			
			System.out.println("OK");
		}
		else {
			
			System.out.println("Not enough gas");
		}
		
	}
	

}
