package assignmentma;

import java.util.Scanner;

public class YildizHareket {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("================== MENU =====================");
		System.out.println("1. Start");
		System.out.println("0. Exit");
		int n1 = scanner.nextInt();

		boolean check = true;
		switch (n1) {
		case 1:
			do {
				System.out.print("Enter a odd number:  ");
				int n = scanner.nextInt();
				if (n % 2 == 0) {
					System.out.print("You exit the system ");
					check = false;
				} else {
					boolean check1 = true;
					int k = n * n;
					int m = (k / 2) + 1;
					for (int i = 1; i <= n * n; i++) {
						if (m == i) {
							System.out.print("*");
						} else {
							System.out.print(".");
						}
						if (i % n == 0) {
							System.out.println();
						}
					}
					do {

						System.out.print(
								"Select direction (2: Down, " + "8: Up, " + "4: Left, " + "6: Right, " + "0: Exit):  ");
						int select = scanner.nextInt();

						if (select == 0) {
							check1 = false;
							check = false;
						}

						if (select == 6) {
							if (m % n == 0) {
								m = m - (n - 1);
							} else {
								m++;
							}
						} else if (select == 4) {
							if (m % n == 1) {
								m = m + (n - 1);
							} else {
								m--;
							}
						} else if (select == 8) {
							if (m < n) {
								m += n * (n - 1);
							} else {
								m -= n;
							}
						} else if (select == 2) {
							if (m >= n * (n - 1)) {
								m -= n * (n - 1);
							} else {
								m += n;
							}
						} else {
							check1 = false;
							check = false;
							System.out.println("You exit the system");
						}
						for (int i = 1; i <= n * n; i++) {
							if (m == i) {
								System.out.print("*");
							} else {
								System.out.print(".");
							}
							if (i % n == 0) {
								System.out.println();
							}
						}
					} while (check1);
				}
			} while (check);
			System.out.println("Exited the system");
			break;
		case 0:
			System.out.println("Exited the system");
			break;

		}
	}
}
