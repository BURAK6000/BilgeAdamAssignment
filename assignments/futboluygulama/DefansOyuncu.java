package assignments.futboluygulama;

import java.util.Random;

public class DefansOyuncu extends Oyuncu {

	public DefansOyuncu(String adString, int formaNo) {
		super(adString, formaNo);
		Random random = new Random();
		setYetenek(random.nextInt(60, 90));

		setPozisyonAlma(random.nextInt(60, 90));
		setKafa(random.nextInt(60, 90));
		setSıcrama(random.nextInt(60, 90));
	}

	public int getPozisyonAlma() {
		return pozisyonAlma;
	}

	public void setPozisyonAlma(int pozisyonAlma) {
		this.pozisyonAlma = pozisyonAlma;
	}

	public int getKafa() {
		return kafa;
	}

	public void setKafa(int kafa) {
		this.kafa = kafa;
	}

	public int getSıcrama() {
		return sıcrama;
	}

	public void setSıcrama(int sıcrama) {
		this.sıcrama = sıcrama;
	}

	int pozisyonAlma;
	int kafa;
	int sıcrama;

	@Override
	public boolean pasVer() {

		int skor = pasSkor();
		if (skor > 65) {
			return true;
		}
		return false;
	}

	@Override
	public int pasSkor() {

		Random random = new Random();
		int bonus = random.nextInt(4);

		int skor = (int) (bonus + getPas() * 0.2 + getYetenek() * 0.2 + getDayanıklılık() * 0.1 + getDogalForm() * 0.1
				+ getPozisyonAlma() * 0.1 + getSans() * 0.1);
		return skor;
	}

	@Override
	public int golSkoru() {
		KaleciOyuncu kaleciOyuncu = new KaleciOyuncu("kaleci1", 1);

		Random random = new Random();
		int bonus = (int) (random.nextInt(2, 5) * (getDogalForm() * 0.075));

		int skor = (int) (bonus - kaleciOyuncu.kurtarisSkoru() + getYetenek() * 0.3 + getSut() * 0.2
				+ getKararlılık() * 0.1 + getSans() * 0.1 + getSıcrama() * 0.1 + getDogalForm() * 0.1);

		return skor;
	}

	@Override
	public String toString() {
		return "DefansOyuncu [getAdString()=" + getAdString() + ", getFormaNo()=" + getFormaNo()
				+ ", getDayanıklılık()=" + getDayanıklılık() + ", getHız()=" + getHız() + ", getPas()=" + getPas()
				+ ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek() + ", getKararlılık()=" + getKararlılık()
				+ ", getDogalForm()=" + getDogalForm() + ", getSans()=" + getSans() + ", toString()=" + super.toString()
				+ ", golAt()=" + golAt() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", pozisyonAlma=" + pozisyonAlma + ", kafa=" + kafa + ", sıcrama=" + sıcrama + "]";
	}

}
