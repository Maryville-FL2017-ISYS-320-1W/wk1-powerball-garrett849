import java.math.BigInteger;
import java.util.Scanner;

public class LotteryOdds {

	public static void main(String[] args) {

		BigInteger r;
		BigInteger w = new BigInteger("69"); // 69
		BigInteger s = new BigInteger("5"); // 5
		BigInteger pb = new BigInteger("26");
	    r = (BigInteger(w)divide (BigInteger(s)multiply(BigInteger(w.subtract(s))));  // Superduper magic equation!!
	    r = r.multiply(addBigInteger(pb));
	   
    System.out.println("The odds of winning the PowerBall are 1:" + r);
	    System.out.println("The PowerBall website says that it's 1:292201338");
	    
    }

	private static int addBigInteger(BigInteger w) {
	    int i = 1;
	    int f = 1;
	  
	    for (int c = 1; c <= w; c++) {
	      f = f * i++;
	    }

		return f;
	
}
}