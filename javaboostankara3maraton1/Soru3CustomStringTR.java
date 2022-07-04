package javaboostankara3maraton1;

public class Soru3CustomStringTR {

	String ifade;

	public static void main(String[] args) {

		Soru3CustomStringTR customStringTR = new Soru3CustomStringTR();

		customStringTR.ifade = "burakOzer";
		System.out.println(customStringTR.uzunluk());
		System.out.println(customStringTR.harfleriBuyukYap());

	}

	public int uzunluk() {

		return ifade.length();

	}

	public String harfleriBuyukYap() {
		return ifade.toUpperCase();
	}

	public String ilkHarfiKucukYap() {

		return ifade.toLowerCase();
	}

	public String kırp() {

		return ifade.trim();
	}

	public int dizinBul(String string) {

		return ifade.indexOf(string);
	}

	public boolean dizilerEsitmi(String string) {

		return ifade.equals(string);
	}

	public boolean baslangıcDegerimi(String string) {

		return ifade.startsWith(string);
	}

	public boolean bitisDegerimi(String string) {

		return ifade.endsWith(string);
	}

	public String altDiziOlustur(int baslangic) {

		return ifade.substring(baslangic);
	}

	public String altDiziOlustur(int baslangic, int bitis) {

		return ifade.substring(baslangic, bitis);
	}

	public String[] diziOlustur(String string) {

		return ifade.split(string);
	}

	public String ifadeBirlestir(String string) {

		return ifade.concat(string);
	}

	public String ifadeleridegistir(String ifad1, String ifade2) {

		return ifade.replace(ifad1, ifade2);
	}

}
