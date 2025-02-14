package unidad05;

public class Triangulo {
	Punto v1;
	Punto v2;
	Punto v3;
	public Triangulo(float v1x, float v1y, float v2x, float v2y, float v3x, float v3y) {
		this.v1 = new Punto(v1x,v1y);
		this.v2 = new Punto(v2x,v2y);
		this.v3 = new Punto(v3y,v3y);
	}
	// Métodos heredados de object
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Triangulo:\n").append("vértice 1: ").append(v1);
		sb.append("vértice 2: ").append(v2);
		sb.append("vértice 3: ").append(v3);
		return sb.toString();
	}
	public boolean equals(Triangulo otroTriangulo) {
		return false;
	}
	// Métodos del objeto
//	public Triangulo copiar(float despX, float despY) {
//		Punto v1 = new Punto();
//		v1.setPosX(this.v1.getPosX());
//		v1.setPosY(this.v1.getPosY());
//		v1.desplazar(despX, despY);
//		
//		Punto v2 = new Punto();
//		v2.setPosX(this.v2.getPosX());
//		v2.setPosY(this.v2.getPosY());
//		v2.desplazar(despX, despY);
//		
//		Punto v3 = new Punto();
//		v3.setPosX(this.v3.getPosX());
//		v3.setPosY(this.v3.getPosY());
//		v3.desplazar(despX, despY);
//		Triangulo copia = new Triangulo(v1, v2, v3);
//		return false;
//	}
	public void desplazar(float despX, float despY) {
		this.v1.desplazar(despX, despY);
		this.v2.desplazar(despX, despY);
		this.v3.desplazar(despX, despY);
	}
}