package assignments.enummenu;

public enum Icecek {

	GAZLI_ICECEKLER(1, "GAZLI_ICECEKLER"), MEYVE_SULARI(2, "MEYVE_SULARI"), SICAK_CIKOLATA(3, "SICAK_CIKOLATA"),
	MADEN_SUYU(4, "MADEN_SUYU"), SOGUK_CAY(5, "SOGUK_CAY"), ALKOLLU_ICECEKLER(6, "ALKOLLU_ICECEKLER");

	int i;
	String anaYemek;

	private Icecek(int i, String anaYemek) {
		this.i = i;
		this.anaYemek = anaYemek;

	}

}
