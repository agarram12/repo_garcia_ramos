package unidad04;

import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[3];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce 3 números enteros: ");
			numeros[i] = scan.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ", ");
		}
	}

}
