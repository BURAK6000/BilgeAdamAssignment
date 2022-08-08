package assignmentma.maraton2.soru4.repository.entity;

public class Musteri {

	private String id;
	private String ad;
	private String soyad;
	private String adres;

	public Musteri(String id, String ad, String soyad, String adres) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.adres = adres;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	@Override
	public String toString() {
		return "Musteri [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", adres=" + adres + "]";
	}

}
