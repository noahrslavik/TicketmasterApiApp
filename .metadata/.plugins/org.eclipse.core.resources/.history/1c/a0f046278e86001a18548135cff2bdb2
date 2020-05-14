package capstone;

import java.util.Scanner;

public class capstoneproject {
	
	private static Scanner kbd = new Scanner(System.in);
	Boolean isSpecial;
	public static void main(String[] args) {
		do {
			System.out.print("Enter a phrase to translate to Pig Latin: ");
	        String userInput = kbd.nextLine();
	        
	        String[] splitWord = userInput.split(" "); 
	        String outputString = "";

	        for (int i = 0; i < splitWord.length; i++) {
	            String pigLatinWord = translateWord(splitWord[i]); 
	            outputString += pigLatinWord + " "; 
	        }

	        System.out.println("You entererd: " + userInput);
	        System.out.println("Translated : " + outputString + "\n");

	    }while(doesUserWantToContinue());
		System.out.println("GOODBYE.");
	}

	    public static String translateWord(String wordToTranslate) {
	        
	    	
	    	
	    	String lowerCaseWord = wordToTranslate.toLowerCase();
	        int pos = 0; 

	        for (int i = 0; i < lowerCaseWord.length(); i++) {
	           char ch = lowerCaseWord.charAt(i);
	            if (isVowel(ch)) {
	                pos = i;
	                break;
	            }
	        }

	        if (pos == 0) {
	            return lowerCaseWord + "yay"; 
	        } else {
	            String start = lowerCaseWord.substring(pos); 
	            String end = lowerCaseWord.substring(0, pos); 
	            return start + end + "ay"; 
	        }
	    }

	    public static Boolean isVowel(char ch) {
	        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	            return true;
	        }
	        else {
	        return false;
	    }
	    }
	    
	    public static Boolean isSpecial(char input_char) 
	    { 
	        if ((input_char >= 65 && input_char <= 90) || (input_char >= 97 && input_char <= 122)) 
	            return false; 
	  
	        else if (input_char >= 48 && input_char <= 57) 
	            return true; 
	  
	        else
	            return true; 
	    } 
	    
	    private static boolean doesUserWantToContinue() {
	    	System.out.print("Continue? (y/n): ");
	    	return kbd.nextLine().startsWith("y");
	    } 
	    
	    
	}
