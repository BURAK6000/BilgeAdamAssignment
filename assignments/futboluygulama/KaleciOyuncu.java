package assignments.futboluygulama;

import java.util.Random;

public class KaleciOyuncu extends Oyuncu {

	public KaleciOyuncu(String adString, int formaNo) {
		super(adString, formaNo);
		Random random = new Random();
		setYetenek(random.nextInt(65, 100));
		setKurtaris(random.nextInt(65, 100));
	}

	public int getKurtaris() {
		return kurtaris;
	}

	public void setKurtaris(int kurtaris) {
		this.kurtaris = kurtaris;
	}

	int kurtaris;

	@Override
	public String toString() {
		return "KaleciOyuncu [kurtaris=" + kurtaris + ", getKurtaris()=" + getKurtaris() + ", getAdString()="
				+ getAdString() + ", getFormaNo()=" + getFormaNo() + ", getDayanıklılık()=" + getDayanıklılık()
				+ ", getHız()=" + getHız() + ", getPas()=" + getPas() + ", getSut()=" + getSut() + ", getYetenek()="
				+ getYetenek() + ", getKararlılık()=" + getKararlılık() + ", getDogalForm()=" + getDogalForm()
				+ ", getSans()=" + getSans() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	@Override
	public boolean pasVer() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int pasSkor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int golSkoru() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int kurtarisSkoru() {

		Random random = new Random();
		int bonus = (int) (random.nextInt(1, 5) * (getDogalForm() * 0.025));

		int skor = (int) (bonus + getKurtaris() * 0.2 + getKararlılık() * 0.1);

		return skor;

	}

}
