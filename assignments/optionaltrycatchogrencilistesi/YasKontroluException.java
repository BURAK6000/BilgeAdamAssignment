package assignments.optionaltrycatchogrencilistesi;

public class YasKontroluException extends RuntimeException {

	String msj;

	public YasKontroluException() {
		super();
	}

	public YasKontroluException(String message) {
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
