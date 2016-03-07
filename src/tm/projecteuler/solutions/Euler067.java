import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Euler067 {
    public static void main(String[] args) throws FileNotFoundException {
        int lowestLevel = 100;
        int t = 1;              // Tier
        int p = 0;
        int[][] values = new int[101][101];
        int[][] maxValues = new int[101][101];

        // Scanning input file
        File file = new File("p067_triangle.txt");
        Scanner input = new Scanner(file);
        
        // Setting values of each node        
        while (t <= lowestLevel) {
            for (int i = 1; i <= t; i++) {
                p = i;
                values[t][p] = input.nextInt();
            }
            // Next tier
            t++;
        }

        // Setting max values starting at the lowest level
        for (int n = lowestLevel; n > 0; n--) {
            p = 1;
            while (p <= n) {
                if (n == lowestLevel) {
                    maxValues[n][p] = values[n][p];
                } else {
                    if (values[n][p] + maxValues[n+1][p] > values[n][p] + maxValues[n+1][p+1]) {
                        maxValues[n][p] = values[n][p] + maxValues[n+1][p];
                    } else {
                        maxValues[n][p] = values[n][p] + maxValues[n+1][p+1];
                    }
                }
                p++;
            }
        }
        
        System.out.println("Value of maximum path = " + maxValues[1][1]);
    }
}