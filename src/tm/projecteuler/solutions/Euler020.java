import java.math.BigInteger;

public class Euler020 {
	public static void main(String[] args) {
		BigInteger factorial = BigInteger.ONE;
		BigInteger count = new BigInteger("100");
		String factorialString = "";
		int sumDigits = 0;

		while (count.compareTo(BigInteger.ONE) != 0) {
			factorial = factorial.multiply(count);
           			 count = count.subtract(BigInteger.ONE);	
		}

		factorialString =factorial.toString();
		
		for (int i = 0; i < factorialString.length(); i++) {
			sumDigits += Character.getNumericValue(factorialString.charAt(i));
		}
      
      System.out.println(sumDigits);
	}
}

