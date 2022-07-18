package assignments.futboluygulama;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Takim {

	public KaleciOyuncu getKaleciOyuncu() {
		return kaleciOyuncu;
	}

	public void setKaleciOyuncu(KaleciOyuncu kaleciOyuncu) {
		this.kaleciOyuncu = kaleciOyuncu;
	}

	public List<Oyuncu> getOyuncuListesi() {
		return oyuncuListesi;
	}

	public void setOyuncuListesi(List<Oyuncu> oyuncuListesi) {
		this.oyuncuListesi = oyuncuListesi;
	}

	private String isimString;
	private KaleciOyuncu kaleciOyuncu;

	List<Oyuncu> oyuncuListesi;

	public String getIsimString() {
		return isimString;
	}

	public void setIsimString(String isimString) {
		this.isimString = isimString;

	}

	public Takim(String isim) {
		this.isimString = isim;
		this.oyuncuListesi = new ArrayList<Oyuncu>();

		defansOlustur();
		ortaSahaOlustur();
		forvetOlustur();
		KaleciOyuncu kaleciOyuncu = new KaleciOyuncu("Kaleci", 1);

	}

	public void defansOlustur() {
		for (int i = 0; i < 4; i++) {
			DefansOyuncu defansOyuncusu = new DefansOyuncu("Defans " + (i + 1), i + 2);

			oyuncuListesi.add(defansOyuncusu);
		}

	}

	public void ortaSahaOlustur() {
		for (int i = 0; i < 4; i++) {
			OrtaSahaOyuncu ortaSahaOyuncusu = new OrtaSahaOyuncu("OrtaSaha " + (i + 1), i + 6);
			oyuncuListesi.add(ortaSahaOyuncusu);
		}
	}

	public void forvetOlustur() {
		for (int i = 0; i < 2; i++) {
			ForvetOyuncu forvetOyuncusu = new ForvetOyuncu("Forvet " + (i + 1), i + 10);
			oyuncuListesi.add(forvetOyuncusu);
		}
	}

	public boolean paslasma(Oyuncu oyuncu) {
		Random random = new Random();
		int n = random.nextInt(2, 10);

		int i = 0;
		while (i < 3)
			if (oyuncu.pasVer() && !(oyuncu.getAdString().equals(oyuncuListesi.get(n).getAdString()))) {

				System.out.println(oyuncu.getAdString() + " pas verdi " + oyuncuListesi.get(n).getAdString());
				oyuncu.setAdString(oyuncuListesi.get(n).getAdString());
				n = random.nextInt(2, 10);
				i++;
			} else {
				return false;
			}

		return true;

	}

	public boolean golVurusu(Oyuncu oyuncu) {

		if (paslasma(oyuncu)) {

			if (oyuncu.golAt()) {
				System.out.println(oyuncu + " Gol atti ");
				return true;

			} else {
				System.out.println(oyuncu + " Gol atamadi!!!");
				return false;
			}
		}
		System.out.println("Paslasma gerceklesmesi");
		return false;
	}

}
