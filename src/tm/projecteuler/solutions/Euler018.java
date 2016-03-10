import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Euler018 {
    public static void main(String[] args) throws FileNotFoundException {
        int lowestLevel = 15;
        int t = 1;              // Tier
        int p = 0;
        int[][] values = new int[16][16];
        int[][] maxValues = new int[16][16];

        // Scanning input file
        File file = new File("euler018-pyramid.txt");
        Scanner input = new Scanner(file);
        
        // Setting values of each node        
        while (t <= 15) {
            for (int i = 1; i <= t; i++) {
                p = i;
                values[t][p] = input.nextInt();
            }
            // Next tier
            t++;
        }

        // Setting max values starting at the lowest level
        for (int n = 15; n > 0; n--) {
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
        
        t = 1;
        while (t <= 15) {
            for (int i = 1; i <= t; i++) {
                System.out.print(values[t][i]+ " ");
            }
            // Next tier
            System.out.println("");
            t++;
        }
    
        t = 1;
        while (t <= 15) {
            for (int i = 1; i <= t; i++) {
                System.out.print(maxValues[t][i]+ " ");
            }
            // Next tier
            System.out.println("");
            t++;
        }
    }
}
