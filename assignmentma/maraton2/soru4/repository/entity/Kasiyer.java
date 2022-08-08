package assignmentma.maraton2.soru4.repository.entity;

public class Kasiyer extends Musteri {
	String calısanNumarasi;

	public Kasiyer(String id, String ad, String soyad, String adres, String calısanNumarasi) {
		super(id, ad, soyad, adres);
		this.calısanNumarasi = calısanNumarasi;
	}

	public String getCalısanNumarasi() {
		return calısanNumarasi;
	}

	public void setCalısanNumarasi(String calısanNumarasi) {
		this.calısanNumarasi = calısanNumarasi;
	}

}
