package assignmentma.maraton2.soru1;

public class Soru1Aritmetik {

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

	public int sayiCikar(int sayi, int sayi2) {
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
	 * 
	 * 
	 * @return bolum
	 */
	public double sayiBol(double bolunen, double bolen) {

		double bolum = 1;

		if (bolen == 0) {
			System.out.println("Bolen 0 olamaz !!!");

		} else {
			bolum = bolunen / bolen;
		}
		return bolum;
	}

	/***
	 * Kenar uzunlugu ve kenar sayisina gore cisimlerin alanını hesaplayan metod
	 * 
	 * @param kenarUzunlugu
	 * @param kenarSayisi
	 * @return alan
	 */

	public double alanHesapla(int kenarUzunlugu, int kenarSayisi) {

		final double PI_NUMBER = 3.14f;

		double alan;
		alan = (kenarSayisi * kenarUzunlugu) / 2 / (4 * Math.tan(PI_NUMBER / kenarSayisi));

		return alan;
	}

}
