package assignments.optionaltrycatchogrencilistesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Okul {

	List<Optional<Ogrenci>> ogrencis = new ArrayList<Optional<Ogrenci>>();

	public Okul() {
		super();

	}

	public void ogrenciListesiOlustur(Ogrenci... optionals) {
		Optional<Ogrenci> ogrenci;

		OgrenciManager ogrenciManager = new OgrenciManager();

		for (int i = 0; i < optionals.length; i++) {

			ogrenci = ogrenciManager.ogrenciUret();

			if (ogrenci.isEmpty()) {
				try {
					throw new OgrenciException("Ogrenci bilgileri eksik");

				} catch (OgrenciException e) {
					System.out.println(e.getMessage());
				}

			} else if (ogrenci.isPresent()) {

				ogrencis.add(ogrenci);
			}

		}

		ogrencis.stream().forEach(System.out::println);

	}

}
