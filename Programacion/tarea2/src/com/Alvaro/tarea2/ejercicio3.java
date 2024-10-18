package com.Alvaro.tarea2;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = 1;
		int mayorNumero = Integer.MIN_VALUE;
		int suma = 0;
		int contador = 0;
		double media = 0;
		int menorNumero = Integer.MAX_VALUE;
		while (numero > 0) {
			
			System.out.println("Introduce un número (pulsa 0 para salir): ");
			numero = scan.nextInt();
			if (numero == 0) {
				break;
			}
			
			if (numero > mayorNumero) {
				mayorNumero = numero;
			} 
			if (numero < menorNumero) {
				menorNumero = numero;
			}
			suma += numero;
			contador++;
			media = (double) suma / contador;
		}
		scan.close();
		System.out.println("El mayor número es: " + mayorNumero);
		System.out.println("El menor número es: " + menorNumero);
		System.out.println("La suma de todo los números es: " + suma);
		System.out.println("La media de todos los números son: " + media);
		
	}
}