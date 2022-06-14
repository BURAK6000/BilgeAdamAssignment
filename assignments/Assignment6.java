package assignments;

import java.util.Random;
import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {

		Random rand = new Random();
		int rand1 = rand.nextInt(100);

		System.out.println("Random sayisi: " + rand1);

		short hakSayisi = 6;
		Scanner scanner = new Scanner(System.in);

		System.out.println("============== Menu ==============");
		System.out.println("1. Oyuna basla");
		System.out.println("2. Sistemden cikis");

		short n = scanner.nextShort();
		scanner.nextLine();

		switch (n) {
		case 1:
			do {

				System.out.print("Sayi giriniz: ");

				int n1 = scanner.nextInt();

				if (n1 == rand1) {
					System.out.println("Tebrikler " + rand1 + " sayisini dogru bildiniz");
					break;
				}

				else if (n1 - rand1 < 10 && n1 - rand1 > 0) {
					System.out.println("Yaklastiniz sayiyi azaltin");

				} else if (n1 - rand1 > -10 && n1 - rand1 < 0) {
					System.out.println("Yaklastiniz  arttirin");

				} else if (n1 - rand1 > 10) {
					System.out.println("Uzaklastiniz sayiyi azaltin");

				} else {
					System.out.println("Uzaklastiniz sayiyi arttirin");

				}
				hakSayisi--;
				System.out.println("Kalan hak sayisi: " + hakSayisi);

			} while (hakSayisi != 0);
			if (hakSayisi == 0) {
				System.out.println("Hakkiniz  bitti! ");
			}
			break;
		case 2:
			System.out.println("Sistemden cikis yaptiniz");
			break;

		default:
			System.out.println();
			break;
		}

	}

}
