package assignments.futboluygulama;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mac {

	List<Takim> takimListesiList;

	public Mac() {

		Takim takim;

		List<Takim> takimListesiList = new ArrayList<Takim>();

		takimListesiList.add(new Takim("Ev Sahibi"));
		takimListesiList.add(new Takim("Deplasman"));

	}

	public int passKontrol(int index) {
		Random random = new Random();
		int oyuncuIndex = random.nextInt(10);

		while (index == oyuncuIndex) {
			oyuncuIndex = random.nextInt(10);
		}

		return oyuncuIndex;
	}

}
