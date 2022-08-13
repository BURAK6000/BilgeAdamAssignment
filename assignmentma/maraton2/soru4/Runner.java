package assignmentma.maraton2.soru4;

import assignmentma.maraton2.soru4.repository.KiralamaIslemleri;
import assignmentma.maraton2.soru4.repository.entity.Kitap;
import assignmentma.maraton2.soru4.repository.entity.Musteri;

public class Runner {

	public static void main(String[] args) {

		KiralamaIslemleri kiralamaIslemleri = new KiralamaIslemleri();
		kiralamaIslemleri.kiralamaYap(new Kitap("aaqq", "Veba", 123, "camus"),
				new Musteri("qaq", "brkozr", "ozer", "sdsds"));

		kiralamaIslemleri.kiralamaYap(new Kitap("aaqq1", "Veba11", 123, "camusAlbert"),
				new Musteri("qaq1", "burakozer", "ozer", "sdsds"));

		kiralamaIslemleri.kiralamaYap(new Kitap("aaqq12", "Veba111", 123, "Albertcamus"),
				new Musteri("qaq1", "burakburakozer", "ozer", "sdsds"));

		kiralamaIslemleri.kiralananKitapListesi();

		System.out.println(kiralamaIslemleri.getKitapMusteri());

	}

}
