package assignments.calisan;

public class Engineer extends Employee {

	public Engineer(String name, String soyisim) {
		super(name, soyisim);
		setMaas(10000);

	}

	public Engineer(String name, String soyisim, int maas) {
		super(name, soyisim, maas);

	}

	public void maasZamOrani(double zamOrani) {

		setMaas((int) (getMaas() + getMaas() * zamOrani / 100) + 250);

	}

	@Override
	public String getIsUnvani() {
		if (getMaas() > 10000 && getMaas() < 17000) {
			return "kidemli muhendis";
		} else if (getMaas() > 17000) {
			return "uzman muhendis";

		} else {

			return "stajyer";
		}

	}

}
