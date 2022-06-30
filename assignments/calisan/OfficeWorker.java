package assignments.calisan;

public class OfficeWorker extends Employee {

	public OfficeWorker(String name, String soyisim, int maas) {
		super(name, soyisim, maas);

	}

	public OfficeWorker(String name, String soyisim) {
		super(name, soyisim);

		setMaas(8000);

	}

	@Override
	public String getIsUnvani() {
		if (getMaas() > 8000 && getMaas() < 1500) {
			return "calisan";
		} else if (getMaas() > 15000) {
			return "kidemli calisan";

		} else {

			return "stajyer";
		}

	}

}
