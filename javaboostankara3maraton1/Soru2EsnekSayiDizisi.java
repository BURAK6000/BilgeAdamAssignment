package javaboostankara3maraton1;

public class Soru2EsnekSayiDizisi {

//	public static void main(String[] args) {
//
//		Soru2EsnekSayiDizisi sayiDizisi = new Soru2EsnekSayiDizisi();
//
//		int[] dizi = new int[0];
//
//		System.out.println("========== Eleman Ekle ==============");
//
//		dizi = sayiDizisi.elemanEkle(dizi, 0);
//		dizi = sayiDizisi.elemanEkle(dizi, 2);
//		dizi = sayiDizisi.elemanEkle(dizi, 2);
//		dizi = sayiDizisi.elemanEkle(dizi, 2);
//		dizi = sayiDizisi.elemanEkle(dizi, 23);
//		dizi = sayiDizisi.elemanEkle(dizi, 24);
//
//		System.out.println("========== Eleman Sil ================");
//		dizi = sayiDizisi.elemanSil(dizi, 2);
//		dizi = sayiDizisi.elemanSil(dizi, 4);
//		dizi = sayiDizisi.elemanSil(dizi, 23);
//
//		System.out.println("========== Araya Eleman Ekle =========");
//
//		dizi = sayiDizisi.arayaElemanEkle(dizi, 13, 2);
//		dizi = sayiDizisi.arayaElemanEkle(dizi, 133, 3);
//
//		System.out.println("========== Listele ===================");
//
//		sayiDizisi.diziListele(dizi);
//
//	}

	public int[] elemanEkle(int[] dizi, int eleman) {

		int[] dizi1 = new int[dizi.length + 1];

		for (int i = 0; i < dizi.length; i++) {
			dizi1[i] = dizi[i];

		}
		dizi1[dizi.length] = eleman;

		return dizi1;

	}

	public int[] elemanSil(int[] dizi, int eleman) {

		int n = 0;
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] == eleman) {
				n++;
			}
		}

		int[] dizi1 = new int[dizi.length - n];
		int j = 0;

		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] == eleman) {
				continue;

			} else {

				dizi1[j] = dizi[i];
				j++;
			}
		}

		return dizi1;
	}

	public int[] arayaElemanEkle(int[] dizi, int eleman, int indeksNumarası) {

		int[] dizi1 = new int[dizi.length + 1];

		for (int i = 0, j = 0; j < dizi1.length; i++, j++) {
			if (j == indeksNumarası) {
				dizi1[j] = eleman;
				i--;
				continue;
			} else {
				dizi1[j] = dizi[i];
			}

		}

		return dizi1;

	}

	public void diziListele(int[] dizi) {
		for (int i : dizi) {
			System.out.print(i + ",");
		}

	}
}
