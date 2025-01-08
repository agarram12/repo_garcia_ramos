package com.Alvaro.tareau4;

import org.apache.commons.lang3.StringUtils;

public class Act2 {

	public static void main(String[] args) {
		// Metodo IsEmpty/IsBlank
		String esVacia = "";
		String esContenido = "¡Hola!";
		System.out.println("**Comprobar si una cadena está vacía");
		System.out.println("La cadena está vacía: "+esVacia.isBlank());
		System.out.println("La cadena está vacía: "+esContenido.isEmpty());
		/*
		 * Como podemos ver IsEmpty o IsBlank es exactamente lo mismo
		 * Nos devuelve True si está vacía y nos devolverá False si cuenta con contenido dentro de la cadena
		 */
		// Metodo Reverse
		System.out.println("**Dar vuelta a una cadena");
		String darVuelta = "Esta cadena aparecerá al revés";
		System.out.println(StringUtils.reverse(darVuelta));
		// Con introducir una cadena con texto, el metodo .reverse le dará la vuelta tal cual.
		// Metodo CountMatches
		String cadena1 = "123456789";
		String cadena2 = "123456789";
		System.out.println("**Comprobar si la cadena es igual");
		System.out.println(StringUtils.countMatches(cadena1, cadena2));
		/*
		 * Tiene que ser exactamente igual y usualmente va acompañado de un regex que nos ayude a validar
		 * Aún así, dependiendo de los digitos o simbolos y el número de ellos, debemos elegir distintas opciones.
		 */
	}
}