package unidad01;

import java.util.Scanner;

/**
 * Programa que me saluda por el nombre pasado por teclado
 */
public class HolaYo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String nombre = scan.nextLine();
		System.out.print("Introduce tu año de nacimiento: ");
		int anioNacimiento = scan.nextShort();
		int edad = 2024 - anioNacimiento;
		System.out.println("Hola "  + nombre + "! Tienes " + edad + " años!");
		scan.close();
	}

}
