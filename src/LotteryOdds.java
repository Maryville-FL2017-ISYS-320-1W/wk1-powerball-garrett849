import java.math.BigInteger;

public class LotteryOdds {

	public static void main(String[] args) {

		BigInteger answer;
		BigInteger poolofwhiteballs = new BigInteger("69"); // 69
		BigInteger pickedwhiteballs = new BigInteger("5"); // 5
		BigInteger powerballs = new BigInteger("26");
	    BigInteger answer = factorial(poolofwhiteballs.divide(factorial(pickedwhiteballs.mulitipy(factorial(poolofwhiteballs.subtract(pickedwhiteballs)));  // Superduper magic equation!!
	    BigInteger answer = answer.mulitipy(powerballs);
	  	System.out.println("The odds of winning the PowerBall are 1:" + answer)
	    System.out.println("The PowerBall website says that it's 1:292201338");    
    }
	private static Integer factorial(int n)  {
	    int i = 1;
	    int f = 1;
	 
	    for (int c = 1; c <= w; c++) {
	      f = f * i++;
	    }

		return f;
	}
}