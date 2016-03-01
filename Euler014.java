import java.util.ArrayList;

class Euler014 {
	public static void main (String[] args) {
		ArrayList<Integer> sequence = new ArrayList<Integer>();
		ArrayList<Integer> longestSequence = new ArrayList<Integer>();
		int number = 0;
		int countLongestChain = 0;

		for (int i = 1; i <= 106239; i++) {
		    sequence.clear();
			number = i;
			sequence.add(number);
			while (number != 1) {
				
				if (number % 2 == 0) {
					number /= 2;
					sequence.add(number);
				} else {
					if (number % 2 != 0) {
						number = 3 * number + 1;
						sequence.add(number);
					}
				}
			}

			if (sequence.size() > countLongestChain) {
				    countLongestChain = sequence.size();
				    longestSequence.clear();
				    longestSequence.addAll(sequence);
				    
				    System.out.println("Longest sequence until starting number " +i+ " => " +longestSequence);
		            System.out.println("It contains " +countLongestChain+ " numbers.");
			}
		}
	}	
}