package assignmentma.maraton2.soru2;

public class Soru2EsnekSayiDizisi {

	int[] dizi = new int[0];

	int[] temp;

//	public static void main(String[] args) {
//
//		Soru2EsnekSayiDizisi soru2EsnekSayiDizisi = new Soru2EsnekSayiDizisi();
//
//		soru2EsnekSayiDizisi.elemanEkle(4);
//		soru2EsnekSayiDizisi.elemanEkle(3);
//		soru2EsnekSayiDizisi.elemanEkle(12);
//		soru2EsnekSayiDizisi.elemanEkle(3);
//		soru2EsnekSayiDizisi.arayaElemanEkle(33, 1);
//		soru2EsnekSayiDizisi.diziListele();
//
//	}

	public void elemanEkle(int eleman) {

		temp = new int[dizi.length + 1];

		for (int i = 0; i < dizi.length; i++) {
			temp[i] = dizi[i];

		}
		temp[dizi.length] = eleman;

		dizi = temp;

	}

	public void elemanSil(int eleman) {

		temp = new int[dizi.length - 1];

		boolean kontrol = true;

		for (int i = 0, y = 0; i < dizi.length; i++) {

			if (dizi[i] == eleman && kontrol) {
				kontrol = false;
				continue;
			}
			temp[y] = dizi[i];
			y++;
		}

		dizi = temp;

	}

	public void arayaElemanEkle(int eleman, int indeksNumarasi) {

		temp = new int[dizi.length + 1];

		for (int i = 0; i < indeksNumarasi; i++) {

			temp[i] = dizi[i];

		}
		temp[indeksNumarasi] = eleman;

		for (int i = indeksNumarasi; i < dizi.length; i++) {
			temp[i + 1] = dizi[i];
		}
		dizi = temp;

	}

	public void diziListele() {
		for (int i : dizi) {
			System.out.print(i + ",");
		}

	}
}
