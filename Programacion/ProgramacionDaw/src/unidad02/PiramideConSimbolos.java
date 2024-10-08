package unidad02;

import java.util.Scanner;

public class PiramideConSimbolos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el caracter para formar la piramide");
		String input = scan.nextLine();
		System.out.println("Introduce el caracter para formar la piramide");
		System.out.println("Introduce el caracter para formar la piramide");
		System.out.println("Introduce el caracter para formar la piramide");
		System.out.println("Introduce el caracter para formar la piramide");
		System.out.println("Introduce el caracter para formar la piramide");
		boolean correcto = false;
		char caracter = 1;
		if (input.length() == 1) {
			caracter = input.charAt(0);
			if (caracter > 'A' && caracter <= 'z') {
				
			} else if (caracter > 'a' && caracter <= 'z') {
				correcto = true;
				
			} else if (caracter > '0' && caracter <= '9') {
				correcto = true;
				
			} else if (caracter == '$' || caracter == '€' || caracter == '+') {
				correcto = true;
			}
			
		} else {
			System.err.print("Solo puedes introducir un carácter");
		}
		if (correcto) {
			String piramide = "  " + caracter + "  " + "\n";
			System.out.println(piramide);
		} else {
			System.err.print("La entrada no es valida");
		}
	}

}
