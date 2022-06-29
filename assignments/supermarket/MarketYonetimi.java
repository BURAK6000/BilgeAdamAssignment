package assignments.supermarket;

public class MarketYonetimi {

	Urun urun;

	EtReyonu[] etReyonu = new EtReyonu[10];

	IcecekReyonu icecekReyonu;

	SutReyonu sutReyonu;
	int i = 0;

	public void etEkle(int kilo, String etTürü) {
		etReyonu[i].kilo += kilo;
		etReyonu[i].etTurleri = etTürü;
		i++;
	}

}
