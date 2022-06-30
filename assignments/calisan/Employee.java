package assignments.calisan;

/**
 * @author user
 *
 */
public class Employee {
	private String name;
	private String soyisim;
	private String isUnvani;
	private int maas;

	public Employee(String name, String soyisim) {
		super();
		this.name = name;
		this.soyisim = soyisim;

	}

	public Employee(String name, String soyisim, int maas) {
		super();
		this.name = name;
		this.soyisim = soyisim;

		this.maas = maas;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public String getIsUnvani() {
		return isUnvani;
	}

	public void setIsUnvani(String isUnvani) {
		this.isUnvani = isUnvani;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	public void zamlıMaas(double zamOrani) {

		setMaas((int) (getMaas() + getMaas() * zamOrani / 100));

	}

}
