package assignments.enummenu;

import java.util.Random;

public class MenuManager {

	Menu menu = new Menu();
	Random random = new Random();

	public void haftalıkMenuOlustur() {

		for (int i = 0; i < Gun.values().length; i++) {

			System.out.println(Gun.values()[i].getGun() + " gununun icecegi: "
					+ menu.getIcecek(random.nextInt(Icecek.values().length))

					+ ", ana yemegi: " + menu.getAnaYemek(random.nextInt(Yemek.values().length))

					+ ", corbasi : " + menu.getCorba(random.nextInt(Corba.values().length))

					+ ", tatlisi: " + menu.getTatlı(random.nextInt(Tatlı.values().length)));

			System.out.println("======================================================================");
		}

	}

}
