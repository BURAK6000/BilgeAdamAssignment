package assignmentma.maraton2.soru6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LoglamaOrnek {

	static String dosyaIsmi = "C:\\Users\\user\\eclipse-workspace\\Assignment\\src\\assignmentma\\maraton2\\soru6\\text.txt";

	public static void main(String[] args) {

		/**
		 * Bolenin 0 oldugu bir islemden alınan hatayı log dosyasına kaydetmek.
		 */

		try {
			int bolunen = 0;
			int bolen = 0;
			int sonuc = bolunen / bolen;

		} catch (Exception e) {
			try {

				File file = new File(dosyaIsmi);
				FileOutputStream fileOutputStream = new FileOutputStream(dosyaIsmi);
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

				objectOutputStream
						.writeObject(new Loglama(e.getMessage(), "Loglama", "main method", System.currentTimeMillis()));
				objectOutputStream.close();

				FileInputStream file1 = new FileInputStream(dosyaIsmi);
				ObjectInputStream read = new ObjectInputStream(file1);

				Loglama loglama = (Loglama) read.readObject();

				System.out.println(loglama.toString());

			} catch (Exception ex) {
				System.out.println("Belirlenemeyen bir sorun!!!");
			}
		}

	}

}
