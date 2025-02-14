package unidad05;

public class Punto {
	
	private float posX;
	private float posY;
	/*
	 * Establecer los valores de punto por defecto
	 */
	public Punto(float posX, float posY) {
		this.posX = posX;
		this.posY = posY;
	}
	public Punto() {
		this.posX = 0f;
		this.posY = 0f;
	}
	
	/*
	 * Getters y Setters
	 */
	public float getPosX() {
		return this.posX;
	}
	public void setPosX(float posX) {
		this.posX = posX;
	}
	public float getPosY() {
		return this.posY;
	}
	public void setPosY(float posY) {
		this.posY = posY;
	}
	/*
	 * Obtener método toString para mostrar el punto y sus posiciones
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Punto: (").append(this.posX).append(" , ").append(this.posY).append(")");
		return sb.toString();
	}
	public void desplazar(float despX, float despY) {
		this.posX += despX;
		this.posY += despY;
	}
	public boolean equals(Punto otroPunto) {
		boolean iguales = true;
		if (this.posX != otroPunto.getPosX() || this.posY != otroPunto.getPosY()) {
			iguales = false;
		}
		return iguales;
	}
	public Punto obtenerInverso() {
		Punto puntoInverso = new Punto(-this.posX, -this.posY);
		return puntoInverso;
	}
	public float calcularArea() {
		return Math.abs(this.posX * this.posY);
	}
//	public float calcularDistancia(Punto otroPunto) {
//		float distancia = Math.sqrt(Math.pow(this.posX - otroPunto.getPosX(), 2) +(Math.pow(this.posY - otroPunto.getPosY()));
//	}
}
