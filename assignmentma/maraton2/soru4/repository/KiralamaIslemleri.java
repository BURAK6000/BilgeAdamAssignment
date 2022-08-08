package assignmentma.maraton2.soru4.repository;

import java.util.HashMap;
import java.util.Map;

import assignmentma.maraton2.soru4.repository.entity.IKitapKiralamaIslem;
import assignmentma.maraton2.soru4.repository.entity.Kiralama;
import assignmentma.maraton2.soru4.repository.entity.Kitap;
import assignmentma.maraton2.soru4.repository.entity.Musteri;

public class KiralamaIslemleri implements IKitapKiralamaIslem {

	Kiralama kiralama;

	public KiralamaIslemleri() {

		super();
		kiralama = new Kiralama();
	}

	private Map<Kitap, Musteri> kitapMusteri = new HashMap<Kitap, Musteri>();

	public Kiralama getKiralama() {
		return kiralama;
	}

	public void setKiralama(Kiralama kiralama) {
		this.kiralama = kiralama;
	}

	public Map<Kitap, Musteri> getKitapMusteri() {
		return kitapMusteri;
	}

	public void setKitapMusteri(Map<Kitap, Musteri> kitapMusteri) {
		this.kitapMusteri = kitapMusteri;
	}

	@Override
	public void kiralamaYap(Kitap kitap, Musteri musteri) {

		kitapMusteri.put(kitap, musteri);

	}

	@Override
	public boolean kitapAra(Kitap kitap) {
		if (kiralama.getKitapListesi().contains(kitap)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean musteriAra(Musteri musteri) {

		if (kiralama.getMusteriListesi().contains(musteri)) {
			return true;
		}
		return false;
	}

	@Override
	public void kiralananKitapListesi() {
		kitapMusteri.entrySet().forEach(System.out::println);

	}

}
