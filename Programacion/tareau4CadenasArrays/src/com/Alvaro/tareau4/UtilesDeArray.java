package com.Alvaro.tareau4;
import java.util.Arrays;
public class UtilesDeArray {

	public static void main(String[] args) {
		// Ejemplo método sort
		Integer[] num = {9,3,4,1,2,6,5,7,8};
		Arrays.sort(num);
		System.out.println("**Ejemplo método sort");
		System.out.println(Arrays.toString(num));
		// Ejemplo método binarySearch
		int indice = Arrays.binarySearch(num, 6);
		System.out.println("**Ejemplo método binarySearch");
		System.out.println("El indice es 6 es: "+indice);
		// Ejemplo método equals
		Integer[] numComparar = {8,6,5,7,1,2,3,4,9};
		System.out.println("**Ejemplo método equals");
		System.out.println("¿Son iguales?: "+ Arrays.equals(num, numComparar));
		// Ejemplo método fill
		// Las palabras aparecerán el número de veces que hemos específicado.
		String[] palabrasPrueba = new String[5];
		Arrays.fill(palabrasPrueba, "Array rellenado");
		System.out.println("**Ejemplo método palabrasPrueba");
		System.out.println(Arrays.toString(palabrasPrueba));
		// Ejemplo método copyOf
		Integer[] copiar = Arrays.copyOf(num, 12);
		System.out.println("**Ejemplo método copyOf");
		System.out.println(Arrays.toString(copiar));
		// Ejemplo método toString
		String pasarString = Arrays.toString(num);
		System.out.println("**Ejemplo método toString");
		System.out.println("Cambio a String: " + pasarString);
	}

}
