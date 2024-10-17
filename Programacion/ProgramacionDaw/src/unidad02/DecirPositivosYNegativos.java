package unidad02;

import java.util.Scanner;

public class DecirPositivosYNegativos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int positivos = 0;
		int negativos = 0;
		for (int numeros = 10; numeros > 0 ; numeros--) {
			System.out.println("Introduce un número (quedan " + numeros + "): ");
			int numero = teclado.nextInt();
			if (numero >= 0) {
				positivos++;
			} else {
				negativos++;
			}
		}
		teclado.close();
		System.out.printf("Hay %d números positivos y %d números negativos.", positivos,negativos);
	}
}