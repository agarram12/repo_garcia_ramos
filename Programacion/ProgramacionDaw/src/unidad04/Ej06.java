package unidad04;

import java.util.Scanner;

public class Ej06 {

	public static void main(String[] args) {
		char[] letras = new char[10];
		for (int i = 0; i < letras.length; i++) {
			char random = (char) (Math.random()* 20 + 'a');
			letras[i] = random;
		}
		System.out.println("Introduce la letra a sustituir y la que sustituye separado de un espacio");
		Scanner scan = new Scanner(System.in);
		String cambio = scan.nextLine();
		char caracterSustitucion = cambio.charAt(0);
		char caracterSustituto = cambio.charAt(2);
		for (int i = 0; i < letras.length; i++) {
	//		letras[i] = random;
		}
	}

}
