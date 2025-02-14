package unidad05;

public abstract class Ave extends Animal {
	private boolean volador;
	private Integer huevosPuestos;
	public boolean isVolador() {
		return volador;
	}
	public void setVolador(boolean volador) {
		this.volador = volador;
	}
	public Integer getHuevosPuestos() {
		return huevosPuestos;
	}
	public void setHuevosPuestos(Integer huevosPuestos) {
		this.huevosPuestos = huevosPuestos;
	}
	public Ave(String lugarNacimiento, Integer numPatas, boolean volador) {
		super(lugarNacimiento, numPatas);
		this.volador = volador;
	}
	public void poneHuevo() {
		this.huevosPuestos++;
		System.out.println("El animal ha puesto " + huevosPuestos + " huevos");
		
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String infoAnimal = super.toString();
		sb.append("Es un ave.\n").append(infoAnimal);
		return sb.toString();
	}
}
