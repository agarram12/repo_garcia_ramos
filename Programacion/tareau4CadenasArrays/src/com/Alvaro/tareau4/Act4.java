package com.Alvaro.tareau4;

import java.util.Scanner;

public class Act4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// declarar las vocas y consonantes para acceder a ellas.
		char[] vocales = {'a','e','i','o','u','á','é','í','ó','ú'};
		char[] consonantes = {'b','c','d','f','g','h','i','j','k','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z'};
		int n_vocales = 0;
		int n_consonantes = 0;
		StringBuilder nconsonantes = new StringBuilder();
		StringBuilder nvocales = new StringBuilder();
		System.out.println("Introduce cualquier cadena de texto: ");
		// pasarlo a minúscula para que también cuente las introducidas como mayúsculas.
		String input = scan.nextLine().toLowerCase();
		scan.close();
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < vocales.length; j++) {
				if (input.charAt(i) == vocales[j]) {
					n_vocales++;
				}
			}
			for (int j = 0; j < consonantes.length; j++) {
				if (input.charAt(i) == consonantes[j]) {
					n_consonantes++;
				}
			}
		}
		// Mostrar el número de vocales y consonantes
		System.out.println("Cadena introducida: " + input);
		System.out.println("Número de vocales: " + n_vocales);
		System.out.println("Número de consonantes: " + n_consonantes);
	}

}
