package unidad04;

public class Carta {
	// atributos || siempre se les añade el private	
	private String palo;
	private Character numero;
		
	// constructores 
	public Carta(String palo, Character numero) {
		this.palo = palo;
		this.numero = numero;
	}
	// getters y setters
	
	
	// métodos

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carta [");
		if (palo != null) {
			builder.append("palo=");
			builder.append(this.palo);
			builder.append(", ");
		}
		if (numero != null) {
			builder.append("numero=");
			builder.append(this.numero);
		}
		builder.append("]");
		return builder.toString();
	}
	
}
