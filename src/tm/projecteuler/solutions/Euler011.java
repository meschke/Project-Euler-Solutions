package tm.projecteuler.solutions;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;

public class Euler011 {

	public static void main(String[] args) throws FileNotFoundException {
		int[][] grid = new int[20][20];
		long maxProduct = 0L;
		int factorOne = 0;
		int factorTwo = 0;
		int factorThree = 0;
		int factorFour = 0;

		File file = new File(args[0]);
		Scanner input = new Scanner(file);

		// scanning the grid into grid[][]
		for (int y = 0; y < 20; y++) {
			for (int x = 0; x < 20; x++) {
				grid[x][y] = input.nextInt();
				System.out.print(grid[x][y] + " ");
			}
			System.out.println("");
		}

		// horizontally
		for (int y = 0; y < 20; y++) {
			for (int x = 0; x < 17; x++) {
				long product = grid[x][y] * grid[x + 1][y] * grid[x + 2][y]
						* grid[x + 3][y];

				if (product > maxProduct) {
					maxProduct = product;
					factorOne = grid[x][y];
					factorTwo = grid[x + 1][y];
					factorThree = grid[x + 2][y];
					factorFour = grid[x + 3][y];
				}
			}
		}

		// vertically
		for (int x = 0; x < 20; x++) {
			for (int y = 0; y < 17; y++) {
				long product = grid[x][y] * grid[x][y + 1] * grid[x][y + 2]
						* grid[x][y + 3];

				if (product > maxProduct) {
					maxProduct = product;
					factorOne = grid[x][y];
					factorTwo = grid[x][y + 1];
					factorThree = grid[x][y + 2];
					factorFour = grid[x][y + 3];
				}
			}
		}

		// forward diagonally
		for (int y = 0; y < 17; y++) {
			for (int x = 0; x < 17; x++) {
				long product = grid[x][y] * grid[x + 1][y + 1]
						* grid[x + 2][y + 2] * grid[x + 3][y + 3];

				if (product > maxProduct) {
					maxProduct = product;
					factorOne = grid[x][y];
					factorTwo = grid[x + 1][y + 1];
					factorThree = grid[x + 2][y + 2];
					factorFour = grid[x + 3][y + 3];
				}
			}
		}

		// backwards diagonally
		for (int y = 0; y < 17; y++) {
			for (int x = 19; x > 4; x--) {
				long product = grid[x][y] * grid[x - 1][y + 1]
						* grid[x - 2][y + 2] * grid[x - 3][y + 3];

				if (product > maxProduct) {
					maxProduct = product;
					factorOne = grid[x][y];
					factorTwo = grid[x - 1][y + 1];
					factorThree = grid[x - 2][y + 2];
					factorFour = grid[x - 3][y + 3];
				}
			}
		}

		// show solution
		System.out.println(factorOne + " * " + factorTwo + " * " + factorThree
				+ " * " + factorFour);
		System.out.print(maxProduct);
	}

}
