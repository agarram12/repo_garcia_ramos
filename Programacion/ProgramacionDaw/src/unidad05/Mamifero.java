package unidad05;

public abstract class Mamifero extends Animal {
	private boolean domestico;
	public boolean isDomestico() {
		return domestico;
	}
	public void setDomestico(boolean domestico) {
		this.domestico = domestico;
	}
	public Mamifero(String lugarNacimiento, Integer numPatas, boolean domestico) {
		super(lugarNacimiento, numPatas);
		this.domestico = domestico;
	}
	public void mama() {
		System.out.println("El animal está mamando");
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String infoAnimal = super.toString();
		sb.append("Es un mamífero.\n").append(infoAnimal);
		return sb.toString();
	}
}
