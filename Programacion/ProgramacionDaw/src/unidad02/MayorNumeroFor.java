package unidad02;

import java.util.Scanner;

/**
 * Devuelve el mayor número de los introducidos por teclado
 */
public class MayorNumeroFor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce \"STOP\" cuando quieras parar de introducir números: ");
		int mayorNumero = Integer.MIN_VALUE;
		String dato = "";
		boolean salir = false;
		do {
			System.out.println("Introduce un entero: ");
			dato = scan.nextLine();
			salir = "STOP".equalsIgnoreCase(dato) ? true : false;
		} while (!salir);
		System.out.println("El mayor numero introducido es el " + mayorNumero);
		scan.close();
	}
}