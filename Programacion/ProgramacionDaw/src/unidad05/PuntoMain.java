package unidad05;

public class PuntoMain {

	public static void main(String[] args) {
		Punto pDefecto = new Punto();
		System.out.println(pDefecto);
		Punto p1 = new Punto(1f , 1f);
		System.out.println("Antes " + p1);
		p1.desplazar(-1, -1);
		System.out.println("Después: " + p1);
		if (pDefecto.equals(p1)) {
			System.out.println("Los puntos son iguales.");
		} else {
			System.out.println("Los puntos son distintos");
		}
	}

}
