package assignmentma.pandemisimulasyon;

public class Main {

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

	public static void main(String[] args) {

		Main main = new Main();

		for (int i = 1; i < 26; i++) {

			main.uygulamaCalistir(7753000000l, 208, i, 0.1, 0.0005, 0.1, 0.2, 0.0005);
		}

	}

}
