// Prints the numbers 0 to 5.
// (Same program as shown in lecture 1-1).
public class PrintTo5 {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int random1 = (int)(Math.random() * (lim)); 
		int random2 = (int)(Math.random() * (lim));
		int random3 = (int)(Math.random() * (lim));

		int max = Math.max(random1, random2);
		max = Math.max(max, random3);
		int min = Math.min(random1, random2);
		min = Math.min(min, random3);
		int mid = (random1 + random2 + random3) - (max + min);
		System.out.println(max + " , " + mid + " , " + min);
    }
 }