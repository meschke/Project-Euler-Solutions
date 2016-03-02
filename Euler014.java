import java.util.*;

class Euler014 {
	public static void main (String[] args) {
		int number = 0;
		int countChain = 0;
		int longestSequenceKey = 1;
		boolean isSequenceEnd = false;
		Map<Integer, Integer> mapNumberValues = new HashMap<Integer, Integer>();		// k = number, v = number of its sequence elements
		
		mapNumberValues.put(1, 1);

		for (int i = 2; i <= 1000000; i++) {
		    isSequenceEnd = false;
		    countChain = 0;
			number = i;
			
			while (!isSequenceEnd) {
				if (mapNumberValues.containsKey(number)) {
					countChain += mapNumberValues.get(number);
					isSequenceEnd = true;
					break;
				} else {
					if (number % 2 == 0) {
						number /= 2;
						countChain++;
					} else {
						if (number % 2 != 0) {
							number = number * 3 + 1;
							countChain++;
						} 
					}	
				}
			}
			
			if (countChain > mapNumberValues.get(longestSequenceKey)) {
				longestSequenceKey = i;
			}
			mapNumberValues.put(i, countChain);
		}
		
		System.out.println("The number " +longestSequenceKey+ " has the longest sequence with " + mapNumberValues.get(longestSequenceKey) + " elements.");
	}	
}
