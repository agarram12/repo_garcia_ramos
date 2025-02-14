package unidad05;

public class Coche extends Vehiculo {
	private String marca;
	private String modelo;
	private String color;
	private Integer anyo;
	public Coche(String marca, String modelo, String color, int anyo) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.anyo = anyo;
	}
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getAnyo() {
		return this.anyo;
	}
	public void setAnyo(Integer anyo) {
		this.anyo = anyo;
	}
	
	public String toString() {
		return this.marca + " " + this.modelo;
	}
	public void quemarRueda() {
		System.out.println("Estás quemando rueda con tu " + this.marca + " " + this.modelo);
	}
}
