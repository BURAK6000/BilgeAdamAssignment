package assignments.optionaltrycatchogrencilistesi;

public class OgrenciException extends RuntimeException {

	String msj;

	public OgrenciException() {
		super();
	}

	public OgrenciException(String message) {
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
