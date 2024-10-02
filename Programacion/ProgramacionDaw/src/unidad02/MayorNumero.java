package unidad02;

import java.util.Iterator;
import java.util.Scanner;

/**
 * Devuelve el mayor número de los introducidos por teclado
 */
public class MayorNumero {

	public static void main(String[] args) {
		// Opcion A. Indicamos el número de datos a evaluar
		// Opción B. Establecemos una instrucción de parada
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el número de datos para calcular el máximo número :");
		int numeroDatos = scan.nextInt();
		int mayorNumero = Integer.MIN_VALUE;
		for (int index = 0; index < numeroDatos; index++) {
			System.out.println("Introduce el dato número " + (index+1));
			System.out.println("Recuerda que vas a introducir " + numeroDatos);
			int numActual = scan.nextInt(); 
			if (mayorNumero < numActual) {
				mayorNumero = numActual;
			}
			System.out.println("Te faltan " + (numeroDatos - index - 1) + " datos ");
		}
		System.out.println("El mayor numero introducido es el " + mayorNumero);
		// opción B. Establecemos una instrucción de parada
		String numeroCadena = scan.nextLine();
		int numeroEntero = Integer.parseInt(numeroCadena);
		scan.close();
	}
}
