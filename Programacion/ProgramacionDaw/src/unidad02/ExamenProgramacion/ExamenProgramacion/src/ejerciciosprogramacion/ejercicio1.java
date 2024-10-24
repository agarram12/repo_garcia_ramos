package ejerciciosprogramacion;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float notaProg = 0;
		float notaLeng = 0;
		float nota = 0;
		boolean correcto = true;

		do {
			System.out.println("----------------| Grado D. CFGS DAW |----------------\n| 1 - Módulo de Lenguaje de Marcas             |\n| 2 - Módulo de Programación             |\n| 0 - Resumen y salir                    |\n---------------------------------------------------");
			System.out.print("Introduce una opción: ");
			int opcion = entrada.nextInt();
			switch (opcion) {
			case 1:
				System.out.print("Introduce la nota del módulo: ");
				nota = entrada.nextFloat();
				if (nota >= 0 && nota <= 10) {
					notaProg = nota;
				} else {
					System.out.println("Introduce una nota válida.");
				}
				break;
			case 2:
				System.out.print("Introduce la nota del módulo: ");
				nota = entrada.nextFloat();
				if (nota >= 0 && nota <= 10) {
					notaLeng = nota;
				} else {
					System.out.println("Introduce una nota válida.");
				}
				break;
			case 0:
				if (notaProg > 0 && notaProg <= 10) {
				System.out.println("Calificaciones DAW \nMódulo de Programación: " + notaProg);
				} else {
					System.out.println("Calificaciones DAW \nMódulo de Programación: NOEV");
				}
				if (notaLeng > 0 && notaLeng <= 10) {
					System.out.println("Módulo de Programación: " + notaLeng);
					} else {
						System.out.println("Módulo de Lenguaje de Marcas: NOEV");
					} 
				correcto = false;
				break;
			default:
				System.err.println("¡Has introducido una opción invalida!");
				break;
			}
		} while (correcto);
		entrada.close();
	}
}
