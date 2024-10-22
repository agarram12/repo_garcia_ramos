package unidad02;

import java.util.Scanner;

public class BoletinRepaso10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número entero para saber su última cifra: ");
		int numero = scan.nextInt();
		int ultimo = numero%10;
		System.out.println("La última cifra es: " + ultimo);
	}

}
