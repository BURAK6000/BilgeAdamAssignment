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
	public void setIsUnvani() {
		if (getMaas() > 8000 && getMaas() < 12000) {
			setIsUnvani("calısan");

		} else if (getMaas() > 12000) {
			setIsUnvani("kıdemli calisan");

		} else {
			setIsUnvani("stajyer");
		}

	}

}
