package javaboostankara3maraton1;

import java.util.Scanner;

public class Soru1Aritmetik {

//	public static void main(String[] args) {
//		Soru1Aritmetik aritmetik = new Soru1Aritmetik();
//		System.out.println("Girilen sayilar toplami:  " + aritmetik.sayiTopla(4, 6, 5, 4));
//
//		System.out.println("Girilen sayilar carpimi:  " + aritmetik.sayiCarp(4, 6, 5, 4));
//		System.out.println("Girilen sayilar farki:  " + aritmetik.sayiCikar(4, 6));
//
//		System.out.println("Girilen sayilar bolumu:  " + aritmetik.sayiBol());
//		System.out.println("Alan: " + aritmetik.alanHesapla(10, 3));
//
//	}

	/***
	 * Girilen sayilarin toplamını veren metod
	 * 
	 * @param sayilar
	 * @return girilen sayilarin toplami
	 */

	public int sayiTopla(int... sayilar) {
		int toplam = 0;
		for (int i : sayilar) {
			toplam += i;

		}

		return toplam;
	}

	/***
	 * Girilen iki sayi arasındaki farkı bulan metod
	 * 
	 * @param sayi
	 * @param sayi2
	 * @return sayilarin farki
	 */

	public long sayiCikar(int sayi, int sayi2) {
		int fark = sayi - sayi2;

		return fark;
	}

	/***
	 * Girilen sayilari carpan metod
	 * 
	 * @param sayilar
	 * @return
	 */
	public long sayiCarp(int... sayilar) {

		long sonuc = 1;

		for (int i = 0; i < sayilar.length; i++) {

			sonuc *= sayilar[i];

		}

		return sonuc;

	}

	/***
	 * Bolunen ve Bolen sayilarini kullanicidan alan ve bolen metod
	 * 
	 * @return bolum
	 */
	public float sayiBol() {

		Scanner scanner = new Scanner(System.in);

		float bolum = 1;
		boolean kontrol;
		System.out.print("Bolunen sayiyi giriniz: ");
		float sayi = scanner.nextFloat();
		System.out.print("Bolen sayiyi giriniz: ");
		float sayi2 = scanner.nextFloat();

		do {
			kontrol = true;
			if (sayi2 == 0) {
				System.out.println("Bolen 0 olamaz !!!");
				System.out.print("Bolen tekrar giriniz: ");
				sayi2 = scanner.nextFloat();
				kontrol = false;

			} else {
				bolum = sayi / sayi2;

			}
		} while (!kontrol);
		return bolum;

	}

	/***
	 * Kenar uzunlugu ve kenar sayisina gore cisimlerin alanını hesaplayan metod
	 * 
	 * @param kenarUzunlugu
	 * @param kenarSayisi
	 * @return alan
	 */

	public float alanHesapla(int kenarUzunlugu, int kenarSayisi) {
		Soru1Aritmetik aritmetik1 = new Soru1Aritmetik();

		final float PI_NUMBER = 3.14f;

		double alan;
		alan = (aritmetik1.sayiCarp(kenarSayisi * kenarUzunlugu) / 2) / (4 * Math.tan(PI_NUMBER / kenarSayisi));

		return (float) alan;
	}

}
