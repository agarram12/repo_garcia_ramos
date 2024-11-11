package unidad03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Boletin06 {

	public static void main(String[] args) {
		boolean salir = true;
		Scanner scan = new Scanner(System.in);
		int opcion = 0;
		int entero = 0;
		float flotante = 0;
		double doble = 0;
		boolean booleano = false;
		char caracter = 0;
		do {
			try {
				System.out.println("""
						-------------- Datos --------------
						| 1- Introducir un número int     |
						| 2- Introducir un número float   |
						| 3- Introducir un número double  |
						| 4- Introducir un dato boolean   |
						| 5- Introducir un valor char     |
						-----------------------------------
						""");
				System.out.println("Elige una opción del menu: ");
				opcion = scan.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Introduce una opción del menu!");
			}
			switch (opcion) {
			case 1:
				try {
					System.out.print("Introduce un número entero: ");
					entero = scan.nextInt();
					entero = UtilidadesEj06.entero();
				} catch (Exception e) {
					System.err.println("Introduce un número entero");
					scan.next();
				}
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;

			default:
				break;
			}
		} while (salir);
		System.out.printf("""
				El número entero introducido es: %d
				El número float introducido es: %d
				El número doble introducido es: %d
				El valor de boolean es: %d
				El valor char es: %d
				""", entero, flotante, doble, booleano, caracter);
	}

}
