package unidad03;

import java.util.Iterator;

public class FuncionesMatematicas {
	
	/**
	 * Devuelve true si el número pasado por parámetro es primo
	 * @param numero
	 * @return esPrimo
	 */
	public static boolean esPrimo (long numero) {
		boolean esPrimo = true;

		int divisor = 2;
		while (esPrimo && divisor < numero / 2) {
			if (numero % divisor == 0) {
				esPrimo = false;
			}
			divisor++;
		}
		return esPrimo;
	}
	
	/**
	 * Devuelve el siguiente número primo a partir del parámetro de entrada
	 */
	public static long siguientePrimo(long numero) {
		long siguientePrimo = numero+1;
		boolean encontrado = false;
		while(!encontrado) {
			if (esPrimo(siguientePrimo)) {
				encontrado = true;
				
			} else {
				siguientePrimo++;
			}
		}
		return siguientePrimo;
		}
	public static int digitos(long numero) {
		int numCifras = 1;
		while (numero / 10 != 0) {
			numCifras++;
			numero = numero / 10;
		}
		return numCifras;
	}
	public static boolean esCapicua(long numero) {
		boolean esCapicua = true;
		long numActual = numero;
		int numCifras = digitos(numActual);
		return esCapicua;
		
	}
	public static char letraNif(long dni) {
		String letras = "TRWAGMYFPDXBNJZSQVHLKE";
		int resto = (int) dni % 23;
		char letra = letras.charAt(resto);
		return letra;
	}
	public static boolean compruebaNif(String dni) {
		if (dni.length() < 9) {
			int faltan = 9 - dni.length();
			for (int i = 0; i < faltan; i++) {
				dni = "0" + dni;
			}
		}
		/*
		String numero = "";
		String letra = "";
		numero = dni.substring(0,8);
		letra = dni.substring(8,9);
		numero = Long.parseLong(dni.substring(0))
		 */
		char letra = dni.substring(8).charAt(0);
		long numero = Long.parseLong(dni.substring(0,8));
		boolean correcto = letraNif(numero) == letra;
		return correcto;
		
	}
		
}
