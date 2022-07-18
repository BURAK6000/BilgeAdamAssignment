package assignments.futboluygulama;

import java.util.Random;

public abstract class Oyuncu implements IOyuncu {
	private String adString;

	private int formaNo;
	private int dayanıklılık;
	private int hız;
	private int pas;
	private int sut;
	private int yetenek;
	private int kararlılık;
	private int dogalForm;
	private int sans;

	public Oyuncu(String adString, int formaNo) {
		super();

		Random random = new Random();
		this.setYetenek(random.nextInt(50, 101));
		this.adString = adString;

		this.formaNo = formaNo;
		this.setDayanıklılık(random.nextInt(50, 101));
		this.setHız(random.nextInt(50, 101));
		this.setPas(random.nextInt(50, 101));
		this.setSut(random.nextInt(50, 101));
		this.setKararlılık(random.nextInt(50, 101));
		this.setDogalForm(random.nextInt(50, 101));
		this.setSans(random.nextInt(50, 101));
	}

	public String getAdString() {
		return adString;
	}

	public void setAdString(String adString) {
		this.adString = adString;
	}

	public int getFormaNo() {
		return formaNo;
	}

	public void setFormaNo(int formaNo) {
		this.formaNo = formaNo;
	}

	public int getDayanıklılık() {
		return dayanıklılık;
	}

	public void setDayanıklılık(int dayanıklılık) {
		this.dayanıklılık = dayanıklılık;
	}

	public int getHız() {
		return hız;
	}

	public void setHız(int hız) {
		this.hız = hız;
	}

	public int getPas() {
		return pas;
	}

	public void setPas(int pas) {
		this.pas = pas;
	}

	public int getSut() {
		return sut;
	}

	public void setSut(int sut) {
		this.sut = sut;
	}

	public int getYetenek() {

		return yetenek;
	}

	public int getKararlılık() {
		return kararlılık;
	}

	public void setKararlılık(int kararlılık) {
		this.kararlılık = kararlılık;
	}

	public int getDogalForm() {
		return dogalForm;
	}

	public void setDogalForm(int dogalForm) {
		this.dogalForm = dogalForm;
	}

	public int getSans() {
		return sans;
	}

	public void setSans(int sans) {
		this.sans = sans;
	}

	@Override
	public String toString() {
		return "Oyuncu [adString=" + adString + ", formaNo=" + formaNo + ", dayanıklılık=" + dayanıklılık + ", hız="
				+ hız + ", pas=" + pas + ", sut=" + sut + ", yetenek=" + getYetenek() + ", kararlılık=" + kararlılık
				+ ", dogalForm=" + dogalForm + ", sans=" + sans + "]";
	}

	public void setYetenek(int yetenek) {
		this.yetenek = yetenek;
	}

	public boolean pasVer() {

		int skor = pasSkor();

		if (skor > 65) {
			return true;
		} else {
			return false;

		}
	}

	public boolean golAt() {
		int skor = golSkoru();
		if (skor > 68) {
			return true;

		} else {
			return false;
		}
	}

	public abstract int pasSkor();

	public abstract int golSkoru();

}
