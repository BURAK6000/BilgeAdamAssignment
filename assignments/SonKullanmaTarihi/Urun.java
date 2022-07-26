package assignments.SonKullanmaTarihi;

import java.time.LocalDate;

public class Urun {

	String isim;
	double fiyat;
	LocalDate sonKullanmaDate;

	@Override
	public String toString() {
		return "Urun [isim=" + isim + ", fiyat=" + fiyat + ", sonKullanmaDate=" + sonKullanmaDate + "]";
	}

	public Urun(String isim, double fiyat, LocalDate sonKullanmaDate) {
		super();
		this.isim = isim;
		this.fiyat = fiyat;
		this.sonKullanmaDate = sonKullanmaDate;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public LocalDate getSonKullanmaDate() {
		return sonKullanmaDate;
	}

	public void setSonKullanmaDate(LocalDate sonKullanmaDate) {
		this.sonKullanmaDate = sonKullanmaDate;
	}

}
