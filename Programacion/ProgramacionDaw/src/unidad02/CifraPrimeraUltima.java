package unidad02;

import java.util.Scanner;

public class CifraPrimeraUltima {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		int entero = scan.nextInt();
		System.out.println("\n1-Ver primer número de entero. \n2-Ver último numero del entero.");
		System.out.print("Elige una opción del menú: ");
		boolean correcto= false;
		do {
			int opcion = scan.nextInt();
			switch (opcion) {
			case 1:
				int dividendo = entero;
				int primeraCifra = 0;
				while (dividendo != 0) {
					primeraCifra = dividendo;
					//dividendo = dividendo / 10; lo de abajo es lo mismo
					dividendo /= 10;
				//int primeraCifra = entero / 10;
				//System.out.println("El primer digito es: " + primeraCifra);
				}
				System.out.println("La primera cifra del número " + entero + " es " + primeraCifra);
				break;
			case 2:
				// modular entre 10 siempre dará el último número
				int ultimaCifra = entero % 10;
				System.out.println("La última cifra del número " + entero + " es " + ultimaCifra);
				break;
			default:
				correcto = false;
				System.err.print("¡No has elegido una opción valida, elige 1 o 2!: ");
				break;
			}
		} while (!correcto);
		
		scan.close();
	}

}
