package assignments;

import java.util.Scanner;

public class Assignment8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int input;

		do {

			System.out.println("===== Hesap Makinesi =========");

			System.out.println("1- Topla");
			System.out.println("2- Cikarma");
			System.out.println("3- Carpma");
			System.out.println("4- Bolme");
			System.out.println("5- Faktoriyel");
			System.out.println("6- Us hesaplama");
			System.out.println("7- Asal kontrolu");
			System.out.println("0- Cikis");

			System.out.print("Bir islem seciniz: ");
			input = scanner.nextInt();
			boolean kontrol = true;

			switch (input) {
			case 1:
				topla();
				break;
			case 2:
				cikar();
				break;
			case 3:
				carp();
				break;
			case 4:
				bol();
				break;
			case 5:
				faktoriyelHesapla();
				break;
			case 6:
				usAl();
				break;
			case 7:
				asalKontrol();
				break;
			default:
				if (!(input == 0)) {
					System.out.println("Gecerli bir deger giriniz !!!");
				}
				break;
			}

		} while (!(input == 0));

	}

	private static void topla() {
		Scanner scanner = new Scanner(System.in);

		int toplam = 0;
		String inputString = "";

		do {

			System.out.print("Sayi giriniz: ");
			int sayi = scanner.nextInt();

			scanner.nextLine();

			toplam += sayi;
			System.out.println("Islemi sonlanrıemak icin \"=\" tusuna basiniz");

			inputString = scanner.nextLine();

		} while (!(inputString.equals("=")));

		System.out.println("toplam = " + toplam);

	}

	private static void cikar() {
		Scanner scanner = new Scanner(System.in);

		int fark = 0;
		String inputString = "";
		int sayi;
		int count = 0;

		do {

			System.out.print("Sayi giriniz: ");
			sayi = scanner.nextInt();
			scanner.nextLine();

			if (count == 1) {
				fark = sayi;
			} else {
				fark -= sayi;
			}
			System.out.println("Islemi sonlanrıemak icin \"=\" tusuna basiniz");
			inputString = scanner.nextLine();

		} while (!(inputString.equals("=")));

		System.out.println("fark = " + fark);
	}

	private static void carp() {
		Scanner scanner = new Scanner(System.in);

		int carpim = 1;
		String inputString = "";
		int sayi;
		int count = 0;

		do {

			System.out.print("Sayi giriniz: ");
			sayi = scanner.nextInt();
			scanner.nextLine();

			if (count == 1) {
				carpim = sayi;
			} else {
				carpim *= sayi;
			}
			System.out.println("Islemi sonlandirmak icin \"=\" tusuna basiniz");
			inputString = scanner.nextLine();

		} while (!(inputString.equals("=")));

		System.out.println("carpim = " + carpim);
	}

	private static void bol() {
		Scanner scanner = new Scanner(System.in);

		int bolum = 1;
		String inputString = "";
		int sayi;
		int count = 0;

		do {

			System.out.print("Sayi giriniz: ");
			sayi = scanner.nextInt();
			scanner.nextLine();

			if (count == 1) {
				bolum = sayi;
			} else {
				if (sayi == 0) {
					System.out.println("Bolen sıfır olamaz !!!");
					break;
				}
				bolum /= sayi;
			}
			System.out.println("Islemi sonlandirmak icin \"=\" tusuna basiniz");
			inputString = scanner.nextLine();

		} while (!(inputString.equals("=")));

		System.out.println("carpim = " + bolum);
	}

	private static void faktoriyelHesapla() {

		Scanner scanner = new Scanner(System.in);
		boolean kontrol = false;
		long factoriyel = 1;
		int sayi;
		do {

			kontrol = false;
			System.out.print("Sayi giriniz: ");

			sayi = scanner.nextInt();
			scanner.nextLine();

			if (sayi == 0) {
				factoriyel = 1;
			} else if (sayi > 0) {
				for (int i = 1; i <= sayi; i++) {
					factoriyel *= i;
				}
			} else {
				System.out.println("Lutfen dogal sayi giriniz");
				kontrol = true;
			}
		} while (kontrol);

		System.out.println(sayi + "!= " + factoriyel);
	}

	private static void usAl() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Taban degerini giriniz: ");

		int sayi1 = scanner.nextInt();
		System.out.print("Us degerini giriniz: ");

		int sayi2 = scanner.nextInt();

		double us = 1.0;
		if (sayi2 < 0) {

			for (int i = 0; i > sayi2; i--) {
				us *= sayi1;
			}
			us = 1.0 / us;
		} else {
			for (int i = 0; i < sayi2; i++) {
				us *= sayi1;
			}
		}

		System.out.println(sayi1 + " ^ " + sayi2 + " = " + us);
	}

	private static void asalKontrol() {

		Scanner scanner = new Scanner(System.in);
		boolean kontrol = true;

		System.out.print("Sayi giriniz: ");

		int sayi1 = scanner.nextInt();

		if (sayi1 < 2) {

			System.out.println(sayi1 + " sayisi asal degildir !!!");
			kontrol = false;
		} else {
			for (int i = 2; i <= Math.sqrt(sayi1); i++) {
				if (sayi1 % i == 0) {
					System.out.println(sayi1 + " sayisi asal degildir !!!");
					kontrol = false;
					break;
				}
			}
		}

		if (kontrol) {
			System.out.println(sayi1 + " sayisi asaldir");
		}
	}

}
