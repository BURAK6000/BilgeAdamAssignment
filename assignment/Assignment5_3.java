package assignment;

import java.util.Scanner;

public class Assignment5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scanner.nextInt();
		System.out.print("Enter a number from 1 to 9: ");
		int k = scanner.nextInt();
		int l = 1;

		while (n != 0) {
			if (k == n % 10) {
				System.out.println(l + " 's place " + k);
				n = n / 10;
				l *= 10;
				continue;
			}
			n = n / 10;
			l *= 10;

		}

	}

}
