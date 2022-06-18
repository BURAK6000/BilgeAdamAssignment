package assignments;

import java.util.Scanner;

public class Assignment7_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a odd number: ");
		int n = scanner.nextInt();
		System.out.print("Enter a column number: ");
		int c = scanner.nextInt();
		System.out.print("Enter a row number: ");
		int r = scanner.nextInt();
		int[][] matris = new int[r][c];

		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if (i < j) {
					matris[i][j] = n;

				} else if (i > j) {
					matris[i][j] = 1;
				}
				if (i == j) {
					matris[i][j] = (n + 1) / 2;

				}
				System.out.print(matris[i][j]);

			}
			System.out.println();

		}

	}

}
