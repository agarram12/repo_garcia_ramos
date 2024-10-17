package com.Alvaro.tarea2;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String contrasena = "KLMNAZPO123";
		System.out.print("Introduce la contraseña: ");
		String teclado = scan.nextLine();
		int intento = 3;
		while (intento > 0) {
			if (teclado.equals(contrasena)) {
				System.out.println("¡Bienvenido!");
				break;
			} else {
				intento--;
				if (intento > 0) {
					System.out.print("¡Error! Introduce la contraseña de nuevo: "); 
					teclado = scan.nextLine();
				}
				if (intento == 0) {
					System.err.println("¡Has introducido la contraseña de manera erronea demasiadas veces!");
					break;
				}
			}
		}
		scan.close();
	}
}