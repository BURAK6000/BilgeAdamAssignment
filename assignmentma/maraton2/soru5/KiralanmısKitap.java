package assignmentma.maraton2.soru5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import assignmentma.maraton2.soru4.repository.KiralamaIslemleri;
import assignmentma.maraton2.soru4.repository.entity.Kitap;
import assignmentma.maraton2.soru4.repository.entity.Musteri;

public class KiralanmısKitap {

	List<Entry<Kitap, Musteri>> kitapKiralayanMusteriListesi = new ArrayList<Map.Entry<Kitap, Musteri>>();

	public static void main(String[] args) {

		KiralanmısKitap kiralanmısKitap = new KiralanmısKitap();

		KiralamaIslemleri kiralamaIslemleri = new KiralamaIslemleri();

		kiralamaIslemleri.kiralamaYap(new Kitap("aaqq", "Veba", 123, "camus"),
				new Musteri("qaq", "brkozr", "ozer", "sdsds"));

		kiralamaIslemleri.kiralamaYap(new Kitap("aaqq1", "Veba11", 123, "camusAlbert"),
				new Musteri("qaq1", "burakozer", "ozer", "sdsds"));

		kiralamaIslemleri.kiralamaYap(new Kitap("aaqq12", "Veba111", 123, "Albertcamus"),
				new Musteri("qaq1", "burakburakozer", "ozer", "sdsds"));

		// System.out.println(kiralamaIslemleri.getKitapMusteri());

		kiralanmısKitap.kitapSahibiBul(kiralamaIslemleri, "aaqq12");

	}

	/**
	 * 
	 * id bilgisi verilmiş olan Kitabın kim tarafından kiralanmış oldugunu doner.
	 * 
	 * @param kitapId
	 */

	public void kitapSahibiBul(KiralamaIslemleri kiralamaIslemleri, String kitapId) {

		// kiralamaIslemleri.getKitapMusteri().entrySet().forEach(System.out::println);

		kiralamaIslemleri.getKitapMusteri().entrySet().stream().filter(s -> s.getKey().getKitapId().equals(kitapId))
				.forEach(s -> System.out.println(s.getValue().getAd()));

	}

	/**
	 * adı verilen kitabın daha önce kimler tarafından kiralanmış oldugunun
	 * listesini doner.
	 * 
	 * @param ad
	 */

	public void kitapKiralayanListesi(KiralamaIslemleri kiralamaIslemleri, String ad) {

		kitapKiralayanMusteriListesi = kiralamaIslemleri.getKitapMusteri().entrySet().stream()
				.filter(s -> s.getKey().getKitapAdi().equals(ad)).collect(Collectors.toList());

		kitapKiralayanMusteriListesi.forEach(s -> System.out.println(s.getValue()));

	}

	/**
	 * adı ahm ile başlayan müşterilerin listesini doner
	 */

	public void ahmMusteriBul(KiralamaIslemleri kiralamaIslemleri) {
		List<Entry<Kitap, Musteri>> ahmMusteriListesi;

		ahmMusteriListesi = kiralamaIslemleri.getKitapMusteri().entrySet().stream()
				.filter(s -> s.getValue().getAd().startsWith("ahm")).collect(Collectors.toList());

		ahmMusteriListesi.stream().forEach(s -> System.out.println(s.getValue()));

	}

	/**
	 * id verilen müşterinin kiraladığı kitapların listesini bulunuz
	 * 
	 * @param musteriId
	 */

	public void musteriIdKiralananKitaplariBul(KiralamaIslemleri kiralamaIslemleri, String musteriId) {

		kiralamaIslemleri.getKitapMusteri().entrySet().stream().filter(s -> s.getValue().getId().equals(musteriId))
				.forEach(s -> System.out.println(s.getKey()));

	}

}
