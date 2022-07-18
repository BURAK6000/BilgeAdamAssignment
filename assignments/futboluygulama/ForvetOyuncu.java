package assignments.futboluygulama;

import java.util.Random;

public class ForvetOyuncu extends Oyuncu {

	int bitiricilik;
	int ilkDokunus;
	int kafa;
	int ozelYetenek;

	public int getBitiricilik() {
		return bitiricilik;
	}

	public void setBitiricilik(int bitiricilik) {
		this.bitiricilik = bitiricilik;
	}

	public int getIlkDokunus() {
		return ilkDokunus;
	}

	public void setIlkDokunus(int ilkDokunus) {
		this.ilkDokunus = ilkDokunus;
	}

	public int getKafa() {
		return kafa;
	}

	public void setKafa(int kafa) {
		this.kafa = kafa;
	}

	public int getOzelYetenek() {
		return ozelYetenek;
	}

	public void setOzelYetenek(int ozelYetenek) {
		this.ozelYetenek = ozelYetenek;
	}

	public ForvetOyuncu(String adString, int formaNo) {
		super(adString, formaNo);
		Random random = new Random();
		setYetenek(random.nextInt(70, 100));
		setBitiricilik(random.nextInt(70, 100));
		setIlkDokunus(random.nextInt(70, 100));
		setKafa(random.nextInt(70, 100));
		setOzelYetenek(random.nextInt(70, 100));
	}

	@Override
	public String toString() {
		return "ForvetOyuncu [getAdString()=" + getAdString() + ", getFormaNo()=" + getFormaNo()
				+ ", getDayanıklılık()=" + getDayanıklılık() + ", getHız()=" + getHız() + ", getPas()=" + getPas()
				+ ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek() + ", getKararlılık()=" + getKararlılık()
				+ ", getDogalForm()=" + getDogalForm() + ", getSans()=" + getSans() + ", toString()=" + super.toString()
				+ ", golAt()=" + golAt() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", bitiricilik=" + bitiricilik + ", ilkDokunus=" + ilkDokunus + ", kafa=" + kafa + ", ozelYetenek="
				+ ozelYetenek + "]";
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
		int bonus = random.nextInt(6);

		int skor = (int) (bonus + getPas() * 0.2 + getYetenek() * 0.2 + getOzelYetenek() * 0.2 + getDayanıklılık() * 0.1
				+ getDogalForm() * 0.1 + getSans() * 0.1);

		return skor;
	}

	@Override
	public int golSkoru() {

		KaleciOyuncu kaleciOyuncu = new KaleciOyuncu("kaleci1", 1);

		Random random = new Random();
		int bonus = (int) (random.nextInt(1, 5) * (getDogalForm() * 0.075));

		int skor = (int) (bonus - kaleciOyuncu.kurtarisSkoru() + getYetenek() * 0.2 + getOzelYetenek() * 0.2
				+ getIlkDokunus() * 0.1 + getKararlılık() * 0.1 + getSans() * 0.1 + getDogalForm() * 0.1);

		return skor;
	}

}
