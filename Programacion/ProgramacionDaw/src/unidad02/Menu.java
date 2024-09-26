package unidad02;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1-Comprimir archivo \n2-Eliminar archivo \n3-Copiar archivo \n4-Cerrar programa");
		System.out.print("Selecciona una opción del menú: ");
		int opcion = scan.nextInt();
		/* 
		 * Realizado con condicional compuesto
		if (opcion == 1) {
			System.out.println("Has elegido comprimir un archivo.");
		} else if (opcion == 2) {
			System.out.println("Has elegido eliminar un archivo.");
		} else if (opcion == 3) {
			System.out.println("Has elegido copiar un archivo.");
		} else if (opcion == 4) {
			System.out.println("Hasta luego!.");
		} else {
			System.err.println("¡Elige una opción del menú!");
		}
		*/
		switch (opcion) {
		case 1:
			System.out.println("Has elegido comprimir un archivo.");
			break;
		case 2:
			System.out.println("Has elegido eliminar un archivo.");
			break;
		case 3:
			System.out.println("Has elegido copiar un archivo.");
			break;
		case 4:
			System.out.println("Hasta luego!.");
			break;
		default:
			System.err.println("¡Elige una opción del menú!");
			break;
		}
		
		scan.close();
	}

}
