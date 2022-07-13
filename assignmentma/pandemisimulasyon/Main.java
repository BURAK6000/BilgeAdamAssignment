package assignmentma.pandemisimulasyon;

public class Main {

	public static void main(String[] args) {

		HastaSimulasyonu hastaSimulasyonu = new HastaSimulasyonu(0, 0);

		for (int i = 1; i < 26; i++) {

			hastaSimulasyonu.uygulamaCalistir(7753000000l, 208, i, 0.1, 0.0005, 0.1, 0.2, 0.0005);
		}

	}

}
