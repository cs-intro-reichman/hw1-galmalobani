// Generates three integer random numbers in a given range,
// and prints them in increasing order.

public class Ascend {
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
