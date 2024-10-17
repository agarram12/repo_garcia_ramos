package unidad02;

import java.util.Scanner;

/**
 * Se introducen 3 numeros enteros por teclado y debe devolver el mayor de ellos
 */
public class MostrarCifraNumeroIntroducido {

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
		int mediano = 0;
		int menor = 0;
		scan.close();
		int mayor = 0;
		if (num1 > num2) {
			mayor = num1;
			menor = num2;
			mediano = num3;
			if (mayor < num3) {
				mediano = mayor;
				mayor = num3;
			}
		} else if (menor > num3) {
			mediano = menor;
			menor = num3;
		} else {
			mayor = num2;
			menor = num1;
			mediano = num3;
			if (mayor < num3) {
				mediano = mayor;
				mayor = num3;
			} else if (menor > num3) {
				mediano = menor;
				menor = num3;
				mayor = mediano;
			}
		}
		System.out.println("El mayor número es " + mayor);
		System.out.println("El número mediano es: " + mediano);
		System.out.println("El menor número es: " + menor);
	}
}