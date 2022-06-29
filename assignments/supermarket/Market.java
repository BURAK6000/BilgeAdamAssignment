package assignments.supermarket;

public class Market {

	String calısanIsmiString;

	MarketYonetimi marketYonetimi = new MarketYonetimi();

	EtReyonu[] reyonu;

	int gelir;
	int gider;

	public int alıs(int i) {

		gider += marketYonetimi.etReyonu[i].kilo * marketYonetimi.etReyonu[i].alisBirimFiyat;

		System.out.println("gider: " + gider);

		return gider;

	}

	public int satis(int i) {
		gelir += marketYonetimi.etReyonu[i].kilo * marketYonetimi.etReyonu[i].satisBirimFiyat;
		System.out.println("gelir: " + gelir);

		return gelir;

	}

	public void karHesapla() {
		System.out.println("Marketin kari: " + (gelir - gider));

	}

}
