package assignmentma.pandemisimulasyon;

import java.util.Random;

public class HastaSımulasyonu {

	Dunya dunya = new Dunya(7_847_965_000l);

	public Ulke[] rastgeleInsanDagıt() {

		Random random = new Random();
		long toplam = 0;

		for (int i = 0; i < dunya.ulkeler.length; i++) {
			dunya.ulkeler[i] = new Ulke(0);

			dunya.ulkeler[i].insanSayisi = random.nextLong(dunya.toplamInsanSayisi / 10);

			dunya.ulkeler[i].doktorSayisi = dunya.ulkeler[i].insanSayisi / 500;

			dunya.ulkeler[i].superInsanSayisi = dunya.ulkeler[i].insanSayisi / 10;

			dunya.ulkeler[i].hastaInsanSayisi = dunya.ulkeler[i].insanSayisi * 0;

			toplam += dunya.ulkeler[i].insanSayisi;

			dunya.toplamInsanSayisi -= dunya.ulkeler[i].insanSayisi;

		}

		for (Ulke ulke : dunya.ulkeler) {

			System.out.println(ulke.insanSayisi);

		}

		System.out.println("toplam:..................." + toplam);

		return dunya.ulkeler;

	}

	// public Ulke[] rastgeleDoktorSayisi() {} gerek var mi?

}
