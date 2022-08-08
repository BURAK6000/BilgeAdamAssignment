package assignmentma.maraton2.soru4.repository.entity;

import java.util.List;

public class Kiralama {

	private static List<Kitap> kitapListesi;

	private static List<Musteri> musteriListesi;

	public List<Kitap> getKitapListesi() {
		return kitapListesi;
	}

	public void setKitapListesi(List<Kitap> kitapListesi) {
		this.kitapListesi = kitapListesi;
	}

	public List<Musteri> getMusteriListesi() {
		return musteriListesi;
	}

	public void setMusteriListesi(List<Musteri> musteriListesi) {
		this.musteriListesi = musteriListesi;
	}

}
