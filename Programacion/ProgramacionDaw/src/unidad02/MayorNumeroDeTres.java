package unidad02;

import java.util.Scanner;

/**
 * Se introducen 3 numeros enteros por teclado y debe devolver el mayor de ellos
 */
public class MayorNumeroDeTres {

	public static void main(String[] args) {
		// Declaración del escaner para obtener los datos
		Scanner scan = new Scanner(System.in);
		//Petición al usuario de los datos de entrada y se guardan en variable
		System.out.print("Introduce el primer número: ");
		int num1 = scan.nextInt();
		System.out.print("Introdue el segundo número: ");
		int num2 = scan.nextInt();
		System.out.print("Introduce el tercer número: ");
		int num3 = scan.nextInt();
		scan.close();
		// Cálculo del mayor número
		int mayor;
		if (num1 > num2) {
			mayor = num1;
			if (mayor < num3) {
				mayor = num3;
			}
		} else {
			mayor = num2;
			if (mayor < num3) {
				mayor = num3;
			}
		// Respuesta final del programa
		System.out.println("El mayor número es " + mayor);
		}
	}

}
