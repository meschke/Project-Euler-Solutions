import java.util.Map;

class Euler019 {
    public static void main(String[] args) {
        int[][] daysInMonthOfYear = new int[12][2001];

        // Setting number of days per month
        for (int y = 0; y <= 2000; y++) {
            for (int m = 0; m < 12; m++) {
                if (m + 1 == 1 || m + 1 == 3 || m + 1 == 5 || m + 1 == 7 || m + 1 == 8 || m + 1 == 10 || m + 1 == 12) {
                    daysInMonthOfYear[m][y] = 31;
                } else {
                    if (m + 1 == 4 || m + 1 == 6 || m + 1 == 9 || m + 1 == 11) {
                        daysInMonthOfYear[m][y] = 31;
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
        
        for (int y = 1900; y <= 2000; y++) {
            for (int m = 0; m < 12; m++) {
                System.out.println("Der " +(m+1)+ "te Monat im Jahr " +y+ " hat " +dayInMonthOfYear[m][y]+ " Tage.");
            }
        }
    }
}

public boolean isLeapYear(int y) {
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