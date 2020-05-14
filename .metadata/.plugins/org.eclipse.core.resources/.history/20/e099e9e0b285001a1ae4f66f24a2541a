package labsix;

import java.util.Scanner;

public class diceRoller {
	private static Scanner kbd = new Scanner(System.in);
	
	public static void main(String[]args) {	
		do {
			int sideNumber = enterSide();
			int diceOne = rollDice(sideNumber);
			int diceTwo = rollDice(sideNumber);
			System.out.println("You rolled a(n) : " + diceOne + " and " + diceTwo + "\n" + isSpecial(diceOne,diceTwo));
		
		}while(doesUserWantToContinue());
		sayGoodbye();
	}

public static int enterSide() {
	System.out.println("Enter number of side of the dice:");
	int numSides = kbd.nextInt();	
	return numSides;
}

public static void sayGoodbye() {
	System.out.println("Goodbye, thanks for rolling");
}
	
public static int rollDice(int numSides) {
	
	int dice=(int)(Math.random()*numSides+1);
	return dice;
}

public static String isSpecial(int roll, int roll2) {
	if(roll == 1 && roll2 == 1 )
	{
		return("You rolled snake eyes");
	}
	else if (roll + roll2 == 7) {
		return("You rolled a 7, CRAP.....s!");
	}
	else if (roll == 6 && roll2 == 6) {
		return ("You rolled a boxcar!");
	}
	else {
	return ("You didn't roll anything special. Sorry");	
		
	}
}


private static boolean doesUserWantToContinue() {
	System.out.print("Continue? (y/n): ");
	return kbd.next().startsWith("y");
}

}
