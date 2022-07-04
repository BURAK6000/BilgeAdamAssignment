package assignments.enummenu;

public enum Gun {

	PAZARTESI(1, "PAZARTESI"), SALI(2, "SALI"), CARSAMBA(3, "CARSAMBA"), PERSEMBE(4, "PERSEMBE"), CUMA(5, "CUMA"),
	CUMARTESI(6, "CUMARTESI"), PAZAR(7, "PAZAR");

	private int i;
	private String gun;

	public int getI() {
		return i;
	}

	public String getGun() {
		return gun;
	}

	Gun(int i, String gun) {
		this.i = i;
		this.gun = gun;
	}

}
