package assignments;

public class Assignment7_2 {

	public static void main(String[] args) {
		int[] dizi = { 2, 56, 64, 43, 2, 44, 5, 44, 56, 55, 44, 44, 2, 2, 2, 0 };

		for (int i = 0; i < dizi.length; i++) {
			int sayac = 1;
			for (int j = 0; j < i; j++) {
				if (dizi[i] == dizi[j]) {
					sayac = 0;
				}

			}
			if (sayac == 1) {
				for (int k = i + 1; k < dizi.length - 1; k++) {
					if (dizi[i] == dizi[k]) {
						sayac++;
					}
				}
				System.out.println(dizi[i] + " elemani dizi icinde " + sayac + " adettir. ");
			}
		}
	}
}