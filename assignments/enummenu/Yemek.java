package assignments.enummenu;

public enum Yemek {

	FIRINDA_KAŞARLI_KARNABAHAR(1), PATATESLI_HAVUCLU_MANTI(2), SEBZELI_GUVEC(3), TAVADA_PIZZA(4), TEK_TENCERE_PILAVI(5),
	MANTAR_YEMEGI(6), KOFTELI_TIRIT(7), POSETTE_BAHARATLI_USKUMRU(8);

	int i;

	private Yemek(int i) {
		this.i = i;
	}

}
