package day2_basicjava;
import java.util.Scanner;
public class SwitchTest {
	public static void main(String [] args) {
	Scanner kbd = new Scanner(System.in);
	
	int grade = kbd.nextInt();
	
	if(grade > 90) {
		
		System.out.println("A");
	}
	else if(grade <= 90 && grade >=80) {
		
	System.out.println("B");	
	}
	else if(grade <= 79 && grade >=70) {
		
		System.out.println("C");	
		}
	else if(grade <= 69 && grade >=60) {
		
		System.out.println("D");	
		}
	else if(grade < 60) {
		
		System.out.println("E");	
		}
	else {
	System.out.println("Enter a valid great 0 -100");
	}
	kbd.close();
	}
}
