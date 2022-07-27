package assignmentma.odev17;

import java.io.Serializable;
import java.time.LocalDate;

public class Ogrenci implements Serializable {

	private String ad;
	private LocalDate dogumTarihiDate;
	private int not1;
	private int not2;
	private int not3;

	public Ogrenci(String ad, LocalDate dogumTarihiDate, int not1, int not2, int not3) {
		super();
		this.ad = ad;
		this.dogumTarihiDate = dogumTarihiDate;
		this.not1 = not1;
		this.not2 = not2;
		this.not3 = not3;
	}

	public Ogrenci() {
		super();
	}

	public Ogrenci(String ad, LocalDate dogumTarihiDate) {
		super();
		this.ad = ad;
		this.dogumTarihiDate = dogumTarihiDate;
	}

	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", dogumTarihiDate=" + dogumTarihiDate + ", not1=" + not1 + ", not2=" + not2
				+ ", not3=" + not3 + "]";
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

}