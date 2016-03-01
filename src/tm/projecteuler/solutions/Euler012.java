public class Euler012 {
	public static void main (String[] args) {
		final int X_DIVISORS = 321;	
		int maxDivisors = 0;
		int countDivisors = 0;
		int number = 0;
		long triangleNumber = 0L;
		
		while (maxDivisors < X_DIVISORS) {
			number++;
			countDivisors = 1;

			triangleNumber += number;

			for (int y = 1; y*2 <= triangleNumber; y++) {
				if (triangleNumber % y == 0) {
					countDivisors++;
				}
			}
			
			if (countDivisors > maxDivisors) {
			    maxDivisors = countDivisors;
			    System.out.println("The triangle number " +triangleNumber+ " (biggest Summand " +number+ ") reaches " +maxDivisors+ " divisors.");
			}
			
			
		}
		System.out.println("The triangle number " +triangleNumber+ " (biggest Summand " +number+ ") has " +countDivisors+ " divisors.");
		
	}
}