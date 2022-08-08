package assignmentma.maraton2.soru6;

import java.io.Serializable;

public class Loglama implements Serializable {

	String hata;
	String sinifIsmi;
	String mettodIsmi;
	Long zaman;

	public Loglama() {
		super();
	}

	public Loglama(String hata, String sınıfIsmi, String mettodIsmi, Long zaman) {
		super();
		this.hata = hata;
		this.sinifIsmi = sınıfIsmi;
		this.mettodIsmi = mettodIsmi;
		this.zaman = zaman;
	}

	public String getHata() {
		return hata;
	}

	public void setHata(String hata) {
		this.hata = hata;
	}

	public String getSınıfIsmi() {
		return sinifIsmi;
	}

	public void setSınıfIsmi(String sınıfIsmi) {
		this.sinifIsmi = sınıfIsmi;
	}

	public String getMettodIsmi() {
		return mettodIsmi;
	}

	public void setMettodIsmi(String mettodIsmi) {
		this.mettodIsmi = mettodIsmi;
	}

	public Long getZaman() {
		return zaman;
	}

	public void setZaman(Long zaman) {
		this.zaman = zaman;
	}

	@Override
	public String toString() {
		return "Loglama [hata=" + hata + ", sınıfIsmi=" + sinifIsmi + ", mettodIsmi=" + mettodIsmi + ", zaman=" + zaman
				+ "]";
	}

}
