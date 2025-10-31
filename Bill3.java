// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {		
	 String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		double bill = Double.parseDouble(args[3]);
		bill = bill / 3;
		bill = Math.ceil(bill);
		String result = "Dear:" + name3 + ", " + name2 + ", and " + name1 + ": pay" +  " " + bill + " Shekels each.";
		System.out.println(result);
	     
	}
}
