package assignmentma.pandemisimulasyon;

import java.util.Random;

public class HastaSimulasyonu {

	Dunya dunya;

	/**
	 * HastaSımulasyonu sınıfının constructor metodu ile dunya nufusu ve ulke sayisi
	 * parametrelerini alan dunya nesnesi olusturulur.
	 * 
	 * @param dunyaNufusu
	 * @param ulkeSayisi
	 */

	public HastaSimulasyonu(long dunyaNufusu, int ulkeSayisi) {
		dunya = new Dunya(dunyaNufusu, ulkeSayisi);
	}

	/**
	 * Bu metod, her ulkeye tek tek rastgele bir nufus degeri atanmasını saglar. Bu
	 * degerlerin toplamı, toplam Dunya nufusunu verecek sekilde ayarlanır.
	 * 
	 * @return dunya.ulkeler
	 * 
	 */

	public Ulke[] rastgeleInsanDagıt() {

		Random random = new Random();
		// long toplam = 0;

		for (int i = 0; i < dunya.ulkeler.length; i++) {
			dunya.ulkeler[i] = new Ulke(0);
			/**
			 * getToplamInsanSayisi()'nın 10 a bölünmesi ile ulke nufularına rastgele atanan
			 * degerler daha dengeli olmaktadır
			 */
			dunya.ulkeler[i].setInsanSayisi(random.nextLong(dunya.getToplamInsanSayisi() / 10));

			// toplam += dunya.ulkeler[i].getInsanSayisi();
			dunya.setToplamInsanSayisi(dunya.getToplamInsanSayisi() - dunya.ulkeler[i].getInsanSayisi());
		}

		/*
		 * for (Ulke ulke : dunya.ulkeler) { System.out.println(ulke.getInsanSayisi());}
		 * 
		 */

		// System.out.println("toplam:..................." + toplam);
		return dunya.ulkeler;

	}

	/**
	 * Bu metod, ülkelere göre doktor sayısını hesaplar. Doktor sayısı sabit her
	 * ulke icin sabittir. doktorOrani parametresi bir kisiye dusen doktor sayısını
	 * ifade eder.
	 * 
	 * @param doktorOrani
	 * @return dunya.ulkeler
	 */

	public Ulke[] doktorSayisi(double doktorOrani) {

		for (int i = 0; i < dunya.ulkeler.length; i++) {

			dunya.ulkeler[i].setDoktorSayisi((long) (dunya.ulkeler[i].getInsanSayisi() * doktorOrani));

		}
		return dunya.ulkeler;

	}

	/**
	 * Bu metod her ülkedede salgından etkilenmeyecek insanların başlangıc sayısını
	 * hesaplar. superOrani parametresi her ülkenin kendi nufusu içindeki super
	 * insan oranını ifade eder.
	 * 
	 * @param superInsanOrani
	 * @return dunya.ulkeler
	 */
	public Ulke[] superInsanSayisi(double superInsanOrani) {

		for (int i = 0; i < dunya.ulkeler.length; i++) {

			dunya.ulkeler[i].setSuperInsanSayisi((long) (dunya.ulkeler[i].getInsanSayisi() * superInsanOrani));

		}
		return dunya.ulkeler;

	}

	/**
	 * Bu metod her ülkede baslangıctaki hasta sayısını hesaplar. Hasta sayısı
	 * hastalıgın yayılması göre artarken aşılama ile azalmaktadır.
	 * 
	 * @param hastaInsanOrani
	 * @return dunya.ulkeler
	 */
	public Ulke[] hastaInsanSayisi(double hastaInsanOrani) {

		for (int i = 0; i < dunya.ulkeler.length; i++) {

			dunya.ulkeler[i].setHastaInsanSayisi((long) (dunya.ulkeler[i].getInsanSayisi() * hastaInsanOrani));

		}
		return dunya.ulkeler;
	}

	/**
	 * Bu metod gecen süre boyunca hastalık kapan insanların toplam sayısını
	 * hesaplar. Baslangıc degeri hasta sayısıdır.
	 * 
	 * @param hastaInsanOrani
	 * @return dunya.ulkeler
	 */

	public Ulke[] hastalıkKapanInsanSayisi(double hastaInsanOrani) {

		for (int i = 0; i < dunya.ulkeler.length; i++) {

			dunya.ulkeler[i].setHastalikKapanInsanSayisi((long) (dunya.ulkeler[i].getInsanSayisi() * hastaInsanOrani));

		}
		return dunya.ulkeler;
	}

	/**
	 * Bu metod ile salgından etkilenmeyecek insanların sayısı hesaplanır. Salgın
	 * doktorları ve süper insanları etkilemeyecektir.
	 * 
	 * @return dunya.ulkeler
	 */
	public Ulke[] saglikliInsanSayisi() {

		for (int i = 0; i < dunya.ulkeler.length; i++) {

			dunya.ulkeler[i].setSaglikliInsanSayisi(
					dunya.ulkeler[i].getDoktorSayisi() + dunya.ulkeler[i].getSuperInsanSayisi());
		}
		return dunya.ulkeler;
	}

	/**
	 * Bu metod salgın boyunca seyahat eden insanların sayını her ulkeye göre ayrı
	 * ayrı hesaplar. ???
	 * 
	 * @param seyahatEdenInsanOrani
	 * @return dunya.ulkeler
	 */

	public Ulke[] seyahatEdenInsanSayisi(double seyahatEdenInsanOrani) {

		for (int i = 0; i < dunya.ulkeler.length; i++) {

			dunya.ulkeler[i]
					.setSeyahatEdenInsanSayisi((long) (dunya.ulkeler[i].getInsanSayisi() * seyahatEdenInsanOrani));

		}
		return dunya.ulkeler;
	}

	/**
	 * Bu metod salgının uc evresine göre hastalıkKapanInsanSayisi, AsilamaMiktari,
	 * IyilesenInsanSayisi, HastaInsanSayisi, SaglikliInsanSayisi,
	 * SeyahatEdenInsanSayisi, OlenInsanSayisi, toplam InsanSayisi' ndaki
	 * degişimlerini bir hesaplandıgı bir takım ardışık hesaplamalar yapar. Burada
	 * hesaplanan degerler birbirleri ile ilişkilidir.
	 * 
	 * Bu metod salgının etkilerini üç farklı zamana ayırmıştır. Buna göre salgın
	 * bulaştığı kişide 10 günde olgunlaşır. Bu sürede kimseye bulaştıramaz, Salgın
	 * 11 günden itibaren bulaştırmaya başlar ve bu süreçte hastalık 10 gün daha
	 * sürer. 11-21 gün arasında gunlük insanların yaklaşık %2' i yasarken %8 'i
	 * ölür. 21. Günden sonra 30. Güne kadar hastalık iyileşir ve iyileşenler
	 * hastalığa bağışıklık kazanırlar. Bu sürede hastalık bulaştırmazlar.
	 * 
	 * @param gunSayisi
	 * @param asilamaOrani
	 */
	public void gunSayisi(int gunSayisi, double asilamaOrani) {
		int baslangıc = 0;

		while (baslangıc < 11 && baslangıc != gunSayisi) {

			for (int j = 0; j < dunya.ulkeler.length; j++) {

				dunya.ulkeler[j].setHastalikKapanInsanSayisi(dunya.ulkeler[j].getHastalikKapanInsanSayisi());

				dunya.ulkeler[j].setAsilamaMiktari((long) (dunya.ulkeler[j].getDoktorSayisi() / asilamaOrani));

				dunya.ulkeler[j].setIyilesenInsanSayisi(
						dunya.ulkeler[j].getIyilesenInsanSayisi() + dunya.ulkeler[j].getAsilamaMiktari());

				dunya.ulkeler[j].setHastaInsanSayisi(
						(dunya.ulkeler[j].getHastaInsanSayisi() - dunya.ulkeler[j].getAsilamaMiktari()));
				/**
				 * Ası olanlar iyileşiyor hasta insanlar hastalık bulaştırmıyor.
				 */
				dunya.ulkeler[j].setSaglikliInsanSayisi(
						dunya.ulkeler[j].getSaglikliInsanSayisi() + dunya.ulkeler[j].getIyilesenInsanSayisi());

				dunya.ulkeler[j].setSeyahatEdenInsanSayisi((long) ((dunya.ulkeler[j].getSeyahatEdenInsanSayisi()
						+ dunya.ulkeler[j].getSeyahatEdenInsanSayisi() * 0.1)));
			}
			baslangıc++;

		}

		while (baslangıc < 22 && baslangıc != gunSayisi) {

			for (int j = 0; j < dunya.ulkeler.length; j++) {
				dunya.ulkeler[j].setAsilamaMiktari((long) (dunya.ulkeler[j].getDoktorSayisi() * asilamaOrani));

				dunya.ulkeler[j].setIyilesenInsanSayisi(
						dunya.ulkeler[j].getIyilesenInsanSayisi() + dunya.ulkeler[j].getAsilamaMiktari());

				dunya.ulkeler[j].setHastalikKapanInsanSayisi((long) (dunya.ulkeler[j].getHastalikKapanInsanSayisi()
						+ ((dunya.ulkeler[j].getHastalikKapanInsanSayisi() - dunya.ulkeler[j].getAsilamaMiktari())
								* 0.1)));

				dunya.ulkeler[j].setHastaInsanSayisi((long) (dunya.ulkeler[j].getHastaInsanSayisi()
						+ ((dunya.ulkeler[j].getHastaInsanSayisi() - dunya.ulkeler[j].getAsilamaMiktari()) * 0.1)));
				/**
				 * Hasta insanlar hastalık bulaştırmaya basliyor
				 */

				dunya.ulkeler[j].setOlenInsanSayisi((long) (dunya.ulkeler[j].getOlenInsanSayisi()
						+ (dunya.ulkeler[j].getHastaInsanSayisi() * 0.08)));
				/**
				 * 11.gunden sonra her gun insanların %8 i hayatını kaybediyor!
				 * 
				 */

				dunya.ulkeler[j].setInsanSayisi(
						(long) (dunya.ulkeler[j].getInsanSayisi() - dunya.ulkeler[j].getHastaInsanSayisi() * 0.08));

				dunya.ulkeler[j].setHastaInsanSayisi((long) (dunya.ulkeler[j].getHastaInsanSayisi()
						- dunya.ulkeler[j].getHastaInsanSayisi() * 0.08));
				/**
				 * 11. gunden sonra her gun insanların %2 i iyileşiyor.
				 * 
				 */

				dunya.ulkeler[j].setSaglikliInsanSayisi((long) (dunya.ulkeler[j].getSaglikliInsanSayisi()
						+ dunya.ulkeler[j].getHastaInsanSayisi() * 0.02));

				dunya.ulkeler[j].setSeyahatEdenInsanSayisi((long) ((dunya.ulkeler[j].getSeyahatEdenInsanSayisi()
						+ dunya.ulkeler[j].getSeyahatEdenInsanSayisi() * 0.1)));
			}
			baslangıc++;
		}

		if (baslangıc > 21 && baslangıc < 31) {

			while (baslangıc != gunSayisi && dunya.ulkeler[gunSayisi].getHastaInsanSayisi() > 0) {

				for (int j = 0; j < dunya.ulkeler.length; j++) {
					dunya.ulkeler[j].setHastaInsanSayisi((long) (dunya.ulkeler[j].getHastaInsanSayisi()
							- dunya.ulkeler[j].getHastaInsanSayisi() * 0.01));

					dunya.ulkeler[j].setSaglikliInsanSayisi((long) (dunya.ulkeler[j].getSaglikliInsanSayisi()
							+ dunya.ulkeler[j].getHastaInsanSayisi() * 0.01));

					dunya.ulkeler[j].setSeyahatEdenInsanSayisi((long) ((dunya.ulkeler[j].getSeyahatEdenInsanSayisi()
							+ dunya.ulkeler[j].getSeyahatEdenInsanSayisi() * 0.1)));
				}
				baslangıc++;

			}
		}
	}

	/**
	 * Bu metod bütün ulkelerdeki toplam asılanan insan sayısını hesaplar.
	 * 
	 * @return toplamAsilananKisiSayisi
	 */

	public long toplamAsilananKisiSayisi() {

		long toplamAsilananKisiSayisi = 0;

		for (int i = 0; i < dunya.ulkeler.length; i++) {
			toplamAsilananKisiSayisi += dunya.ulkeler[i].getIyilesenInsanSayisi();

		}

		return toplamAsilananKisiSayisi;
	}

	/**
	 * Bu metod bütün ulkelerdeki toplam hayatta kalan insan sayisini hesaplar.
	 * 
	 * @return toplamHayattaKalanInsanSayisi
	 */

	public long toplamHayattaKalanInsanSayisi() {
		long toplamHayattaKalanInsanSayisi = 0;

		for (int i = 0; i < dunya.ulkeler.length; i++) {
			toplamHayattaKalanInsanSayisi += dunya.ulkeler[i].getInsanSayisi();

		}

		return toplamHayattaKalanInsanSayisi;
	}

	/**
	 * Bu metod bütün ulkelerdeki toplam ölen insan sayisini hesaplar.
	 * 
	 * @return toplamOlenInsanSayisi
	 */

	public long toplamOlenInsanSayisi() {

		long toplamOlenInsanSayisi = 0;

		for (int i = 0; i < dunya.ulkeler.length; i++) {
			toplamOlenInsanSayisi += dunya.ulkeler[i].getOlenInsanSayisi();

		}

		return toplamOlenInsanSayisi;
	}

	/**
	 * Bu metod bütün ulkelerdeki toplam hastalık kapan insan sayisini hesaplar.
	 * 
	 * @return toplamHastalıkKapanInsanSayisi
	 */

	public long toplamHastalıkKapanInsanSayisi() {

		long toplamHastalıkKapanInsanSayisi = 0;

		for (int i = 0; i < dunya.ulkeler.length; i++) {
			toplamHastalıkKapanInsanSayisi += dunya.ulkeler[i].getHastalikKapanInsanSayisi();
		}

		return toplamHastalıkKapanInsanSayisi;

	}

	/**
	 * Bu metod bütün ulkelerdeki toplam seyahat yapan insan sayisini hesaplar.
	 * 
	 * @return toplamSeyahatYapanInsanSayisi
	 */
	public long toplamSeyahatYapanInsanSayisi() {

		long toplamSeyahatYapanInsanSayisi = 0;

		for (int i = 0; i < dunya.ulkeler.length; i++) {
			toplamSeyahatYapanInsanSayisi += dunya.ulkeler[i].getSeyahatEdenInsanSayisi();
		}

		return toplamSeyahatYapanInsanSayisi;

	}

	/**
	 * Bu metod girilen gün döngüsü sonlandığında kaç kişinin seyahat ettiği, kaç
	 * kişinin hastalık kaptığı, kaç kişinin öldüğü kaç kişinin hayatta kaldığı vr
	 * kaç kişinin aşılandığının bilgisini verir.
	 * 
	 * 
	 * @param dunyaNufusu
	 * @param ulkeSayisi
	 * @param gunSayisi
	 * @param superInsanOrani
	 * @param doktorOrani
	 * @param hastaInsanOrani
	 * @param asilamaOrani
	 * @param seyahatOrani
	 */

	public void uygulamaCalistir(long dunyaNufusu, int ulkeSayisi, int gunSayisi, double superInsanOrani,
			double doktorOrani, double hastaInsanOrani, double asilamaOrani, double seyahatOrani) {

		HastaSimulasyonu hastaSimulasyonu = new HastaSimulasyonu(dunyaNufusu, ulkeSayisi);

		System.out.println("============ JAVA ANKARA BOOST ODEV Pandemi Simulasyonu ==============");

		hastaSimulasyonu.rastgeleInsanDagıt();

		hastaSimulasyonu.doktorSayisi(doktorOrani);

		hastaSimulasyonu.superInsanSayisi(superInsanOrani);

		hastaSimulasyonu.hastaInsanSayisi(hastaInsanOrani);

		hastaSimulasyonu.hastalıkKapanInsanSayisi(hastaInsanOrani);

		hastaSimulasyonu.seyahatEdenInsanSayisi(seyahatOrani);

		hastaSimulasyonu.saglikliInsanSayisi();

		hastaSimulasyonu.gunSayisi(gunSayisi, asilamaOrani);

		System.out.println(gunSayisi + ". gune kadar toplam  hastalik kapan kisi sayisi "
				+ hastaSimulasyonu.toplamHastalıkKapanInsanSayisi());

		System.out.println(
				gunSayisi + ". gune kadar toplam olen kisi sayisi " + hastaSimulasyonu.toplamOlenInsanSayisi());

		System.out.println(gunSayisi + ". gune kadar toplam hayatta kalan insan sayisi "
				+ hastaSimulasyonu.toplamHayattaKalanInsanSayisi());

		System.out.println(
				gunSayisi + ". gune kadar toplam asilanan insan sayisi " + hastaSimulasyonu.toplamAsilananKisiSayisi());

		System.out.println(gunSayisi + ". gune kadar toplam seyahat eden insan sayisi "
				+ hastaSimulasyonu.toplamSeyahatYapanInsanSayisi());

	}

}
