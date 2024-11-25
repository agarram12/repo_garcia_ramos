package unidad03;

public class PruebasRegex {

	public static void main(String[] args) {
		String cadena = args[0];
		String patron = args[1];
		checkEjemploRegex(cadena, patron);

	}
	public static void checkEjemploRegex(String cadena, String patron) {
		if (cadena.matches(patron)) {
			System.out.println("Formato correcto.");
		} else {
			System.out.println("Formato incorrecto.");
			
		}
		
	}
}
