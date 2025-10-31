// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		double futureValue = currentValue * Math.pow(1 + rate , n);
		String result = "After " + n + " years $" + currentValue + " saved at " + rate + ".0% will yield $" + (int)futureValue;
		System.out.println(result);
	}
}