package assignments.calisan;

public class Engineer extends Employee {

	public Engineer(String name, String soyisim) {
		super(name, soyisim);
		setMaas(10000);

	}

	public Engineer(String name, String soyisim, int maas) {
		super(name, soyisim, maas);
		setIsUnvani();

	}

	@Override
	public double zamlıMaas(double zamOrani) {
		// TODO Auto-generated method stub
		return super.zamlıMaas((zamOrani) + 250);
	}

	@Override
	public void setIsUnvani() {
		if (getMaas() > 10000 && getMaas() < 17000) {
			setIsUnvani("kıdemli muhendis");

		} else if (getMaas() > 17000) {
			setIsUnvani("uzman muhendis");

		} else {
			setIsUnvani("muhendis");
		}
	}

}
