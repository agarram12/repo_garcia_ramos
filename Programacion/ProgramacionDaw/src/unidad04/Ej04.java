package unidad04;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int introducidos = 0;
		int[] numeros = new int[10];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce 3 números enteros: ");
			numeros[i] = scan.nextInt();
			introducidos++;
			System.out.println("Llevas: " + introducidos + "números introducidos");
		}

	}

}
