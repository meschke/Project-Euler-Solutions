import java.util.*;

public class Euler021 {
	public static void main(String[] args) {
		Map<Integer, Integer> sumDivisorsOfN = new HashMap<Integer, Integer>();
		int sumDivisors = 0;
      	int sumAmicableNumbers = 0;
        int count = 0;
      List<Integer> amicableNumbers = new ArrayList<Integer>();
      int listIndex = 0;

		for (int i = 0; i < 10000; i++) {
			sumDivisors = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sumDivisors += j;
                  
                }  
			}
			sumDivisorsOfN.put(i, sumDivisors);
		}
        
      try {
      	for (int i = 0; i < 10000; i++) {
          count = i;
           if (sumDivisorsOfN.get(i) < 10000) {
      	        if (i == sumDivisorsOfN.get(sumDivisorsOfN.get(i)) && i != sumDivisorsOfN.get(i)) {
      			    amicableNumbers.add(listIndex, i);
                  listIndex++;
                }
      	    }
        }
      
      	
      } catch (NullPointerException e) {
      		System.out.println("NullPointerExceptoin at number " +count);
      
      }
      
      for (int x = 0; x < listIndex; x++) {
        	System.out.println(amicableNumbers.get(x)+ "    " +sumDivisorsOfN.get(amicableNumbers.get(x)));
      		sumAmicableNumbers += amicableNumbers.get(x); 
      }
      System.out.println("The sum of all amicable numbers under 10000 is " +sumAmicableNumbers);
	}
}