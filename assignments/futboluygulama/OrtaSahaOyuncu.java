package assignments.futboluygulama;

import java.util.Random;

public class OrtaSahaOyuncu extends Oyuncu {

	public OrtaSahaOyuncu(String adString, int formaNo) {
		super(adString, formaNo);
		Random random = new Random();
		setYetenek(random.nextInt(60, 100));
		setUzunTop(random.nextInt(60, 100));
		setIlkDokunus(random.nextInt(60, 100));
		setTopSurme(random.nextInt(60, 100));
		setUretkenlik(random.nextInt(60, 100));
		setOzelYetenek(random.nextInt(60, 100));
	}

	int uzunTop;
	int ilkDokunus;
	int topSurme;
	int uretkenlik;
	int ozelYetenek;

	@Override
	public String toString() {
		return "OrtaSahaOyuncu [getAdString()=" + getAdString() + ", getFormaNo()=" + getFormaNo()
				+ ", getDayanıklılık()=" + getDayanıklılık() + ", getHız()=" + getHız() + ", getPas()=" + getPas()
				+ ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek() + ", getKararlılık()=" + getKararlılık()
				+ ", getDogalForm()=" + getDogalForm() + ", getSans()=" + getSans() + ", toString()=" + super.toString()
				+ ", golAt()=" + golAt() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", uzunTop="
				+ uzunTop + ", ilkDokunus=" + ilkDokunus + ", topSurme=" + topSurme + ", uretkenlik=" + uretkenlik
				+ ", ozelYetenek=" + ozelYetenek + "]";
	}

	public int getUzunTop() {
		return uzunTop;
	}

	public void setUzunTop(int uzunTop) {
		this.uzunTop = uzunTop;
	}

	public int getIlkDokunus() {
		return ilkDokunus;
	}

	public void setIlkDokunus(int ilkDokunus) {
		this.ilkDokunus = ilkDokunus;
	}

	public int getTopSurme() {
		return topSurme;
	}

	public void setTopSurme(int topSurme) {
		this.topSurme = topSurme;
	}

	public int getUretkenlik() {
		return uretkenlik;
	}

	public void setUretkenlik(int uretkenlik) {
		this.uretkenlik = uretkenlik;
	}

	public int getOzelYetenek() {
		return ozelYetenek;
	}

	public void setOzelYetenek(int ozelYetenek) {
		this.ozelYetenek = ozelYetenek;
	}

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
		int bonus = random.nextInt(8);

		int skor = (int) (bonus + getPas() * 0.2 + getYetenek() * 0.2 + getOzelYetenek() * 0.2 + getDayanıklılık() * 0.1
				+ getDogalForm() * 0.1 + getSans() * 0.1);
		return skor;
	}

	@Override
	public int golSkoru() {
		KaleciOyuncu kaleciOyuncu = new KaleciOyuncu("kaleci1", 1);

		Random random = new Random();
		int bonus = (int) (random.nextInt(1, 6) * (getDogalForm() * 0.075));

		int skor = (int) (bonus - kaleciOyuncu.kurtarisSkoru() + getYetenek() * 0.2 + getIlkDokunus() * 0.1
				+ getSut() * 0.2 + getKararlılık() * 0.1 + getSans() * 0.1 + getDogalForm() * 0.1);

		return skor;
	}

}
