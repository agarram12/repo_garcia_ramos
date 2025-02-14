package unidad05;

public class BombillaMain {

	public static void main(String[] args) {
		System.out.println("Hola mundo");
		// SE PONE EN EL MISMO ORDEN EN EL QUE SE DECLARAN
		// float potencia, float precio, String marca, String estado
		Bombilla bombillaOsram = new Bombilla(60f,4.75f,"Osram");
		System.out.println(bombillaOsram);
		bombillaOsram.encender();
		
//		Bombilla bombillaPorDefecto = new Bombilla;
		System.out.println("-------------------------");
		System.out.println(bombillaOsram);
		System.out.println("-------------------------");
//		if (bombillaOsram.equals(bombillaPordefecto)) {
//			System.out.println("Son iguales");
//		} else {
//			System.out.println("No son iguales");
//		}
	}

}
