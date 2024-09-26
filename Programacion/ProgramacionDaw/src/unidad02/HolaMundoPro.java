package unidad02;

import java.util.Scanner;

/**
 * si usuario mete nombre == hola mundo
 * si da intro sin nada == hola amigo
 */
public class HolaMundoPro {

	public static void main(String[] args) {
		String nombre;
		String saludo;
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		nombre = scan.nextLine();
		// Cuando el usuario no mete ningún nombre, el valor que guarda es una cadena vacia con ""
		//saludo = nombre != "" ? nombre : "amigo"; --- funciona pero NO debería
		//saludo = "".equals(nombre) ? "amigo" : nombre;
		/*
		 * A la hora de usar .equal las comillas siempre delante, es decir
		 * el valor más seguro siempre irá delante del .equal(stringmenosfuerte);
		*/
		//System.out.println("¡Hola " + saludo + "!");
		/* Versión IF SIMPLE
		if ("".equals(nombre)) {
			nombre = "amigo";
		}
		*/
		//Version IF Compuesto
		if (!"".equals(nombre)) {
			System.out.println("Hola" + nombre + "!");
		} else {
			System.out.println("Hola amigo!");
		}
		scan.close();
	}

}