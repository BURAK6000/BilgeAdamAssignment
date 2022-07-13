package assignmentma.pandemisimulasyon;

public class Dunya {

	private long toplamInsanSayisi;
	public static int gunSayisi;
	public int ulkeSayisi;

	Ulke[] ulkeler;

	public Dunya(long toplamInsanSayisi, int ulkeSayisi) {
		super();
		this.toplamInsanSayisi = toplamInsanSayisi;
		this.ulkeSayisi = ulkeSayisi;
		ulkeler = new Ulke[ulkeSayisi];

	}

	public long getToplamInsanSayisi() {
		return toplamInsanSayisi;
	}

	public void setToplamInsanSayisi(long toplamInsanSayisi) {
		this.toplamInsanSayisi = toplamInsanSayisi;
	}

}