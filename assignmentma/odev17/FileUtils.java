package assignmentma.odev17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtils {

	public static void main(String[] args) {

		menu();

	}

	public static Path path = Path
			.of("C:\\Users\\user\\eclipse-workspace\\Assignment\\src\\assignmentma\\odev17\\ogrenciListesi.txt");

	public static File file = new File(path.toString());

	public static void menu() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("0- Cikis");
		System.out.println("1- Dosya Yarat");
		System.out.println("2- Dosyaya yaz");
		System.out.println("3- Dosyayı oku");
		System.out.println("4- Ogrenci olustur");

		int n;

		do {

			System.out.println("Lütfen Islem Seciniz ");
			n = scanner.nextInt();
			switch (n) {
			case 1: {
				try {
					dosyaYarat(file);
				} catch (Exception e) {
					System.out.println(e.toString());

				}
				break;

			}
			case 2:
				try {
					dosyayaYaz(file, n);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.toString());
				}
				break;
			case 3:
				try {
					dosyayiOkuma(file);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.toString());
				}
				break;
			case 4:
				try {
					ogrenciListesiOlustur(file);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 0:
				System.out.println("Sistemden cikiliyor...");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + n);
			}
		} while (n != 0);
	}

	public static void dosyaYarat(File file) throws Exception {

		if (file.exists()) {
			throw new Exception("Dosya mevcuttur");
		} else {
			System.out.println("Dosya olusturuluyor...");
			file.createNewFile();

			Thread.sleep(1000);
			System.out.println("Dosya olusturuldu.");
		}

	}

	public static void dosyayaYaz(File file, int ogrenciSayisi) throws Exception {

		Scanner scanner = new Scanner(System.in);

		BufferedWriter bufferedWriter = null;
		System.out.print("Ogrenci sayisi giriniz: ");
		ogrenciSayisi = scanner.nextInt();
		scanner.nextLine();

		if (file.exists()) {
			for (int i = 0; i < ogrenciSayisi; i++) {

				try {
					bufferedWriter = new BufferedWriter(new FileWriter(file, true));

					try {

						System.out.print("Isim giriniz: ");

						String isimString = scanner.nextLine();

						System.out.print("Dogum yili giriniz: ");

						String dogumTarihiString = scanner.nextLine();

						LocalDate dogumTarihiDate = LocalDate.parse(dogumTarihiString);

						System.out.print("Not 1 giriniz: ");
						int not1 = scanner.nextInt();
						System.out.print("Not 2 giriniz: ");
						int not2 = scanner.nextInt();
						System.out.print("Not 3 giriniz: ");
						int not3 = scanner.nextInt();
						scanner.nextLine();

						bufferedWriter.write(
								isimString + "," + dogumTarihiDate + "," + not1 + "," + not2 + "," + not3 + "\n");
						bufferedWriter.flush();

					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.out.println(e.toString());
					}

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println(e.toString());
				} finally {
					try {
						bufferedWriter.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		} else {
			throw new Exception("Dosya mevcut degil");
		}

	}

	public static void dosyayiOkuma(File file) throws Exception {
		List<String> ogrenciList = new ArrayList<String>();
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

			String ifadeString = "";
			while ((ifadeString = bufferedReader.readLine()) != null) {
				ogrenciList.add(ifadeString);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		ogrenciList.forEach(System.out::println);

	}

	public static void ogrenciListesiOlustur(File file) {

		List<Ogrenci> ogrencis = new ArrayList<Ogrenci>();

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

			String ifadeString = "";
			String[] listeStrings;
			try {
				while ((ifadeString = bufferedReader.readLine()) != null) {
					ifadeString.split(",");
					ogrencis.add(new Ogrenci(ifadeString.split(",")[0], LocalDate.parse(ifadeString.split(",")[1]),
							Integer.parseInt(ifadeString.split(",")[2]), Integer.parseInt(ifadeString.split(",")[3]),
							Integer.parseInt(ifadeString.split(",")[4])));

				}
				ogrencis.forEach(System.out::println);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}

	}

}
