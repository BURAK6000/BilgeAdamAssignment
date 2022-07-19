package assignments.odev14;

import java.util.Random;
import java.util.Scanner;

public class Assignment14Map {

	public static void main(String[] args) {

		sehirTahmini();

	}

	public static void sehirTahmini() {

		System.out.println("========== Sehir Tahmin Oyunu ================");
		System.out.println();
		System.out.println();

		PlakaTahmin plakaTahmin = new PlakaTahmin();

		Scanner scanner = new Scanner(System.in);

		Random random = new Random();
		int sayi = random.nextInt(1, 41);

		String rastgeleSehir = plakaTahmin.plakaEslestir().get(sayi);
		int i = 0;
		boolean kontrol = true;

		do {

			System.out.print("Sehir giriniz: ");

			String tahmin = scanner.nextLine();
			if (tahmin.equalsIgnoreCase(rastgeleSehir)) {
				System.out.println(tahmin + " sehrini dogru tahmin ettiniz. ");
				kontrol = false;
				break;
			}

			i++;
			if (i == 3) {
				System.out.println("Deneme hakkiniz kalmadi");
				System.out.println(rastgeleSehir + " sehrini dogru tahmin edemediniz!!!");
				break;
			}
			System.out.println("Dogru tahminde bulunamadiniz");
			System.out.println("Kalan hakkiniz: " + (3 - i));

		} while (i < 3);

	}

}
