package unidad04;

import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[3];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un número para el array: ");
			int introducidos = scan.nextInt();
			numeros[i] = introducidos;
			System.out.print("Has introducido el número: " + numeros[i] + "\n");
		}
		for (int i = 0; i < numeros.length; i++) {	
			System.out.print(numeros[i] + ", ");
		}
		scan.close();
	}
}