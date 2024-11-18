package unidad04;

import java.util.Iterator;

import org.apache.commons.lang3.StringUtils;

public class FuncionesCadenas {
	public static boolean esPalindromo(String cadena) {
//		boolean esPalindromo = true;
//		int pos = 0;
//		while (pos < cadena.length()/2) {
//			if (cadena.charAt(pos) != cadena.charAt(cadena.length()- 1 - pos)) {
//				esPalindromo = false;
//			}
//			pos++;
//		}
//		
//		return esPalindromo;
		// Otra opción con StringUtils.
		return StringUtils.equals(cadena, StringUtils.reverse(cadena));
	}
	public static int conteoVocales(String cadena) {
		int vocales = 0;
		for(int posicion = 0; posicion < cadena.length(); posicion++ ) {
			if (cadena.charAt(posicion) == 'a' || cadena.charAt(posicion) == 'e' || cadena.charAt(posicion) == 'i' || cadena.charAt(posicion) == 'o' || cadena.charAt(posicion) == 'u') {
				vocales++;
			}
		}
		return vocales;
	}
}
