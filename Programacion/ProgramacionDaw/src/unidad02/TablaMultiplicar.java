package unidad02;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número para calcular la tabla de multiplicar: ");
		int numero = scan.nextInt();
		scan.close();
		// for declara e inicia la variable con la condicion que se cumple y el incremento
		for (int indice = 0;indice<=10;indice++) {
			System.out.println(numero + " x " + indice + " = " + indice*numero );
		}
	}

}
