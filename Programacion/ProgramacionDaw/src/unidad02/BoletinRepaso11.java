package unidad02;

import java.util.Scanner;

public class BoletinRepaso11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número para saber su primera cifra (solo hasta 5 cifras): ");
		int numero = scan.nextInt();
		scan.close();
		int primeraCif = 0;
		int dividendo = numero;
		if (numero < 9999 && numero > -9999) {
			while (dividendo != 0) {
				numero = dividendo;
				dividendo /=10;
			}
			System.out.println("La primera cifra es: " + numero);	
		} else {
			System.err.println("Necesitas introducir un número menor de 5 cifras.");
		}
	}
}