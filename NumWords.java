// Prints a given number using a hundreds, tens, and units notation.

public class NumWords {
	public static void main(String args[]) {
		int number = Integer.parseInt(args[0]);
		int hundreds = number /100;
		int tens = (number % 100) / 10;
		int ones = number % 10;
		String result = "NumWords: " + number + " hundreds: " + hundreds + " tens: " +tens + " ones" + ones ;
		System.out.println(result);

	}
}
