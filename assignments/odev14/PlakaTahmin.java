package assignments.odev14;

import java.util.HashMap;
import java.util.Map;

public class PlakaTahmin {

	public Map<Integer, String> plakaEslestir() {

		Map<Integer, String> hMap = new HashMap<Integer, String>();

		String[] sehirler = { "Adana", "Adıyaman", "Afyonkarahisar", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin",
				"Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı",
				"Çorum", "Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep",
				"Giresun", "Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars",
				"Kastamonu", "Kayseri", "Kırkareli", "Kırşehir" };

		Integer[] plakaKodu = new Integer[40];

		for (int i = 0; i < plakaKodu.length; i++) {
			plakaKodu[i] = i + 1;
		}

		for (int j = 0; j < plakaKodu.length; j++) {
			hMap.put(plakaKodu[j], sehirler[j]);
		}
		return hMap;
	}

	public static void main(String[] args) {

	}

}
