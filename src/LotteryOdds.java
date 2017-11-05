import java.math.BigInteger;

public class LotteryOdds {

	public static void main(String[] args) {

		BigInteger r;
		int w = 69; // 69
		int s = 5 ; // 5
		int pb = 26;
	    r = factorial(w).divide (factorial(s).multiply (factorial(w-s)));  // Superduper magic equation!!
	    r = r.multiply(pb);
	    
	    System.out.println("The odds of winning the PowerBall are 1:" + r);
	    System.out.println("The PowerBall website says that it's 1:292201338");
	    
    }

	private static BigInteger factorial(int w) {
	    int i = 1;
	    int f = 1;
	 
	    for (int c = 1; c <= w; c++) {
	      f = f * i++;
	    }

		return f;
	}
}