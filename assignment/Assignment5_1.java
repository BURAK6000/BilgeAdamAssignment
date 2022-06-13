package assignment;

import java.util.Scanner;

public class Assignment5_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scanner.nextInt();

		int i = 2;
		boolean check = true;
		if (!(n >= 2)) {
			System.out.println("n is not a prime number!");

		} else {
			while (i <= Math.sqrt(n)) {
				if (n % i == 0) {
					check = false;
				}
				i++;
			}
			if (check) {
				System.out.println("n is a prime number");
			} else {
				System.out.println("n is not a prime number!");
			}
		}

	}

}
