package unidad02;

import java.util.Scanner;

public class ContarDigitosCifras {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Este programa calcula las cifras de un número entero");
		System.out.print("Introduce un número entero: ");
		int num = teclado.nextInt();
		int numActual = num;
		int numCifras = 1;
		while (numActual/10 != 0) {
			numCifras++; // lo mismo que numCifras++;
			numActual = numActual/10;
		}
		System.out.println("El número " + num + " tiene " + numCifras + " Cifras.");
	}

}
