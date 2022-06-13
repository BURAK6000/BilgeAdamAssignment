package assignment;

import java.util.Scanner;

public class Assignment5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a dividend: ");
		int n = scanner.nextInt();
		System.out.print("Enter  a divisor: ");
		int k = scanner.nextInt();

		if (k != 0) {
			int mod = n - k * (n / k);
			System.out.println(n + " mod " + k + " = " + mod);
		} else {
			System.out.println("divisor can not be zero!!!");
		}

	}

}
