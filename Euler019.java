import java.util.Map;

class Euler019 {
    public static void main(String[] args) {
        int[][] daysInMonthOfYear = new int[12][2001];
        String[] weekdays = new String[7];
        String[][][] date = new String[31][12][102];
        int countSundays = 0;
        
        // Days of the week
        weekdays[0] = "Monday";
        weekdays[1] = "Tuesday";
        weekdays[2] = "Wednesday";
        weekdays[3] = "Thursday";
        weekdays[4] = "Friday";
        weekdays[5] = "Saturday";
        weekdays[6] = "Sunday";
        
        // Setting number of days per month
        for (int y = 0; y <= 2000; y++) {
            for (int m = 0; m < 12; m++) {
                if (m + 1 == 1 || m + 1 == 3 || m + 1 == 5 || m + 1 == 7 || m + 1 == 8 || m + 1 == 10 || m + 1 == 12) {
                    daysInMonthOfYear[m][y] = 31;
                } else {
                    if (m + 1 == 4 || m + 1 == 6 || m + 1 == 9 || m + 1 == 11) {
                        daysInMonthOfYear[m][y] = 30;
                    } else {
                        if (m + 1 == 2) {
                            if (isLeapYear(y)) {
                                daysInMonthOfYear[m][y] = 29;
                            } else {
                                daysInMonthOfYear[m][y] = 28;
                            }
                        }
                    }
                }
            }
        }
        
        int numberDay = 0;
        
        for (int y = 0; y <= 100; y++) {
            for (int m = 0; m < 12; m++) {
                for (int d = 0; d < daysInMonthOfYear[m][y+1900]; d++) {
                    date[d][m][y] = weekdays[numberDay];
                    
                    if (numberDay == 6) {
                        numberDay = 0;
                    } else {
                        numberDay++;
                    }
                }
            }
        }
        
         for (int y = 1; y <= 100; y++) {
            for (int m = 0; m < 12; m++) {
                for (int d = 0; d < daysInMonthOfYear[m][y+1900]; d++) {
                    if (d == 0 && date[d][m][y] == weekdays[6]) {
                        countSundays++;
                    }
                }
            }
        }
        System.out.println(countSundays);
    }
    
    static boolean isLeapYear(int y) {
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    
}

