import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.math.BigInteger;

public class Euler013 {
	public static void main (String[] args) throws FileNotFoundException  {
		File file = new File("euler013.txt");
		Scanner input = new Scanner(file);
		BigInteger number[] = new BigInteger[100];
		int x = 0;
		BigInteger sum = BigInteger.valueOf(0);
		
		while (input.hasNextBigInteger()) {
			sum = sum.add(input.nextBigInteger());

		}

		System.out.println(sum);	
	}
}