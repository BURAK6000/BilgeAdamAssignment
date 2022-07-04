package assignments.enummenu;

public class Menu {

	public Icecek getIcecek(int i) {

		return Icecek.values()[i];
	}

	public Yemek getAnaYemek(int i) {

		return Yemek.values()[i];
	}

	public Corba getCorba(int i) {

		return Corba.values()[i];
	}

	public Tatlı getTatlı(int i) {
		return Tatlı.values()[i];
	}

}
