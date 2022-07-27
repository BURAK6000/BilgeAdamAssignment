package assignments.optionaltrycatchogrencilistesi;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Scanner;

public class OgrenciManager {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		OgrenciManager ogrenciManager = new OgrenciManager();
		// ogrenciManager.isimKontrol();
		// ogrenciManager.yasKontrol();
		// ogrenciManager.notKontrol();

	}

	public String isimKontrol() {

		String isim;

		System.out.println("Lutfen isminizi giriniz");
		isim = scanner.nextLine();

		if (isim.length() < 3) {
			throw new IsimKontroluException("Isim karakter sayisi 3 'ten az olamaz");
		}
		return isim;
	}

	public LocalDate yasKontrol() {

		LocalDate dogumTarihiDate;
		int n;

		System.out.println("Lutfen dogum tarihini giriniz: ");

		String dogumTarihiString = scanner.nextLine();
		dogumTarihiDate = LocalDate.parse(dogumTarihiString);

		n = LocalDate.now().getYear() - dogumTarihiDate.getYear();
		if (n < 8) {
			throw new YasKontroluException("Ogrenci yasi 8 'ten kucuk olamaz");
		}

		return dogumTarihiDate;
	}

	public Double[] notKontrol() {

		Double[] array = new Double[3];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.println("Lutfen " + (i + 1) + ". notu giriniz");

			double not = scanner.nextDouble();

			if (not < 0 || not > 100) {
				try {
					i--;
					throw new notKontrolException("Girilen not 0-100 arasinda olmalidir");

				} catch (notKontrolException e) {
					System.out.println(e.getMessage());

				}

			}
			array[i] = not;

		}
		return array;

	}

	public Optional<Ogrenci> ogrenciUret() {

		try {
			return Optional.ofNullable(new Ogrenci(isimKontrol(), yasKontrol(), notKontrol()));

		} catch (Exception e) {

			System.out.println(e.toString());
			return Optional.empty();
		}

	}
}
