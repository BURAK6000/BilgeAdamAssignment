package assignmentma.pandemisimulasyon;

import java.util.Random;

public class HastaSımulasyonu {

	Dunya dunya = new Dunya();

	public void rastgeleDagıt() {

		Random random = new Random();

		for (int i = 0; i < dunya.ulkeler.length; i++) {
			dunya.ulkeler[i].insanSayisi = random.nextLong(dunya.toplamInsanSayisi);

			dunya.toplamInsanSayisi -= dunya.ulkeler[i].insanSayisi;

		}

		for (Ulke ulke : dunya.ulkeler) {

			System.out.println(ulke.insanSayisi);

		}

	}

}
