package assignmentma;

import java.util.Scanner;

public class StringDortIslem {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean menuTekrar = true;

		do {
			System.out.println(" ============================== MENU =================================");
			System.out.println();
			System.out.println(" 1: (Kolay) Icinde iki adet rakamin toplamını isteyen string ifade gir   ");
			System.out.println(" 2: (Kolay) Icinde iki adet rakamin carpimini isteyen string ifade gir   ");
			System.out.println(" 3: (Zor) Icinde iki adet sayinin carpimini isteyen string ifade gir   ");
			System.out.println(" 0: Sistemden cikis yap");
			System.out.println();
			System.out.println("Seciminiz: ");
			int n = scanner.nextInt();
			scanner.nextLine();
			switch (n) {
			case 1:
				System.out.print("Kelime giriniz: ");
				String s = scanner.nextLine();
				int k2 = 0;
				int kontrol = 0;
				for (int i = 0; i < s.length(); i++) {
					int k5 = 0;
					int sayac = 0;
					if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
						int sayac1 = 48;
						kontrol++;

						while (sayac1 <= 57) {
							if (s.charAt(i) == sayac1) {
								k5 = sayac;
							}
							sayac1++;
							sayac++;
						}
						k2 += k5;
					}
				}
				if (kontrol > 2) {
					System.out.println("2 'den fazla sayi girdiniz! ");
					break;
				}
				System.out.println("Toplam sonucu: " + k2);
				break;
			case 2:
				System.out.print("Kelime giriniz: ");
				String s1 = scanner.nextLine();
				int k3 = 1;
				int kontrol1 = 0;
				for (int i = 0; i < s1.length(); i++) {
					int k5 = 0;
					int sayac = 0;
					if (s1.charAt(i) >= 48 && s1.charAt(i) <= 57) {
						int sayac1 = 48;
						kontrol1++;
						while (sayac1 <= 57) {
							if (s1.charAt(i) == sayac1) {
								k5 = sayac;
							}
							sayac1++;
							sayac++;
						}
						k3 *= k5;
					}
				}
				if (kontrol1 > 2) {
					System.out.println("2 'den fazla sayi girdiniz! ");
					break;
				}
				System.out.println("Carpim sonucu: " + k3);
				break;
			case 3:
				System.out.print("Kelime giriniz: ");
				String s2 = scanner.nextLine();
				int k = 1;
				int k1 = 0;
				int k4 = 1;
				int k5 = 0;
				int kontrol2 = 0;
				for (int i = s2.length() - 1; i > 0; i--) {
					if (s2.charAt(i) >= 48 && s2.charAt(i) <= 57) {
						int sayac1 = 48;
						int sayac = 0;
						while (sayac1 <= 57) {
							if (s2.charAt(i) == sayac1) {
								k5 = sayac * k;
								k *= 10;
							}
							sayac1++;
							sayac++;
						}
						k1 += k5;
						if (!(s2.charAt(i - 1) >= 48 && s2.charAt(i - 1) <= 57)) {
							kontrol2++;
							k = 1;
							k4 *= k1;
							k1 = 0;
						}
					}
				}
				if (kontrol2 > 2) {
					System.out.println("2 'den fazla sayi girdiniz! ");
					break;
				}
				System.out.println("Carpim sonucu: " + k4);
				break;
			case 0:
				System.out.println("Sistemden cikis yaptiniz!");
				menuTekrar = false;
				break;

			default:
				System.out.println("Gecersiz secim yaptiniz!");
				break;
			}
		} while (menuTekrar);
	}
}
