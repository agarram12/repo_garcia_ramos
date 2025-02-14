package unidad05;

public class Pinguino extends Ave{

	public Pinguino(String lugarNacimiento) {
		super(lugarNacimiento, 2, Boolean.TRUE);
	}
	public void pesca() {
		System.out.println("El animal está pescando");
	}
	public void grazna() {
		System.out.println("WA WA WAAAAA");
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String volador = this.isVolador() ? "volador" : "terrestre";
		sb.append("El animal es un pingüino. Que es un animal ").append(volador).append("\n").append(super.toString());
		return sb.toString();
	}
}
