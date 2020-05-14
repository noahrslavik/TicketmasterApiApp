package day4basicjava;

public class DebuggingTest {

		public static void main(String[] args) {

			// declared and initialized
			int y = 5;

			// when method is called
			// parameter variable(s) are declared
			increment(y);
			globalize("Machine");

			System.out.println("In main " + y);

		}

		private static void increment(int x) {

			System.out.println("In increment (before) " + x);

			x++;

			System.out.println("In increment (after) " + x);

		}
		private static void globalize(String a) {
			System.out.println();
			System.out.println("Before: " + a);
			System.out.println("After: " + a + "world");
		}

	}

