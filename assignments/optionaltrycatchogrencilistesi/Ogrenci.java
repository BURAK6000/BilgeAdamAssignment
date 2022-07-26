package assignments.optionaltrycatchogrencilistesi;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;

public class Ogrenci implements Serializable {

	private String ad;
	private LocalDate dogumTarihiDate;
	private Double[] notlar;

	public Ogrenci() {
		super();
	}

	public Ogrenci(String ad, LocalDate dogumTarihiDate) {
		super();
		this.ad = ad;
		this.dogumTarihiDate = dogumTarihiDate;
	}

	public Ogrenci(String ad, LocalDate dogumTarihiDate, Double[] notlar) {
		super();
		this.ad = ad;
		this.dogumTarihiDate = dogumTarihiDate;
		this.notlar = notlar;
	}

	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", dogumTarihiDate=" + dogumTarihiDate + ", notlar=" + Arrays.toString(notlar)
				+ "]";
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public LocalDate getDogumTarihiDate() {
		return dogumTarihiDate;
	}

	public void setDogumTarihiDate(LocalDate dogumTarihiDate) {
		this.dogumTarihiDate = dogumTarihiDate;
	}

	public Double[] getNotlar() {
		return notlar;
	}

	public void setNotlar(Double[] notlar) {
		this.notlar = notlar;
	}

}
