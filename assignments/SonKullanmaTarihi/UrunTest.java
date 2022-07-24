package assignments.SonKullanmaTarihi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UrunTest {

	List<Urun> urunList = new ArrayList<Urun>();

	List<Urun> sonKullanmaTarihiGecmisUrunlerListesi = new ArrayList<Urun>();

	public static void main(String[] args) {
		UrunTest test = new UrunTest();

		for (int i = 0; i < 3; i++) {

			Optional<Urun> urun = test.urunYarat();

			test.listeyeEkle(urun);

		}

		System.out.println("Ürün listesi");
		test.urunList.forEach(s -> System.out.println(s.isim));

		System.out.println("Son kullanma tarihi gecmis urunler listesi");

		test.sonKullanmaGecmisUrunlerIste();

		System.out.println("Zamlı urunler listesi");

		test.zamlıUrunlerIste();

	}

	public void listeyeEkle(Optional<Urun> urun) {

		if (urun.isPresent())
			urunList.add(urun.get());

	}

	public Optional<Urun> urunYarat() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Lütfen bir isim giriniz");
		String isim = scanner.nextLine();
		System.out.println("Lütfen urun fiyatı giriniz");
		double fiyat = scanner.nextDouble();
		scanner.nextLine();

		System.out.println("Urun son kullanma tarihi giriniz: ");

		String sonKullanmaTarihi = scanner.nextLine();

		LocalDate sonKullanmaDate = LocalDate.parse(sonKullanmaTarihi);

		if (isim.equals("") || fiyat <= 0) {

			return Optional.ofNullable(null);
		} else {

			return Optional.ofNullable(new Urun(isim, fiyat, sonKullanmaDate));
		}

	}

	public void sonKullanmaGecmisUrunlerIste() {

		List<Urun> sonKullanmaTarihiGecmisUrunlerListesi = new ArrayList<Urun>();

		sonKullanmaTarihiGecmisUrunlerListesi = urunList.stream()
				.filter(s -> s.getSonKullanmaDate().isBefore(LocalDate.now())).collect(Collectors.toList());
		sonKullanmaTarihiGecmisUrunlerListesi.forEach(System.out::println);

	}

	public void zamlıUrunlerIste() {

		List<Urun> zamlıUrunListesi = new ArrayList<Urun>();

		zamlıUrunListesi = urunList.stream().filter(s -> s.getSonKullanmaDate().isAfter(LocalDate.now()))
				.collect(Collectors.toList());

		for (int i = 0; i < zamlıUrunListesi.size(); i++) {

			zamlıUrunListesi.get(i).fiyat += zamlıUrunListesi.get(i).fiyat * 0.3;

		}

		zamlıUrunListesi.forEach(System.out::println);

	}
}
