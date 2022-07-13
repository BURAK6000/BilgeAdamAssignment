package assignmentma.pandemisimulasyon;

public class Ulke {

	private long insanSayisi;

	private long superInsanSayisi;
	private long doktorSayisi;
	private long hastalikKapanInsanSayisi;

	private long asilamaMiktari;

	private long iyilesenInsanSayisi; // ası ile iyileşen insan sayısı

	private long hastaInsanSayisi;

	private long saglikliInsanSayisi;

	private long olenInsanSayisi;

	private long seyahatEdenInsanSayisi;

	public long getSeyahatEdenInsanSayisi() {
		return seyahatEdenInsanSayisi;
	}

	public void setSeyahatEdenInsanSayisi(long seyahatEdenInsanSayisi) {
		this.seyahatEdenInsanSayisi = seyahatEdenInsanSayisi;
	}

	public long getHastalikKapanInsanSayisi() {
		if (hastalikKapanInsanSayisi < 0) {
			return 0;
		} else {

			return hastalikKapanInsanSayisi;
		}
	}

	public void setHastalikKapanInsanSayisi(long hastalikKapanInsanSayisi) {
		this.hastalikKapanInsanSayisi = hastalikKapanInsanSayisi;
	}

	public long getAsilamaMiktari() {
		return asilamaMiktari;
	}

	public void setAsilamaMiktari(long asilamaMiktari) {

		this.asilamaMiktari = asilamaMiktari;
	}

	public long getOlenInsanSayisi() {
		if (olenInsanSayisi < 0) {
			return 0;
		} else {

			return olenInsanSayisi;
		}
	}

	public void setOlenInsanSayisi(long olenInsanSayisi) {
		this.olenInsanSayisi = olenInsanSayisi;
	}

	public long getSaglikliInsanSayisi() {
		if (saglikliInsanSayisi < 0) {
			return 0;
		} else {

			return saglikliInsanSayisi;
		}
	}

	public void setSaglikliInsanSayisi(long saglikliInsanSAyisi) { // ????????????????????

		this.saglikliInsanSayisi = saglikliInsanSAyisi;

	}

	public long getIyilesenInsanSayisi() {
		if (iyilesenInsanSayisi < 0) {
			return 0;
		} else {

			return iyilesenInsanSayisi;
		}
	}

	public void setIyilesenInsanSayisi(long iyilesenInsanSayisi) {
		this.iyilesenInsanSayisi = iyilesenInsanSayisi;
	}

	public Ulke(long insanSayisi) {
		super();
		this.insanSayisi = insanSayisi;

//		rastgele nufus dağıtım fonksiyonunu burada tanımla!!!!!
	}

	public long getInsanSayisi() {
		return insanSayisi;
	}

	public void setInsanSayisi(long insanSayisi) {
		this.insanSayisi = insanSayisi;
	}

	public long getSuperInsanSayisi() {
		return superInsanSayisi;
	}

	public void setSuperInsanSayisi(long superInsanSayisi) {
		this.superInsanSayisi = superInsanSayisi;
	}

	public long getDoktorSayisi() {
		return doktorSayisi;
	}

	public void setDoktorSayisi(long doktorSayisi) {
		this.doktorSayisi = doktorSayisi;
	}

	public long getHastaInsanSayisi() {
		if (hastaInsanSayisi < 0) {
			return 0;
		} else {

			return hastaInsanSayisi;
		}
	}

	public void setHastaInsanSayisi(long hastaInsanSayisi) {

		this.hastaInsanSayisi = hastaInsanSayisi;

	}

}
