package unidad05;

import java.util.Date;

public abstract class Animal {
	private Date fechaNac;
	private String lugarNacimiento;
	private String ubicacion;
	private Integer numPatas;
	
	public Date getFechaNac() {
		return this.fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getLugarNacimiento() {
		return this.lugarNacimiento;
	}
	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}
	public String getUbicacion() {
		return this.ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Integer getNumPatas() {
		return this.numPatas;
	}
	public void setNumPatas(Integer numPatas) {
		this.numPatas = numPatas;
	}
	public Animal(String lugarNacimiento, Integer numPatas) {
		this.fechaNac = new Date();
		this.lugarNacimiento = lugarNacimiento;
		this.ubicacion = lugarNacimiento;
		this.numPatas = numPatas;
	}
	
	// public abstract <T extends Animal> nacer();
	public void migrar(String ubicacion) {
		this.ubicacion = ubicacion;
		
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nació en: ").append(this.lugarNacimiento).append(" el ").append(this.fechaNac);
		sb.append(" y tiene ").append(this.numPatas).append(" patas.");
		return sb.toString();
	}
}
