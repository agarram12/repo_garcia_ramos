package unidad04;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Ej17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce la matrícula");
		String input = scan.nextLine();
		String matricula = input.trim();
		char[] letras = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'O'};
		// validamos la matrícula con regex
		String regexPattern = "[0-9]{4}[B-DF-HJ-NP-TV-Z]{3}";
		if (matricula.matches(regexPattern)) {
			String numeroString = input.substring(0, 4);
			String letrasMatr = input.substring(matricula.length()-3, matricula.length());
			int numero = Integer.parseInt(numeroString);
			if (numero == 9999) {
				
			} else {
				numero++;
				numeroString = rellenarConCeros(numero);
				
			}
		} else {
			System.err.println("La matricula introducida no es válida");
		}
	}
	private static String rellenarConCeros(int numero) {
		String numero4Cifras = String.valueOf(numero);
		while (numero4Cifras.length() < 4) {
			numero4Cifras = "0" + numero4Cifras;
		}
		/*
		 * Otra opción también
		if (numero4Cifras.length() < 4) {
			if (numero4Cifras.length() == 3) {
				numero4Cifras = "0" + numero4Cifras;
			} else if {
			
			}
		}
		*/
		return numero4Cifras;
	}
}