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

		boolean kontrol = false;
		String isim;

		do {
			System.out.println("Lutfen isminizi giriniz");
			isim = scanner.nextLine();

			kontrol = false;

			if (isim.length() < 3) {
				try {
					throw new IsimKontroluException("Isim karakter sayisi 3 'ten az olamaz");

				} catch (IsimKontroluException e) {

					System.out.println(e.getMessage());
					kontrol = true;

				}
			}
		} while (kontrol);
		return isim;
	}

	public LocalDate yasKontrol() {

		boolean kontrol = false;
		LocalDate dogumTarihiDate;
		int n;

		do {
			System.out.println("Lutfen dogum tarihini giriniz: ");

			String dogumTarihiString = scanner.nextLine();
			dogumTarihiDate = LocalDate.parse(dogumTarihiString);

			n = LocalDate.now().getYear() - dogumTarihiDate.getYear();

			kontrol = false;

			if (n < 8) {
				try {

					throw new YasKontroluException("Ogrenci yasi 8 'ten kucuk olamaz");

				} catch (YasKontroluException e) {
					System.out.println(e.getMessage());
					kontrol = true;
				}
			}
		} while (kontrol);
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

		Optional<Ogrenci> ogrenciOptional = Optional.ofNullable(new Ogrenci(isimKontrol(), yasKontrol(), notKontrol()));

		return ogrenciOptional;

	}
}
