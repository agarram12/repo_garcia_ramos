package unidad02;

import java.util.Scanner;

public class CuentaAtrasFor {

	public static void main(String[] args) {
		/**
		 * for (int index = 320; index >= 160; index -= 20) {
			System.out.println(index);
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce cuántos números quieres en la serie de Fibonacci: ");
		int n = scan.nextInt();
		String salida ="";
		if (n == 1) {
			salida = "0";
		} else if (n == 2) {
			salida = "0, 1";
		} else {
			salida = "0, 1";
			int f1 = 1;
			int f2 = 0;
			for(int indice = 3;indice <=n;indice++) {
				int nuevo = f1 + f2;
				System.out.println(salida +", " + nuevo);
				f2 = f1;
				f1 = nuevo;
			}
		}
//		System.out.print("Introduce el numero por el que quieres empezar: ");
//		int inicio = scan.nextInt();
//		System.out.print("Introduce el numero por el que quieres acabar: ");
//		int fin = scan.nextInt();
//		System.out.print("Introduce el numero para el incremento: ");
//		int incremento = scan.nextInt();
//		if (inicio >= fin) {
//			for (int index = inicio; index >= fin +1; index -= incremento) {
//				System.out.println(index);
//			}
//		} else {
//			for (int index = inicio; index < fin +1; index += incremento) {
//				System.out.println(index);
//			}
//		}
		
		
		}
	}