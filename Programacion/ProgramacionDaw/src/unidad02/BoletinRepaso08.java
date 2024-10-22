package unidad02;

import java.util.Scanner;

public class BoletinRepaso08 {

	public static void main(String[] args) {
		int mayor = 0;
		int mediano = 0;
		int menor = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		int numero1 = scan.nextInt();
		System.out.println("Introduce otro número entero: ");
		int numero2 = scan.nextInt();
		System.out.println("Introduce otro número entero: ");
		int numero3 = scan.nextInt();
		if (numero1 > numero2) {
			mayor = numero1;
			mediano = numero2;
			if (mayor < numero3) {
				mayor = numero3;
			}
			if (mediano < numero3) {
				menor = numero2;
				mediano = numero3;
			}
		} else {
			mayor = numero2;
			mediano = numero1;
			menor = numero3;
			if (mayor < numero3) {
				mayor = numero3;
				menor = numero2;
				mediano = numero1;
			}
			if (mediano < numero3) {
				mediano = numero3;
				menor = numero2;
			}
		}
		System.out.println(mayor);
		System.out.println(mediano);
		System.out.println(menor);
	}
}
