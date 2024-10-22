package unidad02;

import java.util.Scanner;

public class BoletinRepaso01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Por favor introduce el número de horas trabajadas: ");
		int horas = scan.nextInt();
		int sueldo = 0;
		if (horas < 41 && horas > 0) {
			sueldo = horas * 12;
			System.out.println("El sueldo que le corresponde por " + horas + " trabajadas, es de " + sueldo + "€");
		} else if (horas < 0) {
			System.err.println("¡Introduce un número de horas válido!");
		}
		if (horas > 41) {
			sueldo = horas * 16;
			System.out.println("El sueldo que le corresponde por " + horas + " trabajadas, es de " + sueldo + "€");
		}
	}

}
