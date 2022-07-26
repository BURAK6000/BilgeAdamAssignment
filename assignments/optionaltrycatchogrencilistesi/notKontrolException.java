package assignments.optionaltrycatchogrencilistesi;

public class notKontrolException extends RuntimeException {

	String msj;

	public notKontrolException() {
		super();
	}

	public notKontrolException(String message) {
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
