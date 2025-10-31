// Prints a given number using a hundreds, tens, and units notation.

import java.util.Random;

public class NumWords {
	public static void main(String args[]) {
		Random rand = new Random();
		int min = 100;
		int max = 999;
	    int x = rand.nextInt(max-min +1)+min;
	}
}
