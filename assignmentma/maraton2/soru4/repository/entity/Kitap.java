package assignmentma.maraton2.soru4.repository.entity;

public class Kitap {

	private static String YAYINEVI_ADI = "KitapYayinEvi";

	private String kitapId;
	private String kitapAdi;
	private int sayfaSayisi;
	private String yazarAdi;

	public Kitap(String yazarAdi, String kitapAdi) {
		super();

		this.yazarAdi = yazarAdi;
		this.kitapAdi = kitapAdi;
	}

	public Kitap(String kitapId, String kitapAdi, int sayfaSayisi, String yazarAdi) {
		super();
		this.kitapAdi = kitapAdi;
		this.sayfaSayisi = sayfaSayisi;
		this.yazarAdi = yazarAdi;
		this.kitapId = kitapId;

	}

	public static String getYayineviAdi() {
		return YAYINEVI_ADI;
	}

	public Kitap() {
		super();
	}

	public String getKitapId() {
		return kitapId;
	}

	public void setKitapId(String kitapId) {
		this.kitapId = kitapId;
	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public int getSayfaSayisi() {
		return sayfaSayisi;
	}

	public void setSayfaSayisi(int sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}

	public String getYazarAdi() {
		return yazarAdi;
	}

	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}

	@Override
	public String toString() {
		return "Kitap [kitapId=" + kitapId + ", kitapAdi=" + kitapAdi + ", sayfaSayisi=" + sayfaSayisi + ", yazarAdi="
				+ yazarAdi + "]";
	}

}
