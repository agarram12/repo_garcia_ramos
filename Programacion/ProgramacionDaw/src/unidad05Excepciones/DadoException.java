package unidad05Excepciones;

public class DadoException extends Exception {
	private static final long serialVersionUID = 137566249441573229L;

	public DadoException() {
		super();
	}

	public DadoException(String message) {
		super(message);
	}
}