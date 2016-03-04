import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Euler018 {
    public static void main(String[] args) throws FileNotFoundException {
        int t = 1;              // Tier
        int p = 0;
        int[][] values = new int[16][16];
        int[][] maxValues = new int[16][16];

        // Scanning input file
        File file = new File("euler018-pyramid.txt");
        Scanner input = new Scanner(file);
        
        // setting values of each node        
        while (t <= 15) {
            for (int i = 1; i <= t; i++) {
                p = i;
                values[t][p] = input.nextInt();
            }
            // next tier
            t++;
        }
        
        System.out.println(values[2][1]);

    }
}