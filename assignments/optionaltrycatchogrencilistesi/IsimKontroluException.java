package assignments.optionaltrycatchogrencilistesi;

public class IsimKontroluException extends RuntimeException {

	String msj;

	public IsimKontroluException() {
		super();
	}

	public IsimKontroluException(String message) {
		super();
		this.msj = message;
	}

	public String getMsj() {
		return msj;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return getMsj();
	}

}
