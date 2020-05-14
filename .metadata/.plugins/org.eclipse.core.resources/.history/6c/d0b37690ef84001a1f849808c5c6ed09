package stringmethods;

public class methods {
	public static String capatalize(String word) {
		String ans = "";
		for(int i = 0; i<word.length(); i++) {
		if (i == 0) {
			char firstLetter = Character.toUpperCase(word.charAt(0));
			ans = Character.toString(firstLetter);
		}
		else {
			char nextLetter = Character.toLowerCase(word.charAt(i));
			ans += Character.toString(nextLetter);
		}	
	}
	return ans;
	}
	
	public static int wheresWaldo(String phrase) {
		phrase = phrase.toLowerCase();
		String waldo = "waldo";
		int position = phrase.indexOf(waldo);
		return position;		
	}
	public static String firstThingsFirst(String a,String b) {
		String firstA = Character.toString(a.charAt(0));
		String firstB = Character.toString(b.charAt(0));
		String answer = "";
		if(firstA.compareTo(firstB) > 0) {
			answer = (b + " " + a);
		
		}
		else if(firstA.compareTo(firstB) < 0) {
			answer = (a + " " + b);	
		}
		return answer;
	}
	public static String reverse(String s) {
		String answer = "";
		for(int i = s.length()-1; i >=0; i--) {
			answer += (s.charAt(i));
		}
		return answer;
	}
	public static void soLong(String a, String b) {
		if(a.length() > b.length()) {
			System.out.println(a);
		
		}
		else if(b.length() > a.length()) {
			System.out.println(b);	
		}
		else {
			System.out.println(a + " " + b);
		}
	}
	public static String afterMath(String entry) {
		String ans = "";
		if(entry.toLowerCase().contains("math")){
			int index = entry.indexOf("math");
			for(int i = index; i < entry.length(); i++) {
				ans += (entry.charAt(i));
			}
		}
		else {
		ans = entry;		
		}
		return ans;	
		}
	
	public static void letterize(String word) {
		for(int i = 0; i<word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		
	}
	
}
