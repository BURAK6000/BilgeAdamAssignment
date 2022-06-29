package assignments.supermarket;

public class Main {

	public static void main(String[] args) {

		System.out.println("============== Market Yönetimi Urun Ekleme==========");

		MarketYonetimi marketYonetimi = new MarketYonetimi();

		marketYonetimi.etReyonu[0] = new EtReyonu();

		marketYonetimi.etEkle(5, "kusbasi");

		System.out.println(marketYonetimi.etReyonu[0].etTurleri);
		System.out.println(marketYonetimi.etReyonu[0].kilo);

		marketYonetimi.etReyonu[1] = new EtReyonu();

		marketYonetimi.etEkle(10, "pirzola");

		System.out.println(marketYonetimi.etReyonu[1].etTurleri);
		System.out.println(marketYonetimi.etReyonu[1].kilo);

		System.out.println("=================== Market Satiş Alış Hesaplama =============================");

		Market market = new Market();
		market.marketYonetimi.etReyonu[0] = new EtReyonu();

		market.marketYonetimi.etReyonu[0].alisBirimFiyat = 80;
		market.marketYonetimi.etReyonu[0].satisBirimFiyat = 100;
		market.marketYonetimi.etReyonu[0].kilo = 10;

		market.alıs(0);
		market.satis(0);
		market.karHesapla();

	}

}
