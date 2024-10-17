package unidad02;

import java.util.Scanner;

public class NumeroPrimoONo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número para ver si es primo: ");
		int numero = teclado.nextInt();
		teclado.close();
		boolean esPrimo = true;
		int divisor = 2;
		while (esPrimo && divisor < numero) {
			if (numero % divisor == 0) {
				esPrimo = false;
			}
			divisor++;
		}
		if (esPrimo) {
			System.out.printf("El número %d es primo", numero);
		} else {
			System.out.printf("El número %d no es primo", numero);
		}
	}

}