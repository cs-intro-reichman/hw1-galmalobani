// Generates three integer random numbers in a given range,
// and prints them in increasing order.

public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int random1 = (int)(Math.random() * (lim+1));//מוסיפים 1 כדי להיות בטווח
		int random2 = (int)(Math.random() * (lim+1));
		int random3 = (int)(Math.random() * (lim+1));
		int max12 = Math.max(random1, random2);
		int max23 = Math.max(random2, random3);
		int topMax = Math.max(max12, max23);
		int min12 = Math.min(random1, random2);
		int min23 = Math.min(random2, random3);
		int topMin = Math.min(min12, min23);
		int sum = random1 +random2 +random3;
		int mid = sum - topMax -topMin;
		System.out.println("Min " + topMin + " mid: " + mid  + " max:" + topMax);
		

	}
}
