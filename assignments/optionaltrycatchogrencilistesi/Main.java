package assignments.optionaltrycatchogrencilistesi;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		Optional<Ogrenci> ogrenciOptional;

		OgrenciManager ogrenciManager = new OgrenciManager();
		Okul okul = new Okul();

		okul.ogrenciListesiOlustur(new Ogrenci(null, null, null));
	}

}
