package unidad05;

public class Bombilla {
	private float potencia;
	private float precio;
	private String marca;
	private String estado;
	// para generar una bombilla indicamos los parametros que necesitaremos 
	public Bombilla(float potencia, float precio, String marca) {
		this.estado = "apagada";
		this.potencia = potencia;
		this.precio = precio;
		this.marca = marca;
		this.precio = precio;
	}
	
	public float getPotencia() {
		return this.potencia;
	}
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	public float getPrecio() {
		return this.precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getEstado() {
		return this.estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void encender() {
		this.estado = "encendido";
	}
	public void apagar() {
		this.estado = "apagado";
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Bombilla:\n").append("marca: ").append(this.marca)
		.append("\n").append("precio: ").append(this.precio).append(" €")
		.append("\n").append("potencia: ").append(this.potencia).append(" W")
		.append("\n").append("estado: ").append(this.estado);
		return sb.toString();
	}
	
	public boolean equals(Bombilla otraBombilla) {
		return this.marca.equalsIgnoreCase(otraBombilla.getMarca());
	}
}
