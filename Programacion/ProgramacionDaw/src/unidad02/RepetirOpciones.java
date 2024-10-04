package unidad02;

import java.util.Scanner;

public class RepetirOpciones {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int repeticiones = 0;
		String direccion = "";
		System.out.println("+ \n* \n$ \n€");
		System.out.print("Selecciona una opción: ");
		String opcion = scan.nextLine();
		switch (opcion) {
		case "+":
			System.out.print("¿Hacía qué dirección quieres que vaya? (abajo o derecha): ");
			direccion = scan.nextLine();
			System.out.print("¿Cuantas veces quieres que se repita? [3-10] ");
			repeticiones = scan.nextInt();
			if (repeticiones > 10 || repeticiones < 3 ) {
				System.err.println("Introduce un número entre 3 y 10 ");
			} else {
				if ("ABAJO".equalsIgnoreCase(direccion)) {
					for (int indice = 1;indice<=repeticiones;indice++) {
						System.out.println(opcion);
					}
				} else if ("DERECHA".equalsIgnoreCase(direccion)){
					for (int indice = 1;indice<=repeticiones;indice++) {
						System.out.print(opcion);
					}
				} else {
					System.err.println("Introduce una dirección valida");
				}
			}
			break;
		case "*":
			System.out.print("¿Hacía qué dirección quieres que vaya? (abajo o derecha): ");
			direccion = scan.nextLine();
			System.out.print("¿Cuantas veces quieres que se repita? [3-10] ");
			repeticiones = scan.nextInt();
			if (repeticiones > 10 || repeticiones < 3 ) {
				System.err.println("Introduce un número entre 3 y 10 ");
			} else {
				if ("ABAJO".equalsIgnoreCase(direccion)) {
					for (int indice = 1;indice<=repeticiones;indice++) {
						System.out.println(opcion);
					}
				} else if ("DERECHA".equalsIgnoreCase(direccion)){
					for (int indice = 1;indice<=repeticiones;indice++) {
						System.out.print(opcion);
					}
				} else {
					System.err.println("Introduce una dirección valida");
				}
			}
			break;
		case "$":
			System.out.print("¿Hacía qué dirección quieres que vaya? (abajo o derecha): ");
			direccion = scan.nextLine();
			System.out.print("¿Cuantas veces quieres que se repita? [3-10] ");
			repeticiones = scan.nextInt();
			if (repeticiones > 10 || repeticiones < 3 ) {
				System.err.println("Introduce un número entre 3 y 10 ");
			} else {
				if ("ABAJO".equalsIgnoreCase(direccion)) {
					for (int indice = 1;indice<=repeticiones;indice++) {
						System.out.println(opcion);
					}
				} else if ("DERECHA".equalsIgnoreCase(direccion)){
					for (int indice = 1;indice<=repeticiones;indice++) {
						System.out.print(opcion);
					}
				} else {
					System.err.println("Introduce una dirección valida");
				}
			}
			break;
		case "€":
			System.out.print("¿Hacía qué dirección quieres que vaya? (abajo o derecha): ");
			direccion = scan.nextLine();
			System.out.print("¿Cuantas veces quieres que se repita? [3-10] ");
			repeticiones = scan.nextInt();
			if (repeticiones > 10 || repeticiones < 3 ) {
				System.err.println("Introduce un número entre 3 y 10 ");
			} else {
				if ("ABAJO".equalsIgnoreCase(direccion)) {
					for (int indice = 1;indice<=repeticiones;indice++) {
						System.out.println(opcion);
					}
				} else if ("DERECHA".equalsIgnoreCase(direccion)){
					for (int indice = 1;indice<=repeticiones;indice++) {
						System.out.print(opcion);
					}
				} else {
					System.err.println("Introduce una dirección valida");
				}
				
			}
			break;
		default:
			System.err.println("¡Elige una opción del menú!");
			break;
		}
	}
}