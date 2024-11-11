package unidad03;

import java.util.Date;
import java.util.Scanner;

public class PruebaMetodos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número y te daré el siguiente primo: ");
		long numero = scan.nextLong();
		//long sigPrimo = FuncionesMatematicas.siguientePrimo(numero);
		//System.out.printf("El siguiente primo a %d es %d", numero, sigPrimo);
		System.out.printf("El número %d tiene %d digitos", numero, FuncionesMatematicas.digitos(numero));
		if (FuncionesMatematicas.esCapicua(numero)) {
			System.out.printf("\nEl número %d es capicua", numero);
		} else {
			System.out.println("\nNo es capicua.");
		}
		
		Date ahora = new Date();
		System.out.printf("\nHoy es %d", ahora);
	}
}