import java.util.*;

class Euler017 {
	public static void main(String[] args) {
		Map<Integer, String> numbersWrittenOut = new HashMap();
		String number = "";
		String numberWord = "";
		int totalLength = 0;
		int unitPosition = 0;
		int decadicPosition = 0;
		int hundredsPosition = 0;
		
		// declaring written out words which cant be generated
		numbersWrittenOut.put(1, "one");
		numbersWrittenOut.put(2, "two");
		numbersWrittenOut.put(3, "three");
		numbersWrittenOut.put(4, "four");
		numbersWrittenOut.put(5, "five");
		numbersWrittenOut.put(6, "six");
		numbersWrittenOut.put(7, "seven");
		numbersWrittenOut.put(8, "eight");
		numbersWrittenOut.put(9, "nine");
		numbersWrittenOut.put(10, "ten");
		numbersWrittenOut.put(11, "eleven");
		numbersWrittenOut.put(12, "twelve");
		numbersWrittenOut.put(13, "thirteen");
		numbersWrittenOut.put(14, "fourteen");
		numbersWrittenOut.put(15, "fifteen");
		numbersWrittenOut.put(16, "sixteen");
		numbersWrittenOut.put(17, "seventeen");
		numbersWrittenOut.put(18, "eighteen");
		numbersWrittenOut.put(19, "nineteen");
		numbersWrittenOut.put(20, "twenty");
		numbersWrittenOut.put(30, "thirty");
		numbersWrittenOut.put(40, "forty");
		numbersWrittenOut.put(50, "fifty");
		numbersWrittenOut.put(80, "eighty");
		numbersWrittenOut.put(100, "onehundred");
		numbersWrittenOut.put(1000, "onethousand");
		
		// generating missing words
		for (int i = 10; i <= 1000; i++) {
			numberWord = "";
			
			if (!numbersWrittenOut.containsKey(i)) {
			    unitPosition = i % 10;
    			decadicPosition = ((i - unitPosition) % 100) / 10;
    			hundredsPosition = ((i - decadicPosition*10 - unitPosition) % 1000) / 100;
    			
    			if (hundredsPosition > 0) {
    			    if (unitPosition > 0 || decadicPosition > 0 || numbersWrittenOut.containsKey(hundredsPosition*100)) {
        			    numberWord = numberWord + numbersWrittenOut.get(hundredsPosition*100) + "and";
        			} else {
        			    switch (hundredsPosition) {
        			        case 0:
        			            break;
            			    case 1: 
            			        numberWord = numberWord + numbersWrittenOut.get(1);
            			        numberWord = numberWord + "hundred";
            			        break;
            			    case 2: 
            			        numberWord = numberWord + numbersWrittenOut.get(2);
            			        numberWord = numberWord + "hundred";
            			        break;
            			    case 3: 
            			        numberWord = numberWord + numbersWrittenOut.get(3);
            			        numberWord = numberWord + "hundred";
            			        break;
            			    case 4: 
            			        numberWord = numberWord + numbersWrittenOut.get(4);
            			        numberWord = numberWord + "hundred";
            			        break;
            			    case 5: 
            			        numberWord = numberWord + numbersWrittenOut.get(5);
            			        numberWord = numberWord + "hundred";
            			        break;
            			    case 6: 
            			        numberWord = numberWord + numbersWrittenOut.get(6);
            			        numberWord = numberWord + "hundred";
            			        break;
            			    case 7: 
            			        numberWord = numberWord + numbersWrittenOut.get(7);
            			        numberWord = numberWord + "hundred";
            			        break;
            			    case 8: 
            			        numberWord = numberWord + numbersWrittenOut.get(8);
            			        numberWord = numberWord + "hundred";
            			        break;
            			    case 9: 
            			        numberWord = numberWord + numbersWrittenOut.get(9);
            			        numberWord = numberWord + "hundred";
            			        break;
            			    default:
            			        break;
            			}
        			}
    			}
    			
    			if (decadicPosition > 0 || unitPosition > 0) {
    			    if (numbersWrittenOut.containsKey((decadicPosition*10)+unitPosition)) {
    			        numberWord = numberWord + numbersWrittenOut.get(decadicPosition*10+unitPosition);
    			    } else {
    			        if (unitPosition > 0 || numbersWrittenOut.containsKey(decadicPosition*10)) {
            			    numberWord = numberWord + numbersWrittenOut.get(decadicPosition*10);
            			} else {
            			    switch (decadicPosition) {
            			        case 0:
            			            break;
                			    case 1: 
                			        numberWord = numberWord + numbersWrittenOut.get(1);
                			        numberWord = numberWord + "ty";
                			        break;
                			    case 2: 
                			        numberWord = numberWord + numbersWrittenOut.get(2);
                			        numberWord = numberWord + "ty";
                			        break;
                			    case 3: 
                			        numberWord = numberWord + numbersWrittenOut.get(3);
                			        numberWord = numberWord + "ty";
                			        break;
                			    case 4: 
                			        numberWord = numberWord + numbersWrittenOut.get(4);
                			        numberWord = numberWord + "ty";
                			        break;
                			    case 5: 
                			        numberWord = numberWord + numbersWrittenOut.get(5);
                			        numberWord = numberWord + "ty";
                			        break;
                			    case 6: 
                			        numberWord = numberWord + numbersWrittenOut.get(6);
                			        numberWord = numberWord + "ty";
                			        break;
                			    case 7: 
                			        numberWord = numberWord + numbersWrittenOut.get(7);
                			        numberWord = numberWord + "ty";
                			        break;
                			    case 8: 
                			        numberWord = numberWord + numbersWrittenOut.get(8);
                			        numberWord = numberWord + "ty";
                			        break;
                			    case 9: 
                			        numberWord = numberWord + numbersWrittenOut.get(9);
                			        numberWord = numberWord + "ty";
                			        break;
                			    default:
                			        break;
                			}
                		}
        			}
        			
        			if (unitPosition > 0 && !numbersWrittenOut.containsKey((decadicPosition*10)+unitPosition)) {
        			    numberWord = numberWord + numbersWrittenOut.get(unitPosition);
        			}
        		}
    			
    			numbersWrittenOut.put(i, numberWord);
    		}
		}
		
		for (int i = 1; i <= 1000; i++) {
		    String s = numbersWrittenOut.get(i);
		    totalLength = totalLength + s.length();
		}
		System.out.println("Solution: " +totalLength);
	}
}
